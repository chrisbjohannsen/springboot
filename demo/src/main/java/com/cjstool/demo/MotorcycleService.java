package com.cjstool.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorcycleService {
    private final MotorcycleRepository motorcycleRepository;

    public MotorcycleService(MotorcycleRepository motorcycleRepository) {
        this.motorcycleRepository = motorcycleRepository;
    }

    public List<Motorcycle> getAll() {
        return motorcycleRepository.findAll();
    }
}

