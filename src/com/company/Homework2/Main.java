package com.company.Homework2;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, city, hobby;
        int year;

        Scanner sn, sc, sy, sh;
        sn = new Scanner(System.in);
        sc = new Scanner(System.in);
        sh = new Scanner(System.in);
        sy = new Scanner(System.in);
        System.out.println("Введите имя:");
        name = sn.nextLine();

        System.out.println("Введите город проживания:");
        city = sc.nextLine();

        System.out.println("Введите возраст:");
        year = sy.nextInt();

        System.out.println("Введите хобби:");
        hobby = sh.nextLine();

        System.out.println("-----------------------------------------");
        System.out.println("Имя:     " + name + "\nГород:   " + city + "\nВозраст: " + year + "\nХобби:   " + hobby);

        System.out.println("-----------------------------------------");
        System.out.println("Человек по имени " + name + " живет в городе " + city +
                ".\nЭтому человеку " + year + " лет и любит он заниматься " + hobby + ".");

        System.out.println("-----------------------------------------");
        System.out.println(name + " - имя\n" + city + " - город\n" + year + " - возраст\n" + hobby + " - хобби");
    }
}
