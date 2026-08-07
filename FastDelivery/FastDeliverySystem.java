package FastDelivery;
abstract class Order {
    protected String id;
    public Order(String id) {
        this.id = id;
    }

    public abstract double calculateFee();
    public void addVoucher(String code) {
        System.out.println(id + " ap dung voucher: " + code);
    }
    public void addVoucher(String code, double extraDiscount) {
        System.out.println(id +" ap dung voucher: " 
                              + code +" giam them " 
                              +extraDiscount + "%");
    }
}
class StandardOrder extends Order {
    public StandardOrder(String id) {
        super(id);
    }
    @Override
    public double calculateFee() {
        return 15000;
    }
}
class ExpressOrder extends Order {
    public ExpressOrder(String id) {
        super(id);
    }
    @Override
    public double calculateFee() {
        return 30000;
    }
}
public class FastDeliverySystem {
    public static void main(String[] args) {

        Order[] orders = {

                new StandardOrder("STD01"),
                new ExpressOrder("EXP01"),
                new StandardOrder("STD02"),
                new ExpressOrder("EXP02")
        };

        System.out.println("Tinh cuoc");
        for (Order order : orders) {

            System.out.println(
                    order.id +
                    " -> " +
                    order.calculateFee());
        }
        System.out.println();

        System.out.println("OVERLOADING");

        orders[0].addVoucher("SALE10");

        orders[1].addVoucher("VIP20", 5);
    }
}