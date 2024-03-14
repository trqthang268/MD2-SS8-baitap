package baitap03;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1.5f,2.7f);
        System.out.println(point);
        System.out.println("==========");
        MoveablePoint moveablePoint = new MoveablePoint(1.9f,5.4f,3.0f,2.9f);
        System.out.println("Trước khi di chuyển");
        System.out.println(moveablePoint);
        System.out.println("Sau khi di chuyển");
        moveablePoint.move().move();
        System.out.println(moveablePoint);
    }
}
