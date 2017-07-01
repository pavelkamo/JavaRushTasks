package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> persons = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            persons.put("user" + i, (random.nextInt(1000)));
        }
        return persons;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> instance : copy.entrySet()){
            if (instance.getValue() < 500){
                map.remove(instance.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}