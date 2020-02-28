package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String sayHello(@Value("${welcome.message}") String message) {
        return message;
    }
}