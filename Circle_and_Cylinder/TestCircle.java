package Circle_and_Cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0, "blue");
        System.out.println(c1);
        System.out.println("Dien tich: " + c1.getArea());

        Circle c2 = new Circle();  // dùng constructor mặc định
        System.out.println(c2);

        c2.setRadius(3.5);
        c2.setColor("yellow");
        System.out.println("Sau khi thay doi: " + c2);
    }
}