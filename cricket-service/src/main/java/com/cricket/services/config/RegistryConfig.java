package com.cricket.services.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class RegistryConfig extends ResourceConfig {
    public RegistryConfig() {
        packages("com.cricket.services.service");
    }
}
