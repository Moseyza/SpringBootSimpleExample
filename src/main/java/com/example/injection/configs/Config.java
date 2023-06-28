package com.example.injection.configs;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "retrofit-config")
public class Config {
    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    // Setter
    public void setBaseUrl(String newName) {
        this.baseUrl = newName;
    }

}
