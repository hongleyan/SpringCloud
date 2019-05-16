package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import demo.User;

@RestController
public class UserController {
    
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/hello")
    public String getUser() {
        return this.restTemplate.getForObject("http://localhost:8000/hello", String.class);
    }
}
