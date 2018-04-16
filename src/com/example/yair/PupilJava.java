package com.example.yair;

public final class PupilJava {
    private String name;
    private static int counter;
    private static void count() {counter++;}
    public static int howMany() { return counter;}

    public final String getName() {
        return this.name;
    }
    public final void setName(String var1) {
        this.name = var1;
    }

    public PupilJava(String name) {
        this.name = name;
        count();
    }

};
