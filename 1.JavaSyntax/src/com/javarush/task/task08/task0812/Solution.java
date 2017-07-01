package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            integers.add(Integer.parseInt(reader.readLine()));
        }

        int k = 1;
        int max = 0;
        for (int i = 1; i < integers.size(); i++){
            if (integers.get(i) == integers.get(i - 1)){
//                System.out.println("Q: " + ++k);
            }
            if (integers.get(i) != integers.get(i - 1)){
//                System.out.println(integers.get(i));
                if (max < k){
                    max = k;
                }
                k = 1;
            }
            System.out.println((max > 1) ? max : 0);
        }
    }
}