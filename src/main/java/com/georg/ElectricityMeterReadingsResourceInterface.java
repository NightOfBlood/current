package com.georg;

import java.time.LocalDate;

public interface ElectricityMeterReadingsResourceInterface {
        //запрос на пол показателей счетчиков по полям
    Long get( String address,
              String fullName,
              LocalDate date);

    Long post(ElectricityMeterReadings electricityMeterReadings);
}
