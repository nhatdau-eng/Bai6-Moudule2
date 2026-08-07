package Triangle;
import java.util.Scanner;

public class TestTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap canh thu nhat: ");
        double side1 = scanner.nextDouble();

        System.out.print("Nhap canh thu hai: ");
        double side2 = scanner.nextDouble();

        System.out.print("Nhap canh thu ba: ");
        double side3 = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Nhap mau sac: ");
        String color = scanner.nextLine();

        Triangle triangle = new Triangle(side1, side2, side3);

        triangle.setColor(color);

        System.out.println("\nThong tin tam giac");
        System.out.println(triangle);
        System.out.println("Mau sac: " + triangle.getColor());
        System.out.println("Chu vi: " + triangle.getPerimeter());
        System.out.println("Dien tich: " + triangle.getArea());

        scanner.close();
    }
}