package com.train.usecase;

import com.train.service.AnalyticsService1;
import com.train.service.PassengerService;

public class UC10ReduceTotalSeats {

    public void execute() {

        int totalSeats =
                new AnalyticsService1()
                        .totalSeats(
                                new PassengerService()
                                        .getPassengerBogies());

        System.out.println(
                "Total Seats = "
                        + totalSeats);
    }
}