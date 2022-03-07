package com.georg.soap;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ElectricityMeterReadingsJAXB {
   @XmlAttribute private String address;
   @XmlAttribute private String fullName;
   @XmlAttribute private String date;
   @XmlAttribute private Long electricityMeterReadings;

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
