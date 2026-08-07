package SmartFreight;

public class DroneTransport extends Transport {

    private double batteryFee;

    public DroneTransport(double baseWeight, double distance, double batteryFee) {
        super(baseWeight, distance);
        this.batteryFee = batteryFee;
    }

    @Override
    public double calculateCost() {
        return (baseWeight * 3.0) + (distance * 2.5) + batteryFee;
    }
}