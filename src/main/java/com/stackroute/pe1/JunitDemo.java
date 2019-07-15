package com.stackroute.pe1;

public class JunitDemo {
    public String concatAndUpperCase(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return ("null values not allowed");
        }

        String concattedString = str1.concat(str2);
        return concattedString.toUpperCase();
    }

    public String reverseString(String value) {
        StringBuffer sb = new StringBuffer(value);
        System.out.println("String:" +sb);
        System.out.println("Reverse:" +sb.reverse());
        return sb.toString();
    }
}

