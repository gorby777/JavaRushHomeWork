package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!
*/


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number: ");
        String sYears = reader.readLine();
        int nYears = Integer.parseInt(sYears);
        System.out.println("Enter name: ");
        String name = reader.readLine();

        System.out.println(name + " " + "захватит мир через" + " " + nYears + " " + "лет. Му-ха-ха!" );



    }
}