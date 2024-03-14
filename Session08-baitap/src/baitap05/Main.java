package baitap05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dien tich cac hinh tron :");
        System.out.println(StaticMethod.calCircleArea(3.6));
        System.out.println(StaticMethod.calCircleArea(6.0));
        System.out.println("======================");
        System.out.println("Dien tich cac hinh tam giac :");
        System.out.println(StaticMethod.calTriangleArea(1.2,3.5,2.0));
        System.out.println(StaticMethod.calTriangleArea(1.5,2.5,3));
        System.out.println("======================");
        System.out.println("Dien tich cac hinh chu nhat");
        System.out.println(StaticMethod.calRectangleArea(3.5,2.0));
        System.out.println(StaticMethod.calRectangleArea(5.5,2.5));
    }
}
