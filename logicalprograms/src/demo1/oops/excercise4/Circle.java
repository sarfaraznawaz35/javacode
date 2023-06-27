package demo1.oops.excercise4;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircleArea(){
        double area = radius * radius;
        return area;
    }

    public double getCircumference(){
        double circumference = Math.PI * radius;
        return circumference;
    }

}
