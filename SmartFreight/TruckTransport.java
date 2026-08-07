package SmartFreight;

public class TruckTransport extends Transport{
    private double tollFee ; 
    public TruckTransport(double baseWeight , double distance , double tollFee){
        super(baseWeight, distance);
        this.tollFee = tollFee ; 
    }
    @Override 
    public double calculateCost(){
        return (baseWeight * 1.5 ) + (distance *2.0 ) + tollFee ;
    }
}
