package com.georg.rest;

import com.georg.ElectricityMeterReadingsResourceInterface;
import com.georg.model.ElectricityMeterReadingsEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class ElectricityMeterReadingsResourceInterfaceImpl implements ElectricityMeterReadingsResourceInterface {
    @Override
    @Transactional
    public ElectricityMeterReadingsEntity get(String address, String fullName, String date) {
        // ищем поля
        return ElectricityMeterReadingsEntity.<ElectricityMeterReadingsEntity>find("address =" + address + " and "
                + "fullName=" + fullName + " and "
                + "date=" + date).firstResult();
    }

    @Override
    @Transactional
    public ElectricityMeterReadingsEntity post(ElectricityMeterReadings electricityMeterReadings) {
        //создание объекта и запись
        ElectricityMeterReadingsEntity electricityMeterReadingsEntity=get(electricityMeterReadings.getAddress(), electricityMeterReadings.getFullName(), electricityMeterReadings.getDate());
        if(electricityMeterReadingsEntity!=null){
            electricityMeterReadingsEntity.setAddress(electricityMeterReadings.getAddress());
            electricityMeterReadingsEntity.setFullName(electricityMeterReadings.getFullName());
            electricityMeterReadingsEntity.setDate(electricityMeterReadings.getDate());
            electricityMeterReadingsEntity.setElectricityMeterReadings(electricityMeterReadings.getElectricityMeterReadings());
            electricityMeterReadingsEntity.persistAndFlush();
        }else {
            electricityMeterReadingsEntity = new ElectricityMeterReadingsEntity();
            electricityMeterReadingsEntity.setAddress(electricityMeterReadings.getAddress());
            electricityMeterReadingsEntity.setFullName(electricityMeterReadings.getFullName());
            electricityMeterReadingsEntity.setDate(electricityMeterReadings.getDate());
            electricityMeterReadingsEntity.setElectricityMeterReadings(electricityMeterReadings.getElectricityMeterReadings());
            electricityMeterReadingsEntity.persistAndFlush();
        }
        return electricityMeterReadingsEntity;
    }
}
