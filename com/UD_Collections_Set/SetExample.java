package com.UD_Collections_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
public static void main(String []args) throws Exception {
    // create a list
    List<String> myList = new ArrayList<>();
    myList.add("123-456-789");
    myList.add("122-455-788");
    myList.add("133-466-799");
    myList.add("122-455-788");
    myList.add("123-456-789");

    // the list is the constructor of the set
    Set<String> phoneNumbers = new HashSet<String>(myList);

    //read the set
    for (String phoneNumber : phoneNumbers) {
        System.out.println(phoneNumber);
    }
}
}
