package com.georg.assyn;

import com.georg.ElectricityMeterReadingsResourceInterfaceImpl;
import com.georg.model.ElectricityMeterReadingsEntity;
import com.georg.rest.ElectricityMeterReadings;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.concurrent.CompletableFuture;

@Path("/ElectricityMeterReadingsAssyn")
//употребляет json
@Consumes("application/json")
//отдает json
@Produces("application/json")

public class ElectricityMeterReadingsAssyn {
    @Inject
    public ElectricityMeterReadingsResourceInterfaceImpl electricityMeterReadingsResourceInterface;

    @GET
    //запрос на пол показателей счетчиков по полям
    public Uni<ElectricityMeterReadingsEntity> get(@QueryParam("address") String address,
                                                   @QueryParam("fullName") String fullName,
                                                   @QueryParam("date") String date) {
        return Uni.createFrom().item(electricityMeterReadingsResourceInterface.get(address, fullName, date));
    }


    @POST
    public Uni<ElectricityMeterReadingsEntity> post(ElectricityMeterReadings electricityMeterReadings) {
    return Uni.createFrom().item(electricityMeterReadingsResourceInterface.post(electricityMeterReadings));
    }

    @POST
    @Path("/completableFuture")
    public CompletableFuture<ElectricityMeterReadingsEntity> postCompletableFuture(ElectricityMeterReadings electricityMeterReadings) {
        return CompletableFuture.supplyAsync(() -> electricityMeterReadingsResourceInterface.post(electricityMeterReadings));
    }
}
