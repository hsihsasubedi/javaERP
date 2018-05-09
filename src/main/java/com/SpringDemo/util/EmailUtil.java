package com.SpringDemo.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

@Autowired
private JavaMailSender mailSender;

public void sendSimpleMessage(String recipient,String emailSubject, String emailBody){
    SimpleMailMessage message=new SimpleMailMessage();
    message.setTo(recipient);
    message.setSubject(emailSubject);
    message.setFrom("sumanadhikari406@gmail.com");
    message.setText(emailBody);
    try {
        mailSender.send(message);
    }

    catch (Exception e) {
        System.out.println(e);
    }


}





}
