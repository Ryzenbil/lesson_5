package org.example;

import java.util.Scanner;

public class Elevator {
    private int currentFloor = 1;
    private final int maxFloor;
    private final int minFloor;
    public Elevator( int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public int getCurrentFloor() {
        System.out.println("Current Floor: " + currentFloor);
        return currentFloor;
    }
    public void moveDown(){
        currentFloor = currentFloor > minFloor ? --currentFloor : currentFloor;
    }
    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? ++currentFloor : currentFloor;
    }

    public void move (int floor){
        if (floor >= minFloor && floor <= maxFloor) {
            if (floor > currentFloor) {
                while(currentFloor < floor){
                    moveUp();
                    System.out.println(currentFloor);
                }
            } else  {
                while(currentFloor > floor){
                    moveDown();
                    System.out.println(currentFloor);
                }
            }
        } else {
            System.out.println("Invalid Floor");
        }
    }
}
