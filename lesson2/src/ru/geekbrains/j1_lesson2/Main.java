package ru.geekbrains.j1_lesson2;

public class Main {

    public static void main(String[] args) {
        zamena(); /* 1. задать целочисленный массив, состоящий из элементов 0 и 1. Например: [1,1,0,0,1,0,1,1,0,0].
                    // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0.*/
        newArr8(); /* 2. Задать пустой целочисленный массив размером 8. Написать метод, который c попощью цикла заполнит его значениями 1 4 7 10 13 16 19 22. */

        arrUmnoz(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}); /* 3. Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1].
        // Написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2.*/

        /* 4. Задать одномерный массив. Написать методЫ поиска в нем минимального и максимального элемента в нем */

        int[] arr = {1, 5, 3, 20, 7, 7, 5, 0, 4, 8, 9, 15};
        maxArr(arr);
        minArr(arr);

        /*5. Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);*/
        table(10); //при вызове задаю размер массива
    }


    private static void table(int x) {
        System.out.println("Task5: ");
        int[][] table = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
//                if (i == j) {
//                    table[i][j] = 1;
//                } else table[i][j] = 0;
                table[i][j] = (i == j) ? 1 : 0; //тернарный оператор
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }


    private static void minArr(int[] arr) {
        System.out.print("Task4.2: ");
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) { //нулевой элемент уже взят
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное значение массива: " + min);
    }

    private static void maxArr(int[] arr) {
        System.out.print("Task4.1: ");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное значение массива: " + max);
    }


    private static void zamena() {
        System.out.print("Task1: ");
        int[] arr = {1, 1, 0, 0, 0, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1) {
//                arr[i] = 0;
//            } else arr[i] = 1;
            arr[i] = (arr[i] == 1) ? 0 : 1; //тернарный оператор
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    private static void newArr8() {
        System.out.print("Task2: ");
        int[] arr = new int[8];
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j;
            j += 3;
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    private static void arrUmnoz(int[] arr) {
        System.out.print("Task3: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}
