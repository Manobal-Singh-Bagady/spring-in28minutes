package com.msb.learnspringboot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "currency-service")
public class CurrencyServiceConfiguration {
    private String url;
    private String username;
    private String key;
}
