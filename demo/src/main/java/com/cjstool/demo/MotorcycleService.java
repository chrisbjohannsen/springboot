package com.cjstool.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import java.util.List;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Service
public class MotorcycleService {
    private final MotorcycleRepository motorcycleRepository;
    private final PagedMotorcycleRepository pagedMotorcycleRepository;

    public MotorcycleService(MotorcycleRepository motorcycleRepository, PagedMotorcycleRepository pagedMotorcycleRepository) {
        this.motorcycleRepository = motorcycleRepository;
        this.pagedMotorcycleRepository = pagedMotorcycleRepository;
    }

    public Page<Motorcycle> getPage(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return motorcycleRepository.findAll(pageable);
    }

    public List<Motorcycle> saveList(List<Motorcycle> motorcycles) {
        return motorcycleRepository.saveAllAndFlush(motorcycles);
    }
}

