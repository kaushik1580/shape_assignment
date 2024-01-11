public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Circle circle = new Circle(10);
    Square square = new Square(24);
    Rectangle rectangle = new Rectangle (10 , 15);


    System.out.println("Circle:");
    System.out.println("Radius: " + circle.getRadius());
    System.out.println("Area: " + circle.calculateArea());
    System.out.println("Perimeter: " + circle.calculatePerimeter());

    System.out.println("\nSquare:");
    System.out.println("Side Length: " + square.getLength());
    System.out.println("Area: " + square.calculateArea());
    System.out.println("Perimeter: " + square.calculatePerimeter());

    System.out.println("\nRectangle:");
    System.out.println("Length: " + rectangle.getLength());
    System.out.println("Width: " + rectangle.getBreadth());
    System.out.println("Area: " + rectangle.calculateArea());
    System.out.println("Perimeter: " + rectangle.calculatePerimeter());
  }
}