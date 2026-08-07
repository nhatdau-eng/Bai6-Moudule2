package Point2D;

public class TestPoint2D {
    public static void main(String[] args) {
        // Kiểm thử constructor có tham số
        Point2D p1 = new Point2D(3.0f, 4.0f);
        System.out.println("p1: " + p1);

        // Kiểm thử constructor mặc định
        Point2D p2 = new Point2D();
        System.out.println("p2 (mac dinh): " + p2);

        // Kiểm thử getter/setter riêng lẻ
        p2.setX(1.5f);
        p2.setY(2.5f);
        System.out.println("p2 sau khi set rieng le: " + p2);
        System.out.println("Gia tri x cua p2: " + p2.getX());
        System.out.println("Gia tri y cua p2: " + p2.getY());

        // Kiểm thử setXY()
        p1.setXY(10.0f, 20.0f);
        System.out.println("p1 sau khi setXY: " + p1);

        // Kiểm thử getXY() - trả về mảng
        float[] coords = p1.getXY();
        System.out.println("Mang toa do cua p1: x=" + coords[0] + ", y=" + coords[1]);
    }
}