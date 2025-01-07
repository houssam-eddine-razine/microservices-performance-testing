package com.example.service_voiture.CarRepository;

import com.example.service_voiture.enity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, String> {
}
