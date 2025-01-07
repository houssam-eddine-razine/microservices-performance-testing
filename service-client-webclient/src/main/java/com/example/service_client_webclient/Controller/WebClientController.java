package com.example.service_client_webclient.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webclient")
public class WebClientController {
    private final WebClient.Builder webClientBuilder;

    public WebClientController(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    @GetMapping("/{id}")
    public Mono<String> getCarInfo(@PathVariable String id) {
        return webClientBuilder.build()
                .get()
                .uri("http://service-voiture/cars/" + id)
                .retrieve()
                .bodyToMono(String.class);
    }
}
