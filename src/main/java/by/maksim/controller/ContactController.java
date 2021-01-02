//package by.maksim.controller;
//
//import by.maksim.domain.Contact;
//import by.maksim.service.ContactService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/contact")
//public class ContactController {
//
//    @Autowired
//    private ContactService contactService;
//
//    @Qualifier("getJavaMailSender")
//    @Autowired
//    private JavaMailSender javaMailSender;
//
//    @GetMapping
//    public String contact(ModelMap modelMap) {
//        modelMap.put("contact", new Contact());
//        return "contact";
//    }
//
//    @PostMapping(value = "send")
//    public String send(@ModelAttribute("contact") Contact contact, ModelMap modelMap) throws Exception {
//        String content = "Name: " + contact.getName();
//        content += "<br>Phone: " + contact.getPhone();
//        content += "<br>Address: " + contact.getAddress();
//        contactService.send(contact.getEmail(), "2004softwaredeveloper@gmail.com", contact.getSubject(), content);
//        return "contact";
//    }
//}
