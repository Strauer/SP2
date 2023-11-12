package org.example;

public abstract class ACar implements Car {
    String registrationNumber;
    String make;
    String model;
    int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    protected double calculateFee(Double measure) {
        if (measure >= 20)
            return 300.00;
        if (measure >= 15)
            return 1050.00;
        if (measure >= 10)
            return 2340.00;
        if (measure >= 5)
            return 5500.00;
        return 10470.00;
    }
}
