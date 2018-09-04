package com.company.Homework3;

import java.util.Scanner;

public class Task {

    private static void sorting(int n, int[] array) {
        int i;
        for (i = n - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.print("Массив после сортировки:\n");
        for (i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    private static void minMax(int n, int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < n - 1; ++i) {
            if (min > array[i]) {
                min = array[i];
            }

            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    private static int countOfFiveInArray(int n, int[] array) {
        int k = 0;

        for (int i = 0; i < n; ++i) {
            if (array[i] == 5) {
                ++k;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.print("Введите размер массива n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; ++i) {
            System.out.print("Введите элемент массива " + (i + 1) + " = ");
            array[i] = sc.nextInt();
        }

        minMax(n, array);
        sorting(n, array);
        System.out.println("Количество 5 в массиве = " + countOfFiveInArray(n, array));
    }
}
