package com.codecool.controller;
import com.codecool.model.EmailData;
import com.codecool.service.EmailSenderService;
import jakarta.mail.MessagingException;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/email")
public class EmailSenderController {

    @Autowired
    private EmailSenderService emailSenderService;



    @PostMapping("/send")
    public void triggerEmail(@RequestBody EmailData emailData) throws MessagingException {
        emailSenderService.sendMail(emailData.getfirstName(),emailData.getlastName(), emailData.getEmail(),emailData.getPhone(), emailData.getMessage());
    }
}