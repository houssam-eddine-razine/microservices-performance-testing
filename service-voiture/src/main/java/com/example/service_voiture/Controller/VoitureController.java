package com.example.service_voiture.Controller;

import com.example.service_voiture.CarRepository.CarRepository;
import com.example.service_voiture.enity.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/cars")
public class VoitureController {
    private final CarRepository carRepository;

    public VoitureController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable String id) {
        return carRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        return ResponseEntity.ok(carRepository.save(car));
    }
}
