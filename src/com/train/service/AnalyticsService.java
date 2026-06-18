package com.train.service;

import com.train.model.PassengerBogie;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnalyticsService {

    public Map<String,List<PassengerBogie>>
    groupByType(
            List<PassengerBogie> bogies) {

        return bogies.stream()
                .collect(
                        Collectors.groupingBy(
                                PassengerBogie::getType));
    }

    public int totalSeats(
            List<PassengerBogie> bogies) {

        return bogies.stream()
                .map(
                        PassengerBogie::getCapacity)
                .reduce(
                        0,
                        Integer::sum);
    }
}