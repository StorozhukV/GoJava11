package com.company.file;

import java.io.*;

public class WriteFileExample {
    public static void main(String[] args) throws IOException {
        String line = "Anna! I see you";

        File iSeeAllFile = new File("./i-see-you.txt");

        PrintWriter printWriter = new PrintWriter(iSeeAllFile);
        printWriter.println(line);
        printWriter.flush();
        printWriter.close();

        OutputStream outputStream = new FileOutputStream(new File("./i-see-bytes.txt"));
        outputStream.write(line.getBytes());
        outputStream.flush();
        outputStream.close();
    }
}
