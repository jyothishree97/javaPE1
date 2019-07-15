package com.stackroute.pe1;

import java.util.Scanner;

public class Pallindrome {
    public String pallindrome(int num){
        int temp=num;
        int sum1=0,sum=0;
        int r;
        while(num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
            if(r%2==0){
                sum1=sum1+r;
            }
        }
        if((temp==sum)&&(sum1>=25))
            return (temp + "is a Pallindrome and the even number sum is greater than 25");
        if((temp==sum)&&(sum1<=25))
            return(temp +"is a Pallindrome and the even number sum is less than 25");
         if(temp!=sum)
             return(temp + "is not a pallindrome ");
        return null;
    }
}
