package bo.edu.ucb.demo.Backend.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/integrants")
public class IntegrantsApi{

    @Autowired
    public IntegrantsApi() {
    }
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String fullName() {
        return "- Alejo Gutierrez Jorge Luis\n- Poma Alvil Jamil";
    }

}
