package by.maksim.controller;

import by.maksim.domain.User;
import by.maksim.repository.UserRepository;
import by.maksim.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(String username, String password, String name) {
        userService.addUser(username, password, name);
        return "redirect:/login";
    }
}
