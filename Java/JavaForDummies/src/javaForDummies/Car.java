package javaForDummies;

public class Car {
    // public variables
    public String manufacturerName;

    // private variables
    private String modelName;
    private String carKeyValue;
    private float fuelAmount;
    final private float amountOfFuelConsumedPerSecond = 0.02f;

    // default
    int engineCC;

    // protected
    protected int manufacturingYear;

    public Car() {
        manufacturerName = new String();
        modelName = new String();
        engineCC = 1000;
        fuelAmount = 0;
        manufacturingYear = 1999;
    }

    public Car(String carName) {
        manufacturerName = new String(carName);
        modelName = new String();
        engineCC = 1000;
        fuelAmount = 0;
        manufacturingYear = 1999;
    }

    public Car(String manufacturerName, String modelName, String carKeyValue, int engineCC, float fuelAmount) {
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
        this.carKeyValue = carKeyValue;
        this.engineCC = engineCC;
        this.fuelAmount = fuelAmount;
    }

    public float presentAmountOfFuel() {
        return fuelAmount;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public boolean hasAnyKeyValue() {
        if (carKeyValue != null) return true;
        else return false;
    }

    public boolean matchPass(String userInput) {
        return userInput.equals(carKeyValue);
    }

    public void printAllInfo() {
        System.out.println("\n\n");
        System.out.println("Manufacturer : "+manufacturerName);
        System.out.println("2nd car CC :"+engineCC);
        System.out.println("Amount of Fuel : "+presentAmountOfFuel()+"L");
        System.out.println("Amount of Fuel after adding 2L : "+presentAmountOfFuel()+"L");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.printAllInfo();
    }
}