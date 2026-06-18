package com.train.model;

public class Bogie {

    private String bogieId;
    private String bogieName;

    public Bogie(String bogieId, String bogieName) {
        this.bogieId = bogieId;
        this.bogieName = bogieName;
    }

    public String getBogieId() {
        return bogieId;
    }

    public String getBogieName() {
        return bogieName;
    }

    @Override
    public String toString() {
        return "Bogie{" +
                "bogieId='" + bogieId + '\'' +
                ", bogieName='" + bogieName + '\'' +
                '}';
    }
}