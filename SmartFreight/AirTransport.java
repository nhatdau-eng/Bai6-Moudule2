package SmartFreight;

public class AirTransport extends Transport {

    private double flightInsurance;

    public AirTransport(double baseWeight, double distance, double flightInsurance) {
        super(baseWeight, distance);
        this.flightInsurance = flightInsurance;
    }

    @Override
    public double calculateCost() {
        return (baseWeight * 5.0) + (distance * 4.0) + flightInsurance;
    }
}