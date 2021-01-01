package by.maksim.controller;

import by.maksim.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorizationController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/authorization")
    public String authorization() {
        return "authorization";
    }
}
