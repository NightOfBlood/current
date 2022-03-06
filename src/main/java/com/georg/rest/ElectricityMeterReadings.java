package com.georg.rest;

import java.time.LocalDate;

// Post ElectricityMeterReadings
public class ElectricityMeterReadings {
    private String address;
    private String fullName;
    private String date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getElectricityMeterReadings() {
        return electricityMeterReadings;
    }

    public void setElectricityMeterReadings(Long electricityMeterReadings) {
        this.electricityMeterReadings = electricityMeterReadings;
    }
}
