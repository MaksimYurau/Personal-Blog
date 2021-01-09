package by.maksim.service.contact;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ContactServiceImpl implements ContactService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public String sendEmail(String from, String subject, String content) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom(from);
        msg.setTo("@gmail.com");
        msg.setSubject(subject);
        msg.setText(content);
        javaMailSender.send(msg);
        log.info("Email sent successful!");
        return "redirect:/";
    }
}
