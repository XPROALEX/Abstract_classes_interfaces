public class Boat extends Vehicle {
    private double maxKnotsSpeed;
    private int boatKilosWeight;

    public Boat(double maxSpeed, int weight) {
        super("Boat");
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    public String getBoatWeightandSpeed() {
        return "the boat weighs " + boatKilosWeight + " kg" + " and its maximum speed is " + maxKnotsSpeed + " knots ";
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Splash Splash!");
    }
}
