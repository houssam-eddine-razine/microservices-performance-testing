package com.example.serservice_client_feign.Repo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "service-voiture")
public interface FeignVoitureClient {
    @GetMapping("/cars/{id}")
    String getCarById(@PathVariable String id);
}
