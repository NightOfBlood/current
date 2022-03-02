package com.georg;

import com.georg.model.ElectricityMeterReadingsEntity;

import java.time.LocalDate;

public class ElectricityMeterReadingsResourceInterfaceImpl implements ElectricityMeterReadingsResourceInterface {
    @Override
    public Long get(String address, String fullName, LocalDate date) {
        // ищем поля
        return ElectricityMeterReadingsEntity.<ElectricityMeterReadingsEntity>find("address =" + address + " and "
                + "fullName=" + fullName + " and "
                + "date=" + date).firstResult().getElectricityMeterReadings();
    }

    @Override
    public Long post(ElectricityMeterReadings electricityMeterReadings) {
        //создание объекта и запись
        ElectricityMeterReadingsEntity electricityMeterReadingsEntity = new ElectricityMeterReadingsEntity();
        electricityMeterReadingsEntity.setAddress(electricityMeterReadings.getAddress());
        electricityMeterReadingsEntity.setFullName(electricityMeterReadings.getFullName());
        electricityMeterReadingsEntity.setDate(electricityMeterReadings.getDate());
        electricityMeterReadingsEntity.setElectricityMeterReadings(electricityMeterReadings.getElectricityMeterReadings());
        electricityMeterReadingsEntity.persistAndFlush();

        return electricityMeterReadingsEntity.getElectricityMeterReadings();
    }
}
