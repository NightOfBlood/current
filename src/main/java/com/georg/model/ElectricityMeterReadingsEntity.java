package com.georg.model;



import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class ElectricityMeterReadingsEntity extends PanacheEntity {
    private String address;
    private String fullName;
    private LocalDate date;
    private Long electricityMeterReadings;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getElectricityMeterReadings() {
        return electricityMeterReadings;
    }

    public void setElectricityMeterReadings(Long electricityMeterReadings) {
        this.electricityMeterReadings = electricityMeterReadings;
    }
}
