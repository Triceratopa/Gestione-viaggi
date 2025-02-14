package com.progettoSettimanale.Gestione.viaggi.cloudinary;

import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class Cloudinary {
    @Value( "daurnpv9v")
    private String cloudName;
    @Value
    private String apiKey;
    @Value
    private String apiSecret;

    @Bean
    public Cloudinary cloudinary() {
        Map<String, String> config = new HashMap<>();
        config.put("cloud_name", cloudName);
        config.put("api_key", apiKey);
        config.put("api_secret",apiSecret);
        return new Cloudinary(config);
    }
}
