package com.company.Domain;

import java.util.ArrayList;

public class Account {
    private String name;
    private String streetname;
    private int houseNumber;
    private String addition;
    private String city;
    private ArrayList<Profile> profiles;

    public Account(String name, String streetname, int houseNumber, String addition, String City, ArrayList<Profile> profiles) {
        this.name = name;
        this.streetname = streetname;
        this.houseNumber = houseNumber;
        this.addition = addition;
        this.city = City;
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

    public String getCity() {
        return city;
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
                ", city='" + city + '\'' +
                ", profiles=" + profiles +
                '}';
    }
}

