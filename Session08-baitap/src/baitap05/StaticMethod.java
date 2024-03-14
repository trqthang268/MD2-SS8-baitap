package baitap05;

public class StaticMethod {
    private static final float PI = 3.14F;

    public static double calCircleArea(double R){
        return (PI*R*R);
    }
    public static double calRectangleArea(double width, double height){
        return width*height;
    }

    public static double calTriangleArea(double a, double b, double c){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
