package org.example;

public class GasolineCar extends AFuelCar{

    public GasolineCar(String registrationNumber,
                       String make,
                       String model,
                       int numberOfDoors,
                       Double kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }
    @Override
    public Double getRegistrationFee(){
        return calculateFee(kmPrLitre);
    }

    @Override
    String getFuelTyoe() {
        return "Gasoline";
    }
}
