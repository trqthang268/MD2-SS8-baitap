package baitap04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Nhập độ dài cạnh 1");
        triangle.setSide1(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập độ dài cạnh 2");
        triangle.setSide2(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập độ dài cạnh 3");
        triangle.setSide3(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập màu tam giác");
        triangle.setColor(scanner.nextLine());

        System.out.println("Diện tích tam giác là: "+triangle.getArea());
        System.out.println("Chu vi tam giac là: "+triangle.getPerimeter());
        System.out.println(triangle);

    }
}
