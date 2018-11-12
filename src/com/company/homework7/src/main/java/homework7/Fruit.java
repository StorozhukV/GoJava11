package homework7;

import java.util.Date;

public class Fruit {
    private NameOfFruit name;
    private int price;
    private float shelfLife;
    private String deliveryDate;

    public Fruit(NameOfFruit name, int price, String deliveryDate, float shelfLife) {
        this.name = name;
        this.price = price;
        this.shelfLife = shelfLife;
        this.deliveryDate = deliveryDate;
    }

    public NameOfFruit getName() {
        return name;
    }

    public void setName(NameOfFruit name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(float shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "\nFruit{"
                + "\n\t\t\tName:         " + name
                + "\n\t\t\tDeliveryDate: " + deliveryDate
                + "\n\t\t\tPrice:        " + price
                + "\n\t\t\tShelfTime:    " + shelfLife
                + "\n\t\t\t--------------------------";
    }
}
