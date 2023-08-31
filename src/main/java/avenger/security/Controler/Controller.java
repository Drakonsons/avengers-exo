package avenger.security.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/login")
    public String login() {
        return "Please login";
    }

    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers... Assemble!";
    }

    @GetMapping("/secret-bases")
    public String secretBases() {
        return "New York, Washington D.C., Sokovia, London, Lagos, Nigeria, Johannesburg, South Africa, Novi Grad";
    }

    
}
