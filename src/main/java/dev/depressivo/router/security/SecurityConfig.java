package dev.depressivo.router.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
@Configuration
public class SecurityConfig {

    private static final Logger LOG = LoggerFactory.getLogger(SecurityConfig.class);

    @Bean
    public SecurityWebFilterChain configure(ServerHttpSecurity httpSecurity){
        LOG.info("Configurando padroes de autenticacao.");

        return httpSecurity
                .csrf().disable()
                .cors().disable()
                .authorizeExchange()
                .pathMatchers("/health").permitAll()
                .anyExchange().authenticated()
                .and().oauth2Login()
                .and().build();
    }

}
