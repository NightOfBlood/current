package com.georg.soap;

import com.georg.ElectricityMeterReadingsResourceInterface;
import com.georg.model.ElectricityMeterReadingsEntity;
import com.georg.rest.ElectricityMeterReadings;
import com.georg.ElectricityMeterReadingsResourceInterfaceImpl;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public interface ElectricityMeterReadingsSOAP {
    @WebMethod
      ElectricityMeterReadingsJAXB get(ElectricityMeterReadingsJAXB electricityMeterReadingsJAXB);


    @WebMethod
      ElectricityMeterReadingsJAXB post(ElectricityMeterReadingsJAXB electricityMeterReadingsJAXB);
}
