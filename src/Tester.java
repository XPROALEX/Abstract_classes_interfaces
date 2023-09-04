public class Tester {
    public static void main(String[] args) {
        Car car = new Car(4, 4, 25000.00);
        Boat boat = new Boat(30.0, 5000);
        car.doVehicleSound();
        car.showVehicleDetails();
        boat.doVehicleSound();
        boat.showVehicleDetails();
        System.out.println(boat.getBoatWeightandSpeed());
    }
}
