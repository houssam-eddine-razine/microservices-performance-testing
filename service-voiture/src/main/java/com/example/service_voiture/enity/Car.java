package com.example.service_voiture.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "cars")
public class Car {
    @Id
    private String id;
    private String model;
    private String owner;

    public Car(String id, String model, String owner) {
        this.id = id;
        this.model = model;
        this.owner = owner;
    }

    // No-args constructor
    public Car() {
    }

    // Getters and Setters (optional if not using Lombok)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
