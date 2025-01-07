package com.example.service_client_resttemplate.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/resttemplate")
public class RestTemplateClientController {
    private final RestTemplate restTemplate;

    public RestTemplateClientController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getCarInfo(@PathVariable String id) {
        String url = "http://service-voiture/cars/" + id;
        return restTemplate.getForEntity(url, String.class);
    }
}
