package com.train.usecase;

import java.util.List;
import java.util.Map;

import com.train.model.PassengerBogie;
import com.train.service.AnalyticsService1;
import com.train.service.PassengerService;

public class UC9GroupingBy {

    public void execute() {

        List<PassengerBogie> bogies =
                new PassengerService()
                        .getPassengerBogies();

        Map<String,List<PassengerBogie>>
                grouped =
                new AnalyticsService1()
                        .groupByType(bogies);

        grouped.forEach(
                (type,list) -> {

                    System.out.println(
                            "\n" + type);

                    list.forEach(
                            System.out::println);
                });
    }
}