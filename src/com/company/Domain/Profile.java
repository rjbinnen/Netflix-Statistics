package com.company.Domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Profile {
    private String name;
    private LocalDate dateOfBirth;
    private ArrayList<Program> watchedPrograms;

    public Profile (String name, LocalDate dateOfBirth, ArrayList<Program> watchedPrograms) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.watchedPrograms = watchedPrograms;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
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
