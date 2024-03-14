package baitap01;

public class Cylinde extends Circle{
    private double height;

    public Cylinde(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinde(double height) {
        this.height = height;
    }

    public Cylinde(double radius, String color) {
        super(radius, color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getCount(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinde{" +
                "radius= " + getRadius() +
                ", color= '" + getColor() + '\'' +
                ", height= " + height +
                ", Count= "+ getCount()+
                '}';
    }
}

