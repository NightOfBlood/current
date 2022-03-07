package com.georg.rest;

import com.georg.ElectricityMeterReadingsResourceInterface;
import com.georg.model.ElectricityMeterReadingsEntity;

import javax.inject.Inject;
import javax.ws.rs.*;

@Path("/ElectricityMeterReadings")
//употребляет json
@Consumes("application/json")
//отдает json
@Produces("application/json")
//работа с показателями
public class ElectricityMeterReadingsResource implements ElectricityMeterReadingsResourceInterface {
    @Inject
    public  ElectricityMeterReadingsResourceInterfaceImpl electricityMeterReadingsResourceInterface;
    @Override
    @GET
    //запрос на пол показателей счетчиков по полям
    public ElectricityMeterReadingsEntity get(@QueryParam("address") String address,
                                              @QueryParam("fullName") String fullName,
                                              @QueryParam("date") String date) {

        return electricityMeterReadingsResourceInterface.get(address,fullName,date);
    }

    @Override
    @POST
    public ElectricityMeterReadingsEntity post(ElectricityMeterReadings electricityMeterReadings) {

        return electricityMeterReadingsResourceInterface.post(electricityMeterReadings);
    }
}
