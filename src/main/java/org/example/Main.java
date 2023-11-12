package org.example;


public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("DD77700", "BMW", "3Series", 5, 98.0, 500.00);
        GasolineCar gasolineCar = new GasolineCar("TT88800","Mercedes","S500", 4, 25.00);
        DieselCar dieselCar = new DieselCar("SS99900", "Audi","RS8", 4, 15.00,true);

        FleetOfCars fleet = new FleetOfCars();
        fleet.addCar(electricCar);
        fleet.addCar(gasolineCar);
        fleet.addCar(dieselCar);

        System.out.println(fleet);

        System.out.println("Total Fee: " + fleet.getTotalRegistrationFeeForFleet());
    }
}