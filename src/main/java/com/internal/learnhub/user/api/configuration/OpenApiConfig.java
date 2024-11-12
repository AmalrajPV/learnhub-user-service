package com.internal.learnhub.user.api.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import lombok.Data;
import org.springdoc.core.configuration.SpringDocUIConfiguration;
import org.springdoc.core.properties.SwaggerUiConfigParameters;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("config.swagger")
public class OpenApiConfig {
    private String title;
    private String description;
    private String version;
    private String name;
    private String email;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title(title)
                .description(description)
                .version(version)
                .contact(new Contact()
                    .name(name)
                    .email(email)
                ));
    }
}
