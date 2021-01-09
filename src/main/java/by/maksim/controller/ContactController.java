package by.maksim.controller;

import by.maksim.service.contact.ContactServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactServiceImpl contactService;

    @GetMapping
    public String showForm() {
        return "contact";
    }

    @PostMapping
    public String sendMail(@RequestParam (value = "from") String from,
                           @RequestParam(value = "subject") String subject,
                           @RequestParam(value = "content") String content) {
        return contactService.sendEmail(from, subject, content);
    }
}
