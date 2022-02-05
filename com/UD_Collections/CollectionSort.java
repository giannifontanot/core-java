package com.UD_Collections;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionSort {
    public static void main (String []args) throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        Collections.sort(list);

        for(String number:list){
            System.out.println(number);
        }
    }
}
