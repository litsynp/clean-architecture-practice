package com.litsynp.cleanarchitecture;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "litsynp")
public class AppConfigurationProperties {

    private long transferThreshold = Long.MAX_VALUE;

}
