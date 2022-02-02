package com.SL_inheritance;

public class Zoo {
    public static void main(String []args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        dog.makeNoise();
        cat.makeNoise();
        bird.makeNoise();

        dog.eat();
        cat.eat();
        bird.eat();

        dog.sleep();
        cat.sleep();
        bird.sleep();

    }
}
