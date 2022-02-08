package com.UD_Collections_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Person> myMap = new HashMap<String, Person>();
        //create an ArrayList of persons
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("joe","joe@gmail.com"));
        people.add(new Person("peter","peter@gmail.com"));
        people.add(new Person("luis","luis@gmail.com"));
        people.add(new Person("jose","jose@gmail.com"));

        // fill the map with the persons
        for(Person person:people){
            myMap.put(person.getEmail(),person);
        }
        // Search for the people based on their emails
        System.out.println(myMap.size());
        System.out.println(myMap.get("luis@gmail.com"));

    }
}
