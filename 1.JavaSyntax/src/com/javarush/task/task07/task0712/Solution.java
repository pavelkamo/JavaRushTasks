package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10 ; i++){
            list.add(reader.readLine());
        }

        String longWord = list.get(0);
        String shortWord = list.get(0);
        for (String s : list){
            if (longWord.length() < s.length()){
                longWord = s;
            }
            if (shortWord.length() > s.length()){
                shortWord = s;
            }
        }
        System.out.println((list.indexOf(shortWord) < list.indexOf(longWord)) ? shortWord : longWord);
    }
}
