package com.train.app;

import com.train.usecase.*;

public class TrainApplication {

    public static void main(String[] args) {

        new UC1InitializeTrain().execute();

        new UC2PassengerBogie().execute();
        
        new UC3HashSetBogie().execute();
        
        new UC4LinkedListBogie().execute();
        
        new UC5LinkedHashSetBogie().execute();
        
        new UC6HashMapCapacity().execute();
        new UC7ComparatorSorting().execute();
        new UC8StreamFiltering().execute();
        new UC9GroupingBy().execute();
        new UC10ReduceTotalSeats().execute();
        
        new UC11RegexValidation().execute();
        new UC12SafetyCompliance().execute();
        new UC13PerformanceBenchmark().execute();
        new UC14CustomException().execute();
        new UC15TryCatchFinally().execute();
    }
}