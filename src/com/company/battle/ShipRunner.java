package com.company.battle;

import java.util.ArrayList;
import java.util.List;

public class ShipRunner {
    public static void main(String[] args) {
        NameGenerator.getInstance().reset();

        List<Ship> ships = new ArrayList<>();
        for(int i = 0; i < 50; i++) {
            Ship ship = Ship.createRandom(ships);
            ships.add(ship);
        }

        for(Ship ship: ships) {
            ship.start();
        }
    }
}
