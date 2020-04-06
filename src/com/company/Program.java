package com.company;

public class Program {
    private String title;
    private int duration;
    private Program similarProgram;
    private String genre;
    private String language;
    private int ageIndicator;



    public Program(String title, int duration, Program similarProgram, String genre, String language, int ageIndicator) {
        this.title = title;
        this.duration = duration;
        this.similarProgram = similarProgram;
        this.genre = genre;
        this.language = language;
        this.ageIndicator = ageIndicator;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Program getSimilarProgram() {
        return similarProgram;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public int getAgeIndicator() {
        return ageIndicator;
    }

    @Override
    public String toString() {
        return "Program{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", similarProgram=" + similarProgram +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                ", ageIndicator=" + ageIndicator +
                '}';
    }
}
