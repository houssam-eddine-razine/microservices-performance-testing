package com.example.service_voiture.CarRepository;


import com.example.service_voiture.enity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CarRepository extends JpaRepository<Car, String> {
}
