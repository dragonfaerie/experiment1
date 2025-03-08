package com.example.demo.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfig {
    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .cors { } // Enable CORS
            .csrf { it.disable() } // Disable CSRF for local dev
            .authorizeHttpRequests { auth ->
                auth.anyRequest().permitAll() // Allow all requests for now
            }

        return http.build()
    }
}
