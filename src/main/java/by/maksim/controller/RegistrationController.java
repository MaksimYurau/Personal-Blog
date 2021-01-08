package by.maksim.controller;

import by.maksim.domain.Role;
import by.maksim.domain.User;
import by.maksim.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
@Slf4j
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private UserServiceImpl userService;

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> model) {
        User userFromDb = userRepository.findByUsername(user.getUsername());

        if (userFromDb != null) {
            model.put("message", "User exists!");
            return "registration";
        }

        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER)); //ADMIN
        userRepository.save(user);
        log.info("User was registered successfully. ");
        return "redirect:/login";
    }
}
