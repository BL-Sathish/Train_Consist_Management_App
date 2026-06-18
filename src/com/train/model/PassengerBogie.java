package com.train.model;

public class PassengerBogie extends Bogie {

    private int capacity;
    private String type;

    public PassengerBogie(
            String bogieId,
            String bogieName,
            String type,
            int capacity) {

        super(bogieId, bogieName);
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