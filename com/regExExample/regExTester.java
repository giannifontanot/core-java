package com.regExExample;

import java.util.regex.Pattern;

public class regExTester {
    public static void main(String [] args){
        final Pattern regex = Pattern.compile("^(.+)@(.+).com$");

        if(regex.matcher("abc@def.com").matches()){
            System.out.println("Matches!");
        }else{
            System.out.println("try again.");
        }
    }
}
