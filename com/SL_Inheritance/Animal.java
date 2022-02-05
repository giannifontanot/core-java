package com.SL_Inheritance;

public abstract class Animal {
    public void eat(){

        System.out.println("my animal eats...");
    }

    public void sleep(){
        System.out.println("My animal sleeps...");
    }

    public abstract void makeNoise();
}
