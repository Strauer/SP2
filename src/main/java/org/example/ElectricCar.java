package org.example;

public class ElectricCar extends ACar{
    Double batteryCapacity;
    Double maxRange;

    public ElectricCar(String registrationNumber,
                       String make,
                       String model,
                       int numberOfDoors,
                       Double batteryCapacity,
                       Double maxRange) {

        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }
    Double getBatteryCapacityKWh(){
        return batteryCapacity;
    }
    Double getMaxRangeKm(){
        return maxRange;
    }
    Double getWhPrKm(){
        return getBatteryCapacityKWh()/getMaxRangeKm();
    }

    @Override
    public Double getRegistrationFee(){
        Double toKmPrLitre = (getWhPrKm()/91.25)/100;
        return calculateFee(toKmPrLitre);
    }


}
