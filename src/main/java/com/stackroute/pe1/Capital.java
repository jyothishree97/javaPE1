package com.stackroute.pe1;


import java.util.Scanner;

public class Capital {
   public String checkCases(char ch) {

       String temp;
        if(ch>=65 && ch<=90){
           temp ="capital";
        }
        else if(ch>=97 && ch<=122){
            temp= "small";
        }
        else if(ch>=48 && ch<=57){
            temp= "num";
        }
        else{
            temp= "special";
        }
       return  temp;
    }
}
