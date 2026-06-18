package com.train.model;

import com.train.exception.InvalidCapacityException;

public class PassengerBogie extends Bogie {

    private int capacity;
    private String type;

    public PassengerBogie(
            String bogieId,
            String bogieName,
            String type,
            int capacity)
            throws InvalidCapacityException {

        super(
                bogieId,
                bogieName);

        if (capacity <= 0) {

            throw new InvalidCapacityException(
                    "Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {

        return getBogieId()
                + " "
                + getBogieName()
                + " "
                + type
                + " Capacity="
                + capacity;
    }
}