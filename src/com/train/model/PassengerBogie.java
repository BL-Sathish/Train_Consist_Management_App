package com.train.model;

public class PassengerBogie extends Bogie {

    private int capacity;

    public PassengerBogie(
            String bogieId,
            String bogieName,
            int capacity) {

        super(bogieId, bogieName);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return getBogieId()
                + " "
                + getBogieName()
                + " Capacity="
                + capacity;
    }
}