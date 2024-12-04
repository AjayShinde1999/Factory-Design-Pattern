package com.factory_design_pattern.controller;

import com.factory_design_pattern.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/send-notification")
    public ResponseEntity<String> sendNotification(@RequestParam String type) {
        notificationService.sendNotification(type);
        return ResponseEntity.ok("Notification sent successfully");
    }
}
