package com.georg;

import com.georg.model.ElectricityMeterReadingsEntity;
import com.georg.rest.ElectricityMeterReadings;

public interface ElectricityMeterReadingsResourceInterface {
        //запрос на пол показателей счетчиков по полям
        ElectricityMeterReadingsEntity get(String address,
                                       String fullName,
                                       String date);

    ElectricityMeterReadingsEntity post(ElectricityMeterReadings electricityMeterReadings);
}
