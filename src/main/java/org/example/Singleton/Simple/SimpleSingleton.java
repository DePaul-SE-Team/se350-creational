package org.example.Singleton.Simple;

public class SimpleSingleton {
    public static void main (String [] args){
        assert Singleton.getInstance() == Singleton.getInstance() : "Failed";
    }
}

class Singleton{
    static private Singleton instance;
    private Singleton(){
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}