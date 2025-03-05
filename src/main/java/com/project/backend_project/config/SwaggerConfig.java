package com.project.backend_project.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi backendProject() {
        return GroupedOpenApi.builder()
                .group("backend-project")
                .pathsToExclude("/health")
                .pathsToMatch("/**")
                .build();
    }
}
