package bo.edu.ucb.demo.Backend.api;

import bo.edu.ucb.demo.Backend.bl.InscripcionBl;
import bo.edu.ucb.demo.Backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/student")
public class StudentApi {
    private InscripcionBl inscripcionBl;

    @Autowired
    public StudentApi(InscripcionBl inscripcionBl) {
        this.inscripcionBl = inscripcionBl;
    }

    @RequestMapping(method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public Student create(@RequestBody Student student){
        return inscripcionBl.createStudent(student);
    }

    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Student find(@RequestParam Integer id){
        return inscripcionBl.findStudentByPK(id);
    }

    @RequestMapping(method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public Student update(@RequestBody Student student){
        return inscripcionBl.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String delete(@RequestParam Integer id){
        return inscripcionBl.deleteStudent(id);
    }

}
