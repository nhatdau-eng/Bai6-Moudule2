package Moveablepoint;

public class TestPoint {
    public static void main(String[] args) {
         Point p1 = new Point(); 
         System.out.print(p1);

         Point p2 = new Point(3.5f , 4.5f);
         System.out.print(p2);

         p2.setXY(10,20);
         System.out.println(p2);

         float[] xy = p2.getXY(); 

         System.out.print(xy[0]);
         
         System.out.print(xy[1]);
    }
}
