package com.company.Homework5;

import com.company.Homework5.Car.Car;

import java.util.Scanner;

public class Main {
    public static void userInterface() {
        System.out.println("Привет!\n Мы тут с машинами работаем, не, не 'Тачку на прокачку', " +
                "а просто салон, ну дальше увидишь :Р");
        System.out.println("Введи данные о машине: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Дата производства: ");
        String date = sc.nextLine();
        int engineType, maxSpeed, time100km, maxPassenger, passenger, speed, currentEvent;
        System.out.print("Тип двигателя: ");
        engineType = sc.nextInt();
        System.out.print("Максимальная скорость: ");
        maxSpeed = sc.nextInt();
        System.out.print("Время разгона до 100км/ч: ");
        time100km = sc.nextInt();
        System.out.print("Максимальное кол-во пассажиров: ");
        maxPassenger = sc.nextInt();
        System.out.print("Кол-во пассажиров внутри в данный момент: ");
        passenger = sc.nextInt();
        System.out.print("Текущая скорость: ");
        speed = sc.nextInt();
        Car car = new Car(date, engineType, maxSpeed, time100km, maxPassenger, passenger, speed);

        do {
            System.out.println("Выбирай что душа желает :)\n" +
                    "1 - Открыть или закрыть двери и окна\n" +
                    "2 - Работа с шинами\n" +
                    "3 - Установить скорость\n" +
                    "4 - Добавить пассажира или высадить\n" +
                    "5 - Посчитать скорость\n" +
                    "6 - Вывести данные об машине\n");
            currentEvent = sc.nextInt();
            int i;
            switch (currentEvent) {
                case 1: {
                    System.out.println("Выбери что нужно сделать: \n" +
                            "1 - Открыть дверь\n" +
                            "2 - Закрыть дверь\n" +
                            "3 - Поменять состояние двери с закрытого на открытую или наоборот\n" +
                            "4 - Открыть окно\n" +
                            "5 - Закрыть окно\n" +
                            "6 - Поменять состояние окна с закрытого на открытую или наоборот");
                    currentEvent = sc.nextInt();
                    switch (currentEvent) {
                        case 1:
                            System.out.println("Введи какую дверь нужно открыть: ");
                            i = sc.nextInt();
                            car.getindexOfADoor(i - 1).openDoor();
                            break;
                        case 2:
                            System.out.println("Введи какую дверь нужно закрыть: ");
                            i = sc.nextInt();
                            car.getindexOfADoor(i - 1).closeDoor();
                            break;
                        case 3:
                            System.out.println("Введи номер двери: ");
                            i = sc.nextInt();
                            car.getindexOfADoor(i - 1).openOrCloseDoor();
                            break;
                        case 4:
                            System.out.println("Введи какое окно нужно открыть: ");
                            i = sc.nextInt();
                            car.getindexOfADoor(i - 1).openWindow();
                            break;
                        case 5:
                            System.out.println("Введи какое окно нужно закрыть: ");
                            i = sc.nextInt();
                            car.getindexOfADoor(i - 1).closeWindow();
                            break;
                        case 6:
                            System.out.println("Введи номер окна: ");
                            i = sc.nextInt();
                            car.getindexOfADoor(i - 1).openOrCloseWindow();
                            break;
                        default:
                            System.out.println("Введи цыфру от 1-6");
                    }
                    break;
                }
                case 2: {
                    int p = 0;
                    System.out.println("1 - Поменять шину на новую\n" +
                            "2 - Стереть шину на X%\n" +
                            "3 - Вывести данные о колесе\n" +
                            "4 - Ты на шиномонтаже и хочешь снять колеса?" +
                            "5 - Хочешь добавить ещё колес?");
                    currentEvent = sc.nextInt();
                    switch (currentEvent) {

                        case 1:
                            System.out.println("Введи какую шину нужно поменять: ");
                            i = sc.nextInt();
                            car.getindexOfAWheel(i - 1).newWheel();
                            break;
                        case 2:
                            System.out.println("Введи какую шину нужно стереть и на сколько: ");
                            i = sc.nextInt();
                            System.out.println("На сколько % стереть? ");
                            p = sc.nextInt();
                            car.getindexOfAWheel(i - 1).eraseWheel(p);
                            break;
                        case 3:
                            System.out.println("Введи шину ");
                            i = sc.nextInt();
                            car.getindexOfAWheel(i).show();
                            break;
                        case 4:
                            System.out.println("Ну что, снимаем все колеса!");
                            car.removeWheel();
                            break;
                        case 5:
                            System.out.println("Сколько ещё хочешь добавить колес? ");
                            i = sc.nextInt();
                            car.addNewWheel(i);
                            break;
                        default:
                            System.out.println("Введи цыфру от 1-5");
                    }
                    break;
                }
                case 3:{
                    float currentSpeed = 0;
                    System.out.println("Введи текущую скорость: ");
                    currentSpeed = sc.nextFloat();
                    car.setSpeed(currentSpeed);
                    break;
                }
                case 4:{
                    System.out.println("Что хочешь сделать с пассажиром?\n" +
                            "1 - Добавить одного пассажира\n" +
                            "2 - Высадить одного пассажира\n" +
                            "3 - Высадить всех пассажиров + водитель\n");
                    currentEvent = sc.nextInt();
                    switch (currentEvent){
                        case 1:
                            car.addPassenger();
                            System.out.println("Пассажир на борту :)");
                            break;
                        case 2:
                            car.landPassenders();
                            System.out.println("Пассажир за бортом :)");
                            break;
                        case 3:
                            car.landAllPassengers();
                            System.out.println("Вы все за бортом ~~(-_-)~~");
                            break;
                        default:
                            System.out.println("Введи цыфру от 1-3");
                    }
                    break;
                }
                case 5:{
                    System.out.println("Сейчас посчитаем твою максимальную скорость, шумахер");
                    System.out.println("А вот и она = " + car.calcMaxSpeed());
                    break;
                }
                case 6:
                    car.show();
                    break;
                default:
                    System.out.println("Введи цыфру от 1-6");
            }
            System.out.println("Хочешь еще что-то сделать? (Да-1/Нет-0)");
            currentEvent = sc.nextInt();
        } while (currentEvent != 0);
    }

    public static void main(String[] args) {
        userInterface();
    }
}
