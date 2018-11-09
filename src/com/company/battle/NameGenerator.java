package com.company.battle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
    private static final NameGenerator INSTANCE = new NameGenerator();

    private List<String> names;

    private NameGenerator() {
    }

    public static NameGenerator getInstance() {
        return INSTANCE;
    }

    public void reset() {
        names = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("./names.txt"));
            while (scanner.hasNextLine()) {
                names.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String popRandomName() {
        Random random = new Random();
        int index = random.nextInt(names.size());

        String toReturn = names.get(index);
        names.remove(index);

        return toReturn;
    }
}
