package demo1.oops.excercise3;

public class RectangleMain3 {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(7,12);
        double area = rectangle1.getarea();
        double perimeter = rectangle1.getPerimeter();
        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);

        System.out.println("--------Set the new height and width of the rectangle :------------ ");
        rectangle1.setHeight(15);
        rectangle1.setWidth(8);
        System.out.println("New Area of Rectangle: " + rectangle1.getarea());
        System.out.println("New Parameter of Rectangle: " + rectangle1.getPerimeter());


    }
}
