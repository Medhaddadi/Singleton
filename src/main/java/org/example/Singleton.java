package org.example;

public class Singleton {
    private static Singleton test = null;
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    private Singleton() {
        // Exists only to defeat instantiation.
    }

    public static Singleton getInstance() {
        if(test == null) {
            test = new Singleton();
        }
        return test;
    }
}
