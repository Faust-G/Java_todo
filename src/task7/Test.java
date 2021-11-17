package task7;


import task7.shape.*;


public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast shape.Circle to shape.Shape
        System.out.println(s1); // which version? - Circle
        System.out.println(s1.getArea()); // which version? - Circle
        System.out.println(s1.getPerimeter()); // which version? - Circle
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
//        System.out.println(s1.getRadius()); // - s1 - Shape, getRadius() only Circle

        Circle c1 = (Circle)s1; // Downcast back to shape.Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

//        Shape s2 = new Shape(); // Shape - abstract class

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
//        System.out.println(s3.getLength()); - s3 - Shape, getLength() only Rectangle

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
//        System.out.println(s4.getSide()); - s4 - Shape, getSide() only Square

// Take note that we downcast shape.Shape s4 to shape.Rectangle,
// which is a superclass of shape.Square, instead of shape.Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
//        System.out.println(r2.getSide()); - r2 - Rectangle, getSide() only Square
        System.out.println(r2.getLength());

// Downcast shape.Rectangle r2 to shape.Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
