package com.stackroute.pe1;

import java.util.Scanner;

public class Odd {
    String  temp;
    public String oddNumber(int num){
        if((num>20)&&(num<30)){
            if(num%2==0){
                temp="Jerry";
            }
            else{
                temp="Tom";
            }
        }
        if(num==0){
            return ("null value not allowed");
        }

      return  temp;
    }
}
