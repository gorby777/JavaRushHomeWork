package com.javarush.test.level03.lesson04.task02;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
*/

public class Solution
{



    public static void main(String[] args)
    {

        String name = "Artem";

        for (int s=1; s<=5; s++ ) {
            for (int l=1; l <= 10; l++ ) {
                System.out.print(name + " ");
            }
            System.out.println();
        }



    }
}