package com.company;

import java.util.ArrayList;

public class Account {
    private String name;
    private String streetname;
    private String addition;
    private String residence;
    private ArrayList<Profile> profiles;

    public Account(String name, String streetname, String addition, String residence, ArrayList<Profile> profiles) {
        this.name = name;
        this.streetname = streetname;
        this.addition = addition;
        this.residence = residence;
        this.profiles = profiles;
    }

    public void addProfile(Profile profile) {
        profiles.add(profile);
    }

    public void deleteProfile(Profile profile) {
        profiles.remove(profile);
    }

    public String getName() {
        return name;
    }

    public String getStreetname() {
        return streetname;
    }

    public String getAddition() {
        return addition;
    }

    public String getResidence() {
        return residence;
    }

    public ArrayList<Profile> getProfiles() {
        return profiles;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", streetname='" + streetname + '\'' +
                ", addition='" + addition + '\'' +
                ", residence='" + residence + '\'' +
                ", profiles=" + profiles +
                '}';
    }
}

