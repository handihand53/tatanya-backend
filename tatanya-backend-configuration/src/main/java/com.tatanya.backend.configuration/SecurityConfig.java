package com.tatanya.backend.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {
  @Bean
  public SecurityWebFilterChain filterChain(ServerHttpSecurity http) {
    return http
      .authorizeExchange()
      .pathMatchers("/about").permitAll()
      .anyExchange()
      .authenticated()
      .and()
      .oauth2Login()
      .and()
      .build();
  }
}
