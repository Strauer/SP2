package org.example;

public class DieselCar extends AFuelCar{
    boolean particleFilter;
    public DieselCar(String registrationNumber,
                     String make,
                     String model,
                     int numberOfDoors,
                     Double kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }
    boolean hasParticleFilter() {
        return particleFilter;
    }
    @Override
    public Double getRegistrationFee() {
        return calculateFee(kmPrLitre) + calculateTax(kmPrLitre);
    }

    private double calculateTax(Double measure) {
        Double additionalFee = hasParticleFilter() ? 0.00 : 1000.00;
        if (measure >= 20)
            return 130.00 + additionalFee;
        if (measure >= 15)
            return 1390.00 + additionalFee;
        if (measure >= 10)
            return 1850.00 + additionalFee;
        if (measure >= 5)
            return 2770.00 + additionalFee;
        return 15260.00 + additionalFee;
    }

    @Override
    String getFuelTyoe() {
        return "Diesel";
    }
}
