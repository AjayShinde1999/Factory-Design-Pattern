package com.factory_design_pattern.service;

import org.springframework.stereotype.Service;

@Service
public class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}
