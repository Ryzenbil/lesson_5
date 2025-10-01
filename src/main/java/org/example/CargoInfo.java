package org.example;

public class CargoInfo {
    private final Dimensions dimensions;
    private final int mass;
    private final String adress;
    private final boolean couldBeFlipOver;
    private final String  number;
    private final boolean isFragile;


    public CargoInfo (Dimensions dimensions, int mass, String adress, boolean couldBeFlipOver,
                      String number, boolean isFragile) {
        this.mass = mass;
        this.adress = adress;
        this.couldBeFlipOver = couldBeFlipOver;
        this.number = number;
        this.isFragile = isFragile;
        this.dimensions = dimensions;
    }

    public CargoInfo setAdress(String adress) {
        return new CargoInfo (dimensions, mass, adress, couldBeFlipOver, number, isFragile);
    }
    public CargoInfo setMass(int mass) {
        return new CargoInfo (dimensions, mass, adress, couldBeFlipOver, number, isFragile);
    }
    public Dimensions setDimensions(int width, int height,  int length) {
        return new Dimensions(width, height, length);
    }
    public String getAdress() {
        return adress;
    }
    public int getMass() {
        return mass;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }
    public String toString(){
        return "Dimensions: " + dimensions.toString() +
                "Mass: " + mass + "\n" +
                "Adress: " + adress + "\n" +
                "couldBeFlipOver:" + couldBeFlipOver + "\n" +
                "number: " + number + "\n" +
                "isFragile: " + isFragile;
    }
}
