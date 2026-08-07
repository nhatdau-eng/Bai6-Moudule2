package Circle_and_Cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cyl1 = new Cylinder(4.0, "green", 10.0);
        System.out.println(cyl1);
        System.out.println("The tich: " + cyl1.getVolume());

        Cylinder cyl2 = new Cylinder();  // dùng constructor mặc định
        System.out.println(cyl2);

        cyl2.setRadius(2.0);   // gọi được setter kế thừa từ Circle
        cyl2.setHeight(5.0);
        cyl2.setColor("purple");
        System.out.println("Sau khi thay doi: " + cyl2);

        // Kiểm thử tính đa hình (polymorphism): dùng biến kiểu Circle để trỏ tới object Cylinder
        Circle shape = new Cylinder(3.0, "orange", 7.0);
        System.out.println("In qua bien kieu Circle: " + shape);
        // shape.toString() vẫn gọi ĐÚNG phiên bản override của Cylinder, không phải của Circle
    }
}