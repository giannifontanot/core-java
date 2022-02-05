package com.UD_Collections;

import java.util.Collections;
import java.util.LinkedList;

public class Person implements Comparable <Person> {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public int compareTo(Person person) {
        return name.compareTo(person.name);
    }

}

class PersonComparableTester {
    public static void main(String [] args){

        Person person1 = new Person("John");
        Person person2 = new Person("Luis");
        Person person3 = new Person("Ariel");
        Person person4 = new Person("Carlos");

        LinkedList<Person> myList = new LinkedList<>();
        myList.add(person1);
        myList.add(person2);
        myList.add(person3);
        myList.add(person4);

        Collections.sort(myList);

        for(Person person:myList){
            System.out.println(person.name);
        }

    }
}
