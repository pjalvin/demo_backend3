package bo.edu.ucb.demo.Backend.bl;

import bo.edu.ucb.demo.Backend.dao.StudentRepository;
import bo.edu.ucb.demo.Backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InscripcionBl {
    private StudentRepository studentRepository;
    @Autowired
    public InscripcionBl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student createStudent(Student student){
        Student result=this.studentRepository.save(student);
        return result;
    }
    public Student updateStudent(Student student){
        Student result=this.studentRepository.save(student);
        return result;
    }
    public Student findStudentByPK(Integer studentId){
        Optional<Student> result=this.studentRepository.findById(studentId);
        if(result.isPresent()){
            return result.get();
        }
        else{
            throw new RuntimeException("No existe un estudiante con esa llave primaria");
        }
    }

    public String deleteStudent(Integer studentId){
        this.studentRepository.deleteById(studentId);
        return "Se elimino al estudiante";
    }
}
