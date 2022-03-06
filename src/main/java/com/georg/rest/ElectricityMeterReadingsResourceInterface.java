package com.georg.rest;

import com.georg.model.ElectricityMeterReadingsEntity;

public interface ElectricityMeterReadingsResourceInterface {
        //запрос на пол показателей счетчиков по полям
        ElectricityMeterReadingsEntity get(String address,
                                       String fullName,
                                       String date);

    ElectricityMeterReadingsEntity post(ElectricityMeterReadings electricityMeterReadings);
}
