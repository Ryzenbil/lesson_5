package org.example;

public class Shipment {
    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final boolean canBeFlipped;
    private final String registrationNumber;
    private final boolean isFragile;

    public Shipment(Dimensions dimensions, double weight, String deliveryAddress,
                    boolean canBeFlipped, String registrationNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.canBeFlipped = canBeFlipped;
        this.registrationNumber = registrationNumber;
        this.isFragile = isFragile;

    }


    public Dimensions getDimensions() {
        return dimensions;
    }
    public double getWeight() {
        return weight;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public boolean isCanBeFlipped() {
        return canBeFlipped;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public boolean isFragile() {
        return isFragile;
    }

    public Shipment withNewAddress(String newAddress) {
        return new Shipment(dimensions, weight, newAddress, canBeFlipped, registrationNumber, isFragile);
    }
    public Shipment withNewDimensions(Dimensions newDimensions) {
        return new Shipment(newDimensions, weight, deliveryAddress, canBeFlipped, registrationNumber, isFragile);
    }
    public Shipment withNewWeight(double NewWeight) {
        return new Shipment(dimensions, NewWeight, deliveryAddress, canBeFlipped, registrationNumber, isFragile);
    }
}
