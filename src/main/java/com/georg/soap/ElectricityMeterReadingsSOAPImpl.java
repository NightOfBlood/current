package com.georg.soap;

import com.georg.ElectricityMeterReadingsResourceInterfaceImpl;
import com.georg.model.ElectricityMeterReadingsEntity;
import com.georg.rest.ElectricityMeterReadings;

import javax.inject.Inject;
import javax.jws.WebService;

@WebService(endpointInterface = "com.georg.soap.ElectricityMeterReadingsSOAP")
public class ElectricityMeterReadingsSOAPImpl implements ElectricityMeterReadingsSOAP {
    @Inject
    ElectricityMeterReadingsResourceInterfaceImpl electricityMeterReadingsResourceInterface;
    @Override
    public ElectricityMeterReadingsJAXB get(ElectricityMeterReadingsJAXB electricityMeterReadingsJAXB) {
        ElectricityMeterReadingsJAXB electricityMeterReadingsJAXBResult = new ElectricityMeterReadingsJAXB();
        ElectricityMeterReadingsEntity electricityMeterReadingsEntity = electricityMeterReadingsResourceInterface.get(electricityMeterReadingsJAXB.getAddress(), electricityMeterReadingsJAXB.getFullName(),electricityMeterReadingsJAXB.getDate());
        electricityMeterReadingsJAXBResult.setAddress(electricityMeterReadingsEntity.getAddress());
        electricityMeterReadingsJAXBResult.setFullName(electricityMeterReadingsEntity.getFullName());
        electricityMeterReadingsJAXBResult.setDate(electricityMeterReadingsEntity.getDate());
        electricityMeterReadingsJAXBResult.setElectricityMeterReadings(electricityMeterReadingsEntity.getElectricityMeterReadings() );
        return electricityMeterReadingsJAXBResult;
    }

    @Override
    public ElectricityMeterReadingsJAXB post(ElectricityMeterReadingsJAXB electricityMeterReadingsJAXB) {
        ElectricityMeterReadings electricityMeterReadings = new ElectricityMeterReadings();
        electricityMeterReadings.setAddress(electricityMeterReadingsJAXB.getAddress());
        electricityMeterReadings.setFullName(electricityMeterReadingsJAXB.getFullName());
        electricityMeterReadings.setDate(electricityMeterReadingsJAXB.getDate());
        electricityMeterReadings.setElectricityMeterReadings(electricityMeterReadingsJAXB.getElectricityMeterReadings() );

        ElectricityMeterReadingsJAXB electricityMeterReadingsJAXBResult = new ElectricityMeterReadingsJAXB();
        ElectricityMeterReadingsEntity electricityMeterReadingsEntity = electricityMeterReadingsResourceInterface.post(electricityMeterReadings);
        electricityMeterReadingsJAXBResult.setAddress(electricityMeterReadingsEntity.getAddress());
        electricityMeterReadingsJAXBResult.setFullName(electricityMeterReadingsEntity.getFullName());
        electricityMeterReadingsJAXBResult.setDate(electricityMeterReadingsEntity.getDate());
        electricityMeterReadingsJAXBResult.setElectricityMeterReadings(electricityMeterReadingsEntity.getElectricityMeterReadings() );

        return electricityMeterReadingsJAXBResult;
    }
}
