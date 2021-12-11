package Package;

import java.util.Random;

public class HomeWork2 {

    public static void main(String[] args) {

        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        //System.out.println(Task6(randomiseArr(4, -2, 2)));
        //System.out.println(Task6(new int[]{1, 1, 1, 2, 1}));

    }

    public static void printArr(int[]arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printArr(int[][]arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static int[] randomiseArr(int size, int min, int max){
        int[] arr = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
        }

        return arr;
    }

    public static void tasksDivider(int number){
        System.out.println("   ---   Task #" + number + "   ---   ");
    }

    public static void Task1() {

        tasksDivider(1);

        /*
        Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;
        * */

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else if (arr[i] == 1) arr[i] = 0;
        }

        printArr(arr);

    }

    public static void Task2() {

        tasksDivider(2);

        /*
        Задать пустой целочисленный массив размером 8.
        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        * */

        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i * 3);
        }
        printArr(arr);

    }

    public static void Task3() {

        tasksDivider(3);

        /*
        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        и числа меньшие 6 умножить на 2;
        * */

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }

        printArr(arr);

    }

    public static void Task4() {

        tasksDivider(4);

        /*
        Создать квадратный двумерный целочисленный массив
        (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        заполнить его диагональные элементы единицами;
        * */

        int size = 5;
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == j) || (((size - 1) - i) == j)) {
                    arr[i][j] = 1;
                }
            }
        }
        printArr(arr);
    }

    public static void Task5(){

        tasksDivider(5);

        /*
        Задать одномерный массив и найти в нем минимальный и максимальный элементы
        (без помощи интернета);
        * */

        int[] arr;
        int max = 0;
        int min = 0;

        arr = randomiseArr(10, -50, 50);

        printArr(arr);

        for (int j : arr) {
            if (max < j) max = j;
            else if (min > j) min = j;
        }

        System.out.printf("Макс: %d, Мин: %d", max, min);
        System.out.println();

    }

    /*public static boolean Task6(int[] arr){

        tasksDivider(6);

        *//*
        Написать метод, в который передается не пустой одномерный целочисленный массив,
        метод должен вернуть true, если в массиве есть место,
        в котором сумма левой и правой части массива равны.
        Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        checkBalance([1, 1, 1, || 2, 1]) → true,
        граница показана символами ||, эти символы в массив не входят.
        * *//*

        boolean balance = false;
        int sum = 0;
        int rightSum = 0;
        int leftSum = 0;
        int index = 0;

        printArr(arr);

        for (int i : arr) {
            sum += i;
        }

        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            for (int j = arr.length - 1; i < j; j--) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                index = i;
                balance = true;
                break;
            }
        }

        if (balance){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
                if (i == index) System.out.print("|| ");
            }
            System.out.println("");
        }
        else System.out.println("Массив не отвечает условиям");

        return balance;

    }*/

}
