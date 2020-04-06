package com.company;

import java.util.ArrayList;

public class Serie extends Program{
    public ArrayList<Episode> episodes;

    public Serie(String title, int duration, Program similarProgram, String genre, String language, int ageIndicator, ArrayList<Episode> episodes) {
        super(title, duration, similarProgram, genre, language, ageIndicator);
        this.episodes = episodes;
    }

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }
}
