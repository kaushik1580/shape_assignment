public class Rectangle extends Shape{
  private double length;
  private double breadth;

  public Rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public double getLength() {
    return length;
  }

  public double getBreadth() {
    return breadth;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public void setBreadth(double breadth) {
    this.breadth = breadth;
  }

  @Override
  double calculatePerimeter() {
    return 2 * (length + breadth);
  }

  @Override
  double calculateArea() {
    return length * breadth;
  }
}
