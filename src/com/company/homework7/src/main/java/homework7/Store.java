package homework7;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Store {
    private final static int MILLISECOND_CONVERSION_FACTOR = 86_400_000;
    private final static String PATH = "src/main/resources";
    private final String DATA_FILE = PATH + "data.json";
    private Date dateForParse;

    public Storage storage = new Storage();

    public void addFruits(String pathToJsonFile) {
        String json = null;
        try {
            json = new Scanner(new File(pathToJsonFile)).next();
            Storage tmp = JSON.parseObject(json, Storage.class);
            for (Fruit fruit : tmp.fruits) {
                storage.fruits.add(fruit);
            }
            save(DATA_FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save(String pathToJsonFile) throws IOException {
        FileWriter writer = new FileWriter(pathToJsonFile);
        writer.write(JSON.toJSONString(storage));
        writer.flush();
    }

    public void load(String pathToJsonFile) throws FileNotFoundException {
        String json = new Scanner(new File(pathToJsonFile)).next();
        storage = JSON.parseObject(json, Storage.class);
    }

    public void show() {
        System.out.println(storage);
    }

    public Date parsingDate(String deliveryDate) throws ParseException {
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy/MM/dd");
            dateForParse = ft.parse(deliveryDate);
            //System.out.println(formatForDateNow.format(dateForParse));

        return dateForParse;
    }

    public List<Fruit> getSpoiledFruits(Date date) throws ParseException {
        LinkedList<Fruit> spoiledFruits = new LinkedList<>();
        for(Fruit fruit : storage.fruits) {
            dateForParse = parsingDate(fruit.getDeliveryDate());
            if (dateForParse.getTime() + MILLISECOND_CONVERSION_FACTOR * fruit.getShelfLife() < date.getTime()) {
                spoiledFruits.add(fruit);
            }
        }
        return spoiledFruits;
    }

    public List<Fruit> getAvailableFruits(Date date) throws ParseException {
        LinkedList<Fruit> availableFruits = new LinkedList<>();
        for (Fruit fruit : storage.fruits) {
            dateForParse = parsingDate(fruit.getDeliveryDate());
            if ( dateForParse.getTime() + MILLISECOND_CONVERSION_FACTOR * fruit.getShelfLife() >= date.getTime()
                    && dateForParse.getTime() < date.getTime() + MILLISECOND_CONVERSION_FACTOR) {
                availableFruits.add(fruit);
            }
        }
        return availableFruits;
    }

    public List<Fruit> getAddedFruits(Date date) throws ParseException {
        LinkedList<Fruit> addedFruits = new LinkedList<>();
        for (Fruit fruit : storage.fruits) {
            dateForParse = parsingDate(fruit.getDeliveryDate());
            if (dateForParse.equals(date)) {
                addedFruits.add(fruit);
            }
        }
        return addedFruits;
    }

    public List<Fruit> getSpoiledFruits(Date date, NameOfFruit name) throws ParseException {
        LinkedList<Fruit> spoiledFruits = new LinkedList<>();
        for(Fruit fruit : storage.fruits) {
            dateForParse = parsingDate(fruit.getDeliveryDate());
            if (dateForParse.getTime() + MILLISECOND_CONVERSION_FACTOR * fruit.getShelfLife() < date.getTime() &&
            fruit.getName() == name) {
                spoiledFruits.add(fruit);
            }
        }
        return spoiledFruits;
    }

    public List<Fruit> getAvailableFruits(Date date, NameOfFruit name) throws ParseException {
        LinkedList<Fruit> availableFruits = new LinkedList<>();
        for (Fruit fruit : storage.fruits) {
            dateForParse = parsingDate(fruit.getDeliveryDate());
            if ( dateForParse.getTime() + MILLISECOND_CONVERSION_FACTOR * fruit.getShelfLife() >= date.getTime()
                    && dateForParse.getTime() < date.getTime() + MILLISECOND_CONVERSION_FACTOR &&
            fruit.getName() == name) {
                availableFruits.add(fruit);
            }
        }
        return availableFruits;
    }

    public List<Fruit> getAddedFruits(Date date, NameOfFruit name) throws ParseException {
        LinkedList<Fruit> addedFruits = new LinkedList<>();
        for (Fruit fruit : storage.fruits) {
            dateForParse = parsingDate(fruit.getDeliveryDate());
            if (dateForParse.equals(date) && fruit.getName() == name) {
                addedFruits.add(fruit);
            }
        }
        return addedFruits;
    }
}
