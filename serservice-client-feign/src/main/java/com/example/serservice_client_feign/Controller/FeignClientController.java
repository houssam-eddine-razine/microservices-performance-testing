package com.example.serservice_client_feign.Controller;


import com.example.serservice_client_feign.Repo.FeignVoitureClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feign")
public class FeignClientController {
    private final FeignVoitureClient feignVoitureClient;

    public FeignClientController(FeignVoitureClient feignVoitureClient) {
        this.feignVoitureClient = feignVoitureClient;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getCarInfo(@PathVariable String id) {
        return ResponseEntity.ok(feignVoitureClient.getCarById(id));
    }
}
