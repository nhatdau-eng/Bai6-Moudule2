package SmartFreight;

public abstract class Transport {
    protected double baseWeight ; 
    protected double distance ; 

    public Transport(double baseWeight , double distance){
        this.baseWeight = baseWeight ; 
        this.distance = distance ; 
    }
    public abstract double calculateCost();
}
