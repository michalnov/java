package sk.akademiasovy.java.cars;

public class Cars {
    private String brand;
    private String model;
    private String plate;
    private String fuelType;
    private float fuelConsumption;
    private float fuelLevel;
    private float reachableDistance;
    private int fuelMaxContain;
    private int price;
    private int actualSpeed;
    private int speedLimit;
    private boolean engineStarted;
    private boolean available;

    //      GETERS --------------------- GETERS

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public float getFuelLevel() {
        return fuelLevel;
    }

    public float getReachableDistance() {
        return reachableDistance;
    }

    public int getPrice() {
        return price;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getFuelMaxContain() {
        return fuelMaxContain;
    }

    //      SETERS --------------------- SETERS


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    private void setFuelLevel(float fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    /*private void setReachableDistance(float reachableDistance) {  //Private need to be recalculated
        this.reachableDistance = reachableDistance;
    }*/

    public void setPrice(int price) {
        this.price = price;
    }

    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    private void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setFuelMaxContain(int fuelMaxContain) {
        this.fuelMaxContain = fuelMaxContain;
    }

    //      CONSTRUCTORS --------------------- CONSTRUCTORS

    public Cars(String brand, String model, float fuelConsumption) {
        setDefaults();
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
    }

    public Cars(String brand, String model, float fuelConsumption, int price) {
        setDefaults();
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }



    public Cars() {
        setDefaults();
    }


    //      MY FUNCTIONS --------------------- MY FUNCTIONS

    // Private Functions
    private void setDefaults()
    {
        this.brand="undefined";
        this.model="undefined";
        this.plate="XX-000XX";
        this.fuelType="petrol";
        this.fuelMaxContain=45;
        this.fuelConsumption=5.5f;
        this.fuelLevel=10;
        this.reachableDistance=100*(this.fuelLevel / this.fuelConsumption);
        this.price=-1;
        this.actualSpeed=0;
        this.speedLimit=50;
        this.engineStarted=false;
        this.available =true;
    }

    private boolean canStart()
    {
        if (this.fuelLevel < 0.1f)
        {
            return false;
        }
        else
            return true;
    }

    // Public Functions

    public void recalculateRDistance()
    {
        this.reachableDistance=100*(this.fuelLevel / this.fuelConsumption);
    }

    public void printInfo()
    {
        System.out.println();
    }

    public boolean startEngine()
    {
        if (canStart())
        {
            setEngineStarted(true);
            return true;
        }
        else
            return false;
    }

    public void stopEngine()
    {
        setEngineStarted(false);
    }


    public boolean addFuel(float fuelAmount)
    {
        float actualLevel = this.fuelLevel;
        if (this.fuelMaxContain < (actualLevel + fuelAmount))
        {

            setFuelLevel((actualLevel + fuelAmount));
            return true;
        }
        else
            return false;
    }


}
