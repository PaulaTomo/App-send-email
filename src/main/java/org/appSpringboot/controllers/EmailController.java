package org.appSpringboot.controllers;

import org.appSpringboot.model.EmailDetails;
import org.appSpringboot.services.interfaces.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {


    private final EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody EmailDetails details) {
        String status = emailService.sendEmail(details);
        return status;
    }

    @PostMapping("/sendMailWithAttachment")
    public String sendEmailWithAttachment(@RequestBody EmailDetails details) {
        String status = emailService.sendMailWitAttachment(details);
        return status;
    }
}
