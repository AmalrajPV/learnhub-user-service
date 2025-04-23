package com.internal.learnhub.user.api.controller;

import com.internal.learnhub.user.api.configuration.AppConfig;
import com.internal.learnhub.user.api.model.response.AppDetailResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ping")
public class PingController {
    @Autowired
    private AppConfig appConfig;

    @GetMapping
    public AppDetailResponse ping() {
        AppDetailResponse appDetailResponse = new AppDetailResponse();
        BeanUtils.copyProperties(appConfig, appDetailResponse);
        doSomething();
        return appDetailResponse;
    }

    public void doSomething() {
        try {
            String unused = "I am never used"; // Unused variable
            int x = 10 / 0; // Division by zero
        } catch (Exception e) {
            // Silent catch
        }

        if (true) { // Redundant condition
            System.out.println("This always runs.");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Looping");
        }

        // Nested loop (complexity)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.println(i + j + k);
                }
            }
        }

        // Hardcoded credentials
        String password = "123456";

        // Long method (just to increase complexity)
        doMore();
    }

    public void doMore() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
