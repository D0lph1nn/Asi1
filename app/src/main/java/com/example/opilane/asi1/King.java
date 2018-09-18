package com.example.opilane.asi1;
// Lihtne mudeli klass, kus saame oma andmed
public class King {

    private String name;
    private int from, to;

    // Constructor
    public King(String name, int from, int to) {
        this.name = name;
        this.from = from;
        this.to = to;
    }

    public String getName() {
        return name;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public String toString() {
        return name;
    }
}
