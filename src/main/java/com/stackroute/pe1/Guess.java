package com.stackroute.pe1;

import java.util.Scanner;
import java.util.Random;

public class Guess {
    public String gussNumber(int n, int m){

        if (n >= 1 && n <= 50) {
            if (m > n)
                return  ("Number guessed is more than original number");
            else if (m < n)
                return  ("Number guessed is less than original number");
            else
                return ("Number guessed matches the original number");
        }
        if(n==0 && m==0){
            return ("null value not allowed");
        }
        return null;
    }
}
