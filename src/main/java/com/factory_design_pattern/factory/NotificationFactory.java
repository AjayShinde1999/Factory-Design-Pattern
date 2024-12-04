package com.factory_design_pattern.factory;

import com.factory_design_pattern.service.EmailNotification;
import com.factory_design_pattern.service.Notification;
import com.factory_design_pattern.service.SMSNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class NotificationFactory {

    @Autowired
    private ApplicationContext context;

    public Notification createNotification(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return context.getBean(EmailNotification.class);
            case "sms":
                return context.getBean(SMSNotification.class);
            default:
                throw new IllegalArgumentException();
        }
    }

}
