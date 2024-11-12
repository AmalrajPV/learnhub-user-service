package com.internal.learnhub.user.api.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "config.app")
public class AppConfig {
    private String appName;
    private String version;
}
