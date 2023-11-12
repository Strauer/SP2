package org.example;

public abstract class AFuelCar extends ACar {
    Double kmPrLitre;

    public AFuelCar(String registrationNumber,
                    String make,
                    String model,
                    int numberOfDoors,
                    Double kmPrLitre) {
        super(registrationNumber,make,model,numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract String getFuelTyoe();
    Double getKmPrLitre(){
        return kmPrLitre;
    }
}

