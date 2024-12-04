package com.factory_design_pattern;

import com.factory_design_pattern.service.NotificationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FactoryDesignPatternApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private NotificationService notificationService;


    @Test
    void testNotification() {
        notificationService.sendNotification("sms");
    }

}
