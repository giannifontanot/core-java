package com.UD_Exception_Example;

public class PhoneTester {

    public static void main(String[] args) {
        String[] numbers = new String[] {"123-456-789", null, "987-654-321"};
        for(String number:numbers){
        Phone phone = new Phone("iPhone", number);
        }

    }
}
