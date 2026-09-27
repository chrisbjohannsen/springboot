package com.cjstool.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MotorcycleRepository
    extends JpaRepository<Motorcycle, String> {

}
