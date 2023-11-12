package org.example;

import java.util.ArrayList;
import java.util.List;

public class FleetOfCars {
    List<Car> fleet;

    public FleetOfCars() {
        this.fleet = new ArrayList<>();
    }

    void addCar(Car car){
        fleet.add(car);
    }

    Double getTotalRegistrationFeeForFleet(){
        double total = 0.0;
        for (Car car : fleet) {
            total = total + car.getRegistrationFee();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Car car : fleet) {
            output.append(String.format("\n\n Car model: %s, make: %s, fee: %s",
                    car.getMake(), car.getModel(), car.getRegistrationFee()));
        }
        return output.toString();
    }
}
