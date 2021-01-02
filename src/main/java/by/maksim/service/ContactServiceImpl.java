//package by.maksim.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Service;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//import java.util.Date;
//
//@Service("contactService")
//public class ContactServiceImpl implements ContactService {
//
//    @Qualifier("getJavaMailSender")
//    @Autowired
//    private JavaMailSender javaMailSender;
//
//    @Override
//    public void send(String fromAddress, String toAddress, String subject, String content) throws MessagingException {
//        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
//        mimeMessageHelper.setFrom(fromAddress);
//        mimeMessageHelper.setTo(toAddress);
//        mimeMessageHelper.setSubject(subject);
//        mimeMessageHelper.setText(content, true);
//        mimeMessageHelper.setSentDate(new Date());
//        javaMailSender.send(mimeMessage);
//    }
//}
