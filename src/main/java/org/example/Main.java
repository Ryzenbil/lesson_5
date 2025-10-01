package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3, 26);
        elevator.getCurrentFloor();

        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner (System.in).nextInt();
            elevator.move(floor);
        }
//        Dimensions dimensions = new Dimensions(30,40,70);
//        CargoInfo cargo = new CargoInfo(dimensions, 7,"Pushkina 132", true, "3462AA",
//                false);
//        CargoInfo copy = cargo.setMass(10);
//
//        System.out.println(copy);
//        System.out.println(cargo);
    }
}