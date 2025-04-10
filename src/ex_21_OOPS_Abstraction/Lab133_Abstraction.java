package ex_21_OOPS_Abstraction;

public class Lab133_Abstraction {
    public static void main(String[] args) {
        // Shape shape = new Shape(); // Error - cannot instantiate abstract class

        Shape circle = new Circle("Red", 6.0);
        circle.display(); // Inherited concrete method
        System.out.println("Circle area: " + circle.calculateArea());
//        circle.displayCircleInfo();

        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);
        rectangle.display();
        System.out.println("Rectangle area: " + rectangle.calculateArea());
//        rectangle.displayCircleInfo();

        System.out.println("------------------------------");
        // Using Circle-specific method
        Circle myCircle = new Circle("Green", 3.0);
        myCircle.displayCircleInfo();
        // Using Rectangle-specific method
        Rectangle myrectangle = new Rectangle("Yellow", 5.0, 8.0);
        myrectangle.displayRectangleInfo();
    }
}
// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    public abstract double calculateArea();

    // Concrete method
    public void display() {
        System.out.println("This is a shape");
    }

    // Can have fields
    protected String color;

    // Can have constructor
    public Shape(String color) {
        this.color = color;

    }
}

// Concrete subclass
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // Calling abstract class constructor
        this.radius = radius;
    }

    // Implementing abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Can have additional methods
    public void displayCircleInfo() {
        System.out.println("Circle color: " + color + ", radius: " + radius);
    }
}

// Concrete subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method
    @Override
    public double calculateArea() {
        return length * width;
    }
    public void displayRectangleInfo() {
        System.out.println("Rectangle color: " + color + ", length: " + length+ ", width: " + width);
    }
}

class Triangle extends Shape{
   private double base;
   private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}


