package de.telran;

public class Result {

    private String name;
    private int duration;

    public Result(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

}
