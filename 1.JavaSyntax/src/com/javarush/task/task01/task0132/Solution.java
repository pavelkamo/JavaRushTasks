package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a, b, c;
        a = number % 10;
        b = (number - a) / 100;
        c = (number - a - b * 10) / 100;
        return a + b + c;
    }
}