package homework7;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.LinkedList;

public class App
{
    public static void main( String[] args ) throws IOException, ParseException {
        Store store = new Store();
        store.storage.init();
        /*store.show();*/
        //store.save("./data2.json");

        Date date = store.parsingDate("09/09/2018");
        System.out.println("========== SPOILED FRUITS ===========");
        LinkedList<Fruit> spoiledFruits = (LinkedList<Fruit>) store.getSpoiledFruits(date, NameOfFruit.MELON);
        for (Fruit fruit : spoiledFruits) {
            System.out.println(fruit);
        }
        System.out.println("========= AVAILABLE FRUITS ==========");
        LinkedList<Fruit> availableFruits = (LinkedList<Fruit>) store.getAvailableFruits(date);
        for (Fruit fruit : availableFruits) {
            System.out.println(fruit);
        }
        System.out.println("=========== ADDED FRUITS ============");
        LinkedList<Fruit> addedFruits = (LinkedList<Fruit>) store.getAddedFruits(date, NameOfFruit.KIWI);
        for (Fruit fruit : addedFruits) {
            System.out.println(fruit);
        }
    }


}
