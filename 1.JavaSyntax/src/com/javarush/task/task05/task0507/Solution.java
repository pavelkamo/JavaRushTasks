package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        int sum = 0;
        int counter = 0;
        while ((number = Integer.parseInt(reader.readLine())) != -1){
            sum += number;
            counter++;
        }
        if (counter > 0){
            System.out.println((double) sum / counter);
        }
    }
}

