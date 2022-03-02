package com.georg;

import java.time.LocalDate;
// Post ElectricityMeterReadings
public class ElectricityMeterReadings {
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

        private String address;
private String fullName;
private LocalDate date;
private Long electricityMeterReadings;
}
