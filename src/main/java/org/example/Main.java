package org.example;

public class Main {
    public static void main(String[] args) {

        Dimensions dim = new Dimensions( 10, 20, 15);
        Shipment shipment = new Shipment( dim, 5.5, "Aktau", true,
                "QW1234", false );

        Shipment copy = shipment.withNewAddress("Vienna");

        System.out.println();
        System.out.println("Original shipment: ");
        System.out.println("Address: " + shipment.getDeliveryAddress());
        System.out.println("Weight: " + shipment.getWeight());
        System.out.println("Dimensions: " + shipment.getDimensions().getWidth() + "x"
                + shipment.getDimensions().getHeight() + "x"
                + shipment.getDimensions().getLength());


        System.out.println("\nCopy: ");
        System.out.println("Address: " + copy.getDeliveryAddress());
        System.out.println("Weight: " + copy.getWeight());
        System.out.println("Dimensions: " + copy.getDimensions().getWidth() + "x"
                + copy.getDimensions().getHeight() + "x"
                + copy.getDimensions().getLength());

    }
}