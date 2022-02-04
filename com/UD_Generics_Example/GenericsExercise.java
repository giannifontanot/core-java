package com.UD_Generics_Example;

import java.util.Iterator;
import java.util.LinkedList;

public class GenericsExercise {
    public static void main(String []args) throws Exception {
        LinkedList<Object> list = new LinkedList<>();
        list.add(new Integer(100));
        list.add(new String("This is a string"));
        list.add(new Character('a'));
        list.add(new Float(1.025));

        for (Object o : list) {
            System.out.println(o.getClass().getName());
        }

    }
}
