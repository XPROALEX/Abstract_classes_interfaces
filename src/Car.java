public class Car extends Vehicle {
    private int numberOfDoors;
    private double carPrice;

    public Car(int numbersOfWheels, int numberOfDoors, double carPrice) {
        super("Car", numbersOfWheels);
        this.numberOfDoors = numberOfDoors;
        this.carPrice = carPrice;
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("This car has " + numberOfDoors + " Doors");
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Vroom!");
    }
}
