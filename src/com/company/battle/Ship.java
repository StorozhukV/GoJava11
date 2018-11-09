package com.company.battle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship extends Thread{
    private int hp;
    private int maxHp;
    private int damage;
    private int cooldown;
    private List<Ship> ships;

    public Ship(String name, int hp, int damage, int cooldown, List<Ship> ships) {
        setName(name);
        this.hp = hp;
        this.maxHp = hp;
        this.damage = damage;
        this.cooldown = cooldown;
        this.ships = ships;
    }

    @Override
    public void run() {
        while (this.hp > 0) {
            Ship target = getRandom();
            if (target == null) {
                System.out.println("I (" + getName() + ") won!\n"
                        + "My hp was: " + maxHp + "\nMy damage was: " + damage);
                return;
            }
            target.applyDamage(this);
            try {
                Thread.sleep(cooldown);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void applyDamage(Ship attacker) {
        hp -= attacker.damage;
        hp = Math.max(0, hp);
        System.out.println(attacker.getName() + " dealt "
                + attacker.damage
                + " to " + getName() + ". Current hp = " + hp + "\n");
    }

    public Ship getRandom() {
        ArrayList<Ship> aliveShips = new ArrayList<>();
        for (Ship ship : ships) {
            if (this == ship) {
                continue;
            }
            if (ship.hp > 0) {
                aliveShips.add(ship);
            }
        }
        if (aliveShips.size() == 0) {
            return null;
        }
        Random random = new Random();
        int n = random.nextInt(aliveShips.size());
        return aliveShips.get(n);
    }

    public static Ship createRandom(List<Ship> ships) {
        int hp = random(70, 100);
        int damage = random(10, 20);
        int coolDown = random(2000, 4000);
        Ship ship = new Ship(NameGenerator.getInstance().popRandomName(), hp, damage, coolDown, ships);
        return ship;
    }

    public static int random(int min, int max) {
        Random random = new Random();
        return min + random.nextInt(max - min + 1);
    }
}
