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

    
}
