package com.msb.learnspringboot;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CurrencyConfigurationController {
    private CurrencyServiceConfiguration configuration;

    @GetMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveCurrencyConfiguration() {
        return configuration;
    }
}
