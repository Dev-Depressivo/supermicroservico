package dev.depressivo.router.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/health")
public class HealthApi {

    @GetMapping
    public Mono<String> health(){
        return Mono.just("OK");
    }

}
