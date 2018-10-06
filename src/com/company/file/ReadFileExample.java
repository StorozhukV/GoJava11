package com.company.file;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {

        File file = new File("./hello.txt");

        // read file
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();

        scanner = new Scanner(new File("./numbers.txt"));
        while(scanner.hasNextLine()){
            float num = scanner.nextFloat();
            System.out.println(num);
        }
        scanner.close();

        scanner = new Scanner(new File("./prices.txt"));
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();

            Scanner lineScanner = new Scanner(line);
            String itemName = lineScanner.next();
            float price = lineScanner.nextFloat();

            System.out.println(itemName + " cost " + price);
        }

        InputStream fileInputStream = new FileInputStream(new File("./hello.txt"));
        byte[] inputData = new byte[fileInputStream.available()];
        fileInputStream.read(inputData);
        for (byte b: inputData) {
            System.out.println(b);
        }
        String result = new String(inputData);
        System.out.println(result);
    }
}
