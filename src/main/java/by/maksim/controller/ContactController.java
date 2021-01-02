package by.maksim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

    @Qualifier("getJavaMailSender")
    @Autowired
    private JavaMailSender javaMailSender;

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }


}
