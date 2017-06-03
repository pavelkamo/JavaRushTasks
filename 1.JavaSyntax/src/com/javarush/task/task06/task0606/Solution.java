package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        even = 0;
        odd = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char [] a = reader.readLine().toCharArray();
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                even++;
            } else {
                odd ++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
