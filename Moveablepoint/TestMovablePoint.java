package Moveablepoint;
public class TestMovablePoint {
    public static void main(String[] args) {

        MovablePoint mp = new MovablePoint(1, 2, 0.5f, 1.5f);

        System.out.println(mp);

        mp.move();
        System.out.println(mp);

        mp.move();
        System.out.println(mp);

        mp.setSpeed(2, 3);
        mp.move();
        System.out.println(mp);
    }
}