package com.train.usecase;

import com.train.model.PassengerBogie;
import com.train.service.PassengerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UC6HashMapCapacity {

    public void execute() {

        List<PassengerBogie> bogies =
                new PassengerService()
                        .getPassengerBogies();

        Map<String,Integer> map =
                new HashMap<>();

        for (PassengerBogie bogie : bogies) {

            map.put(
                    bogie.getBogieId(),
                    bogie.getCapacity());
        }

        map.forEach(
                (k,v) ->
                        System.out.println(
                                k + " -> " + v));
    }
}