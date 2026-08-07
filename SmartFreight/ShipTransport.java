package SmartFreight;

public class ShipTransport extends Transport{
    
    private double portSurcharge;

    public ShipTransport(double baseWeight, double distance, double portSurcharge) {
        super(baseWeight, distance);
        this.portSurcharge = portSurcharge;
    }

    @Override
    public double calculateCost() {
        return (baseWeight * 0.8) + (distance * 1.0) + portSurcharge;
    }
}

