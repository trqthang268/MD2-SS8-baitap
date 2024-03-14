package baitap02;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(4,2);
        System.out.println("Tọa độ ban đầu");
        System.out.println(point2D);
        System.out.println("Tọa độ sau khi thay đổi");
        point2D.setXY(7,9);
        System.out.println(point2D);
        System.out.println("====================");

        Point3D point3D = new Point3D(1,2,3);
        System.out.println("Tọa độ ban đầu");
        System.out.println(point3D);
        System.out.println("Tọa độ sau khi thay đổi");
        point3D.setXYZ(7,9,10);
        System.out.println(point3D);
    }

}
