abstract class Vehicle {
    private String type;
    private int numberOfWheels;

    public Vehicle(String type, int numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public Vehicle(String type) {
        this.type = type;
    }

    public void showVehicleDetails() {
        System.out.println("This vehicle is : " + type + " and it has " + numberOfWheels + " wheels.");
    }

    public abstract void doVehicleSound();

}
