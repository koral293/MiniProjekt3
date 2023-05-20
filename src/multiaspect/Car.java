package multiaspect;

public class Car extends Vehicle {


    private float batteryStatus;
    private float fuelAmount;
    private EngineType engineType;
    private boolean tintedWindows;
    private int seatsCount;

    public Car(String brand, String model, EngineType engineType, boolean tintedWindows, int seatsCount) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        switch (engineType) {
            case ELECTRIC -> batteryStatus = 100;
            case GASOLINE -> fuelAmount = 80;
        }
        this.tintedWindows = tintedWindows;
        this.seatsCount = seatsCount;
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
            if (fuelAmount > 80) {
                fuelAmount = 80;
            }
            return;
        }
        throw new Exception("It is not combustion vehicle");
    }

    @Override
    public void vehicleData() {
        System.out.println("This is a car");
        System.out.printf("Brand: %s%n", brand);
        System.out.printf("Model: %s%n", model);
        switch (engineType) {
            case ELECTRIC -> System.out.printf("This is a electric car!%nCurrent battery status is: %s percent%n", batteryStatus);
            case GASOLINE -> System.out.printf("This is a gasoline car!%nCurrent fuel amount is: %s liters%n", fuelAmount);
        }
        System.out.printf("Has tinted windows: %s%n", tintedWindows);
        System.out.printf("Seats count: %s%n", seatsCount);
    }

}
