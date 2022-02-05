package com.UD_Scanner_Example;

import java.util.Scanner;

public class UserInputTester {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Write something:");
            while(scanner.hasNext()){
                System.out.println(scanner.next());
            }
        }catch(Exception e) {
            System.out.println(e.getLocalizedMessage());
        }finally{
            scanner.close();
        }
    }
}
