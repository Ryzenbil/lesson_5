public class Elevator {
    int currentFloor = 1;
    int minFloor;
    int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void move (int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Данный этаж в доме отсутствует ");
            return;
        }

        while (currentFloor != floor) {
            if (floor > currentFloor) {
                moveUp(floor);
            } else {
                moveDown(floor);
            }
        }
    }

    public void moveDown(int floor) {
        currentFloor = currentFloor > minFloor || currentFloor != floor ? currentFloor - 1 : currentFloor;
        System.out.println(currentFloor);
    }

    public void moveUp(int floor) {
        currentFloor = currentFloor < maxFloor || currentFloor != floor ? currentFloor + 1 : currentFloor;
        System.out.println(currentFloor);
    }
}