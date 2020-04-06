package com.company.Domain;

import java.util.ArrayList;

public class Series extends Program{
    public ArrayList<Episode> episodes;

    public Series(String title, int duration, Program similarProgram, String genre, String language, int ageIndicator) {
        super(title, duration, similarProgram, genre, language, ageIndicator);
    }
}
