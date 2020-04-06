package com.company.Domain;

import java.util.ArrayList;
import java.util.Date;

public class Profile {
    private String name;
    private Date dateOfBirth;
    private ArrayList<Program> watchedPrograms;

    public Profile (String name, Date dateOfBirth, ArrayList<Program> watchedPrograms) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.watchedPrograms = watchedPrograms;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public ArrayList<Program> getWatchedPrograms() {
        return watchedPrograms;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", watchedPrograms=" + watchedPrograms +
                '}';
    }
}
