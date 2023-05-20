package multiaspect;

import java.util.EnumSet;

public class Bike extends Vehicle {

    private float batteryStatus;
    private float fuelAmount;
    private EngineType engineType;
    private boolean additionalSeat;

    public Bike(String brand, String model, EngineType engineType, boolean additionalSeat) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        switch (engineType) {
            case ELECTRIC -> batteryStatus = 100;
            case GASOLINE -> fuelAmount = 50;
        }
        this.additionalSeat = additionalSeat;
    }

    public float getBatteryStatus() throws Exception {
        if (engineType.equals(EngineType.ELECTRIC)) {
            return fuelAmount;
        }
        throw new Exception("It is not electric vehicle");
    }

    public void setBatteryStatus(float value) throws Exception {
        if (engineType.equals(EngineType.ELECTRIC)) {
            batteryStatus+=value;
            if (batteryStatus > 100) {
                batteryStatus = 100;
            }
            return;
        }
        throw new Exception("It is not electric vehicle");
    }

    public float getFuelAmount() throws Exception {
        if (engineType.equals(EngineType.GASOLINE)) {
            return fuelAmount;
        }
        throw new Exception("It is not combustion vehicle");
    }

    public void setFuelAmount(float value) throws Exception {
        if (engineType.equals(EngineType.GASOLINE)) {
            fuelAmount+=value;
            if (fuelAmount > 50) {
                fuelAmount = 50;
            }
            return;
        }
        throw new Exception("It is not combustion vehicle");
    }

    @Override
    public void vehicleData() {
        System.out.println("This is a bike");
        System.out.printf("Brand: %s%n", brand);
        System.out.printf("Model: %s%n", model);
        switch (engineType) {
            case ELECTRIC -> System.out.printf("This is a electric bike!%nCurrent battery status is: %s percent%n", batteryStatus);
            case GASOLINE -> System.out.printf("This is a gasoline bike!%nCurrent fuel amount is: %s liters%n", fuelAmount);
        }
        System.out.printf("Has additional seat: %s%n", additionalSeat);
    }

}
