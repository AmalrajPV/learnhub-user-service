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
        return appDetailResponse;
    }
}
