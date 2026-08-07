package Point2D;

public class TestPoint3D {
    public static void main(String[] args) {
        // Kiểm thử constructor có tham số
        Point3D p1 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("p1: " + p1);

        // Kiểm thử constructor mặc định
        Point3D p2 = new Point3D();
        System.out.println("p2 (mac dinh): " + p2);

        // Kiểm thử getter/setter kế thừa từ Point2D vẫn dùng được
        p2.setX(5.0f);
        p2.setY(6.0f);
        p2.setZ(7.0f);
        System.out.println("p2 sau khi set rieng le: " + p2);
        System.out.println("Gia tri z cua p2: " + p2.getZ());

        // Kiểm thử setXYZ()
        p1.setXYZ(10.0f, 20.0f, 30.0f);
        System.out.println("p1 sau khi setXYZ: " + p1);

        // Kiểm thử getXYZ() - trả về mảng 3 phần tử
        float[] coords = p1.getXYZ();
        System.out.println("Mang toa do cua p1: x=" + coords[0] +
                            ", y=" + coords[1] + ", z=" + coords[2]);

        // Kiểm thử tính đa hình: dùng biến kiểu Point2D trỏ tới object Point3D
        Point2D shape = new Point3D(4.0f, 5.0f, 6.0f);
        System.out.println("In qua bien kieu Point2D: " + shape);
        // Vẫn gọi ĐÚNG toString() của Point3D nhờ dynamic method dispatch
    }
}