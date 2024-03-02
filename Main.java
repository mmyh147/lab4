//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Test Circle
        Circle circle = new Circle(0, 0, 5);
        System.out.println("=========== Circle ================");
        circle.setRadius(3);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());

        // Test Rectangle
        Rectangle rectangle = new Rectangle(0, 0, 4, 6);
        System.out.println("=========== Rectangle ================");
        rectangle.setWidth(6);
        rectangle.setHeight(9);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Circumference: " + rectangle.calculateCircumference());

        // Test Triangle
        Triangle triangle = new Triangle(0, 0, 3, 4);
        System.out.println("=========== Triangle ================");
        triangle.setHeight(5);
        triangle.setBase(6);
        System.out.println("base: " + triangle.getBase());
        System.out.println("Height: " + triangle.getHeight());
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Circumference: " + triangle.calculateCircumference());
    }
}