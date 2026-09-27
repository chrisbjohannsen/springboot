package com.cjstool.demo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Motorcycle {
    @Id
    private String vin;
    private String make;
    private String model;
    private int year;

    public Motorcycle() {
    }

    public Motorcycle(String vin, String make, String model, int year) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Motorcycle that)) return false;
        return getYear() == that.getYear() && Objects.equals(getVin(), that.getVin()) && Objects.equals(getMake(), that.getMake()) && Objects.equals(getModel(), that.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVin(), getMake(), getModel(), getYear());
    }
}
