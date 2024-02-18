package com.codecool.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;
    public void sendMail(String firstName, String lastName, String email, String phone, String message) throws MessagingException {

        MimeMessage mimeMailMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMailMessage, true);

        mimeMessageHelper.setFrom("emanuel13.em@gmail.com");
        mimeMessageHelper.setTo("emanuel13.em@gmail.com");

        String emailContent = "Message: " + message + "\nEmail: " + email + "\nPhone: " + phone;

        mimeMessageHelper.setSubject("Sent from " + firstName + lastName);
        mimeMessageHelper.setText(emailContent);

        javaMailSender.send(mimeMailMessage);

        System.out.println("Mail sent successfully");

    }
}