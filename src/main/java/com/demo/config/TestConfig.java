package com.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix= TestConfig.prefix)
public class TestConfig {
  public static final String prefix = "test";

  private String url;

  private String name;

  private String password;

}

