package homework7;

import java.util.ArrayList;
import java.util.Date;

public class Storage {
    public ArrayList<Fruit> fruits = new ArrayList<>();

    public Storage() {
//        init();
    }

    public void init() {
        fruits.add(new Fruit(NameOfFruit.STRAWBERRY, 10, "09/09/2018", 9.1f));
        fruits.add(new Fruit(NameOfFruit.LEMON,      20, "01/09/2018",  115.1f));
        fruits.add(new Fruit(NameOfFruit.BANANA,      1, "09/10/2018", 7.2f));
        fruits.add(new Fruit(NameOfFruit.KIWI,        5, "09/09/2018",  8.0f));
        fruits.add(new Fruit(NameOfFruit.MELON,       5, "09/01/2018",  9.2f));
        fruits.add(new Fruit(NameOfFruit.PINEAPPLE,  10, "09/11/2018", 9.3f));
        fruits.add(new Fruit(NameOfFruit.WATERMELON,  5, "09/08/2018",  2.2f));
        fruits.add(new Fruit(NameOfFruit.BLUEBERRY,   7, "09/06/2018",  4.0f));
        fruits.add(new Fruit(NameOfFruit.RASPBERRY,   8, "09/02/2018",  3.0f));
        fruits.add(new Fruit(NameOfFruit.APPLE,       8, "09/01/2018",  3.2f));
    }

    public void getFruitsSize() {
        fruits.size();
    }

    @Override
    public String toString() {
        return "\t\tFruits{" + fruits + "}\n ";
    }
}
