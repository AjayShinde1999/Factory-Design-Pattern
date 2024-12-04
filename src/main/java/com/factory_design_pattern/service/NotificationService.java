package com.factory_design_pattern.service;

import com.factory_design_pattern.factory.NotificationFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private NotificationFactory notificationFactory;

    public void sendNotification(String type) {
        Notification notification = notificationFactory.createNotification(type);
        notification.notifyUser();
    }
}
