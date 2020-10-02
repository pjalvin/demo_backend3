package bo.edu.ucb.demo.Backend.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/hello")
public class HelloWorldApi {

    @Autowired
    public HelloWorldApi() {
    }
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String hello() {
        return "HOLA MUNDO";
    }

    @RequestMapping(value = "/dos", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String helloTwo() {
        return "DOS HOLA";
    }
}
