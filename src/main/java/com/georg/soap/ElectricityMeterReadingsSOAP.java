package com.georg.soap;

import com.georg.ElectricityMeterReadingsResourceInterface;
import com.georg.model.ElectricityMeterReadingsEntity;
import com.georg.rest.ElectricityMeterReadings;
import com.georg.rest.ElectricityMeterReadingsResourceInterfaceImpl;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ElectricityMeterReadingsSOAP implements ElectricityMeterReadingsResourceInterface {
    @Inject
    public ElectricityMeterReadingsResourceInterfaceImpl electricityMeterReadingsResourceInterface;
    @WebMethod
    @Override
    public ElectricityMeterReadingsEntity get(String address, String fullName, String date) {
        return electricityMeterReadingsResourceInterface.get(address, fullName, date);
    }

    @WebMethod
    @Override
    public ElectricityMeterReadingsEntity post(ElectricityMeterReadings electricityMeterReadings) {
        return electricityMeterReadingsResourceInterface.post(electricityMeterReadings);
    }
}
