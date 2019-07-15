package com.stackroute.pe1;

import java.util.Scanner;

public class RevStr {
    public String reverseString(String value) {

        String rev="";

        for(int i=value.length()-1; i>=0; i--){
           rev=rev+value.charAt(i);
        }
       return  rev;
    }
}
