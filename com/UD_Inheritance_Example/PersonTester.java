package com.UD_Inheritance_Example;

public class PersonTester {

    public static void main(String[] args){
        Person sally = new Person("Sally", "Phillips");
        Student mike = new Student("Mike", "Thompson", "12345");
        StudentEmployee jeff = new StudentEmployee("Jeff", "Sam", "1342","#12345", 20.5);
        System.out.println(sally);
        System.out.println(mike);
        System.out.println(jeff);
    }
}
