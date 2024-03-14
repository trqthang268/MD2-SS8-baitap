package baitap04;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){}

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(double v) {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Triangle(String color) {
        super(color);
    }

    @Override
    public String getColor(){
        return super.getColor();
    }

    @Override
    public void setColor(String color){
        super.setColor(color);
    }

    @Override
    public double getArea(){
        double p =(side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    @Override
    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color=" + this.getColor() +
                '}';
    }
}
