package com.cjstool.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/motorcycles")
public class MotorcycleController {

    private final MotorcycleRepository motorcycleRepository;

    public MotorcycleController(MotorcycleRepository motorcycleRepository) {
        this.motorcycleRepository = motorcycleRepository;
    }

    @GetMapping()
    public List<Motorcycle> getMotorcycles() {
        return motorcycleRepository.findAll();
    }

    @PostMapping
    public void createMotorcycle(@RequestBody Motorcycle motorcycle) {
        motorcycleRepository.saveAndFlush(motorcycle);
    }
}

