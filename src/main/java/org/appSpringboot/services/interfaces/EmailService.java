package org.appSpringboot.services.interfaces;

import org.appSpringboot.model.EmailDetails;

public interface EmailService {
    String sendEmail(EmailDetails details);

    String sendMailWitAttachment(EmailDetails details);
}
