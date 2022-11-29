package dev.depressivo.router.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain configure(ServerHttpSecurity httpSecurity){
        return httpSecurity
                .csrf().disable()
                .cors().disable()
                .authorizeExchange()
                .pathMatchers("/about").permitAll()
                .anyExchange().authenticated()
                .and().oauth2Login()
                .and().formLogin()
                .and().build();
    }

}
