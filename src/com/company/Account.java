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
}

