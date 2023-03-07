package dev.depressivo.router.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/health")
public class HealthApi {

    private static final Logger LOG = LoggerFactory.getLogger(HealthApi.class);

    @GetMapping
    public Mono<String> health(){
        LOG.info("[HEALTH] Verify Health: OK");
        return Mono.just("OK");
    }

}
