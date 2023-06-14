package main.java;

public class Singleton_58 {

    private static Singleton_58 singleInstance = null;

    private Singleton_58() {

    }

    public Singleton_58 getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton_58();
        }
        return singleInstance;
    }
}
