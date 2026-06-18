package com.train.app;

import com.train.usecase.*;

public class TrainApplication {

    public static void main(String[] args) {

        new UC1InitializeTrain().execute();

        new UC2PassengerBogie().execute();
        
        new UC3HashSetBogie().execute();
        
        new UC4LinkedListBogie().execute();
        
        new UC5LinkedHashSetBogie().execute();
    }
}