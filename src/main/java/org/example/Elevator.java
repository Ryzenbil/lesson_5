package org.example;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor = -3;
    private int maxfloor = 26;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxfloor = maxFloor;
        this.currentFloor = 1;

    }

    public int getCurrentFloor() {
        return currentFloor;
    }
    public void moveUp() {
        currentFloor++;
    }
    public void moveDown() {
        currentFloor--;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxfloor) {
            System.out.println( "Error: floor is out of range :(" );
            return;
        }

        while(currentFloor != floor)
            if (floor > currentFloor) {
                moveUp();
            } else  {
                moveDown();
            }
        System.out.println( "Current floor: " + currentFloor);

    }



}
