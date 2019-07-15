package com.stackroute.pe1;

import java.util.Scanner;

public class Iterator {
    public int[] iteration(int inputNumber) {

            int index = 0;
            int size = 0;
            for (int i = 1; i <= inputNumber; i++) {
                size += i;
            }
            int[] array = new int[size];
            for (int i = 1; i <= inputNumber; i++) {
                for (int j = 1; j <= i; j++) {
                    array[index] = i;
                    index++;
                }
            }
                return array;
        }
    }

