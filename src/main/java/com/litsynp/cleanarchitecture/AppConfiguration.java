package com.litsynp.cleanarchitecture;

import com.litsynp.cleanarchitecture.account.application.service.MoneyTransferProperties;
import com.litsynp.cleanarchitecture.account.domain.Money;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AppConfigurationProperties.class)
public class AppConfiguration {

    @Bean
    public MoneyTransferProperties moneyTransferProperties(AppConfigurationProperties appConfigurationProperties) {
        return new MoneyTransferProperties(Money.of(appConfigurationProperties.getTransferThreshold()));
    }

}
