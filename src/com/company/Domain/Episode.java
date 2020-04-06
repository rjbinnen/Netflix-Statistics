package com.company.Domain;

public class Episode {

    private int serialNumber;
    private int runTime;
    private int watchedTime;

    public Episode(int serialNumber, int runTime, int watchedTime) {
        this.serialNumber = serialNumber;
        this.runTime = runTime;
        this.watchedTime = watchedTime;
    }

    public double percWatchTime(int runTime, int watchedTime) {
        return -1;
    }
}
