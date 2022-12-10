package dev.depressivo.router.api;

import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SecurityApi {

    @GetMapping("/client")
    public Mono<OAuth2AuthorizedClient> index(@RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient client){
        return Mono.just(client);
    }

}
