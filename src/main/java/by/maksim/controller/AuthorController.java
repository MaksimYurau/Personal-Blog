package by.maksim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorController {

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Об авторе");
        return "about";
    }
}
