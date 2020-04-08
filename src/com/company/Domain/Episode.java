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

    public String percWatchTime() {
        double watchedTimeDouble = this.watchedTime;
        return (watchedTimeDouble / runTime) * 100 + "%";
    }
}
