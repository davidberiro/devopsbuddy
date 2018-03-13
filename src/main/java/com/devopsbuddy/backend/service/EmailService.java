package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;

/**
 * Contract for email service
 */
public interface EmailService {

    /**
     * sends email with content in feedback pojo
     * @param feedbackPojo
     */
    public void sendFeedbackEmail(FeedbackPojo feedbackPojo);

    /**
     * Sends an email with the content of the simple mail message object
     * @param message - object containing email content
     */
    public void sendGenericEmailMessage(SimpleMailMessage message);
}
