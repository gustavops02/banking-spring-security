package com.gustavo.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) ->
                requests
                .requestMatchers("/api/account/**", "/api/balance/**", "/api/loans/**", "/api/cards/**").authenticated()
                .requestMatchers("/api/notices/**", "/api/contacts/**").permitAll()
                .anyRequest().authenticated())
                .formLogin(withDefaults()).httpBasic(withDefaults());
        return http.build();
    }

}
