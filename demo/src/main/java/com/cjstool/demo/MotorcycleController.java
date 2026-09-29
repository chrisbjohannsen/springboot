package com.cjstool.demo;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/motorcycles")
public class MotorcycleController {

    private final MotorcycleService motorcycleService;

    public MotorcycleController( MotorcycleService motorcycleService) {
        this.motorcycleService = motorcycleService;
    }

    @GetMapping()
    @CrossOrigin(origins = "http://localhost:4200")
    public Page<Motorcycle> getMotorcycles(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size
    ) {
       return motorcycleService.getPage(page, size);
    }


    @PostMapping()
    public List<Motorcycle> saveMotorcycles(@RequestBody List<Motorcycle> motorcycles) {
        return motorcycleService.saveList(motorcycles);
    }
}

