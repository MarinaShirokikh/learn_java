package ru.geekbrains.j1_lesson1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        formula();
        System.out.println(predel());

    }

    private static void formula() {
    /*Написать метод вычисляющий выражение a * (b + (c / d)) и
    возвращающий результат с плавающей точкой,
    где a, b, c, d – целочисленные входные параметры этого метода;*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1.Введите значение a:");
        int a = scanner.nextInt();
        System.out.println("Введите значение b:");
        int b = scanner.nextInt();
        System.out.println("Введите значение c:");
        int c = scanner.nextInt();
        System.out.println("Введите значение d:");
        int d = scanner.nextInt();
        float result = a * (b + ((float)c / (float)d));
        System.out.println(result);
        scanner.close();
    }

    private static boolean predel() {
        /* Написать метод, принимающий на вход два целых числа, и
         проверяющий что их сумма лежит в пределах
        от 10 до 20(включительно), если да – вернуть true, в противном случае – false; */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 2. Введите значение первого числа:");
        int a = scanner.nextInt();
        System.out.println("Введите значение второго числа:");
        int b = scanner.nextInt();
        boolean z;
        a = a + b;
        if (a > 10 && a <=20) {
            System.out.println("Сумма чисел равна: " + a + " и входит в заданный диапазон от 10 до 20");
            z = true;
        } else {
            System.out.println("Сумма чисел равна: " + a + " и не входит в заданный диапазон от 10 до 20");
            z = false;
        }
        return z;
    }



}


