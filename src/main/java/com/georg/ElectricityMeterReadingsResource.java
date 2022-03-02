package com.georg;

import javax.ws.rs.*;
import java.time.LocalDate;

@Path("/ElectricityMeterReadings")
//употребляет json
@Consumes("application/json")
//отдает json
@Produces("application/json")
//работа с показателями
public class ElectricityMeterReadingsResource implements ElectricityMeterReadingsResourceInterface {
    @Override
    @GET
    //запрос на пол показателей счетчиков по полям
    public Long get(@QueryParam("address") String address,
                    @QueryParam("fullName") String fullName,
                    @QueryParam("date") LocalDate date) {

        return null;
    }

    @Override
    @POST
    public Long post(ElectricityMeterReadings electricityMeterReadings) {

        return null;
    }
}
