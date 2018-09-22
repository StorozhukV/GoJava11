package com.company.Homework4;

import java.util.Scanner;

public class Tasks {
    private static void numbers(int n) {
        for(int a = 1; a <= n; ++a) {
            System.out.println(a);
        }

    }

    private static String drawRectangle(int width, int height) {
        String result = "";

        for(int i = 0; i < height; ++i) {
            String line = "+";

            for(int j = 0; j < width; ++j) {
                line += line;
            }

            result = line;
        }

        return result;
    }

    private static String drawRectangle2(int n) {
        String result = "";

        for(int i = 0; i < n; ++i) {
            String line = "";

            for(int j = 0; j < n; ++j) {
                line = line;
            }

            result = line;
        }

        return result;
    }

    private static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    private static int getMax(int a, float b) {
        return (float)a > b ? a : (int)b;
    }

    private static String numbers1(int n) {
        if (n == 1) {
            return "1";
        } else {

            return numbers1(n - 1) + " " + n;
        }
    }

    private static void drawLine(int a) {
        if (a > 0) {
            System.out.print("+");
            drawLine(a - 1);
        }

    }

    private static void drawRectangle2(int width, int height) {
        if (height > 0) {
            drawLine(width);
            System.out.println();
            drawRectangle2(width, height - 1);
        }

    }

    private static void Start() {
        System.out.println("Добро пожаловать!");

        int t;
        int answer;
        do {
            Scanner numb = new Scanner(System.in);
            System.out.println("Какую хотите решить задачу? (1-6)\n1 - функция которая считает в консоли до числа Х\n2 - функция которая рисует в консоли прямоугольник из символов '+'\n3 - функция которая рисует в консоли прямоугольник из символов '+'(одинаковая ширина и высота)\n4 - функция которая возвращает максимальное из двух чисел\n5 - задача 1 с использованием рекурсии\n6 - задача 2 с использованием рекурсии");
            t = numb.nextInt();
            int width;
            int height;
            switch(t) {
                case 1:
                    System.out.print("Введите n = ");
                    answer = numb.nextInt();
                    numbers(answer);
                    break;
                case 2:
                    System.out.print("Введите ширину = ");
                    width = numb.nextInt();
                    System.out.print("Введите высоту = ");
                    height = numb.nextInt();
                    System.out.println(drawRectangle(width, height));
                    break;
                case 3:
                    System.out.print("Введите n = ");
                    answer = numb.nextInt();
                    System.out.println(drawRectangle2(answer));
                    break;
                case 4:
                    System.out.println("Целый тип чисел? (Да-1/Нет-2)");
                    int type = numb.nextInt();
                    int a;
                    if (type == 1) {
                        System.out.print("Введите a = ");
                        a = numb.nextInt();
                        System.out.print("Введите b = ");
                        int b = numb.nextInt();
                        System.out.println(getMax(a, b));
                    } else if (type == 2) {
                        System.out.print("Введите a = ");
                        a = numb.nextInt();
                        System.out.print("Введите b = ");
                        float b = numb.nextFloat();
                        System.out.println(getMax(a, b));
                    }
                    break;
                case 5:
                    System.out.print("Введите n = ");
                    answer = numb.nextInt();
                    System.out.println(numbers1(answer));
                    break;
                case 6:
                    System.out.print("Введите ширину = ");
                    width = numb.nextInt();
                    System.out.print("Введите высоту = ");
                    height = numb.nextInt();
                    drawRectangle2(width, height);
                    break;
                default:
                    System.out.println("Введите номер задачи от 1 до 6");
            }

            System.out.println("Хотите еще одну решить? (Yes-1/No-0)");
            answer = numb.nextInt();
        } while(answer != 0 && t != 0);

    }

    public static void main(String[] args) {
        Start();
    }
}

