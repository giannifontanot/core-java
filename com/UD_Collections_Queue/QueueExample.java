package com.UD_Collections_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //We create a queue, implemented using a linkedlist
        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("this");
        myQueue.add("is");
        myQueue.add("a");
        myQueue.add("a");
        myQueue.add("a");
        myQueue.add("test");
        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.poll());
        }
    }
}
