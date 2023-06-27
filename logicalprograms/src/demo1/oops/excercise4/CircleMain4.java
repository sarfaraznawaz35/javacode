package demo1.oops.excercise4;

import java.util.Scanner;

public class CircleMain4 {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the radius of the Circle: ");
//        double r = sc.nextDouble();


        Circle circle1 = new Circle(5);
        double circleArea =    circle1.getCircleArea();
        double circumference = circle1.getCircumference();

        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Circumference of the Circle: " + circumference);

        System.out.println("----Updating radius of the Circle---------------");
        circle1.setRadius(8);
        System.out.println("Area of the circle: " + circle1.getCircleArea());
        System.out.println("Circumference of the Circle: " + circle1.getRadius());

    }
}
