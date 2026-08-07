package SmartFreight; 
import java.util.ArrayList;
import java.util.List;

public class FreightSystem {

    public static void main(String[] args) {

        List<Transport> orders = new ArrayList<>();
        orders.add(new TruckTransport(100, 50, 15));
        orders.add(new AirTransport(50, 1000, 200));
        orders.add(new ShipTransport(200, 300, 80));
        orders.add(new DroneTransport(20, 200, 30));
        double totalRevenue = 0;
        System.out.println("===== DANH SÁCH ĐƠN HÀNG =====");

        for (Transport order : orders) {
            double cost = order.calculateCost();
            System.out.println(order.getClass().getSimpleName()
                    + " : $" + cost);

            totalRevenue += cost;
        }
        System.out.println("------------------------------");
        System.out.println("Tong doang thu : $" + totalRevenue);
    }
}