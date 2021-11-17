package task7.shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this(2,3);
    }

    public Rectangle(double width, double length) {
        this(width,length,"yellow",false);
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Shape: Rectangle, width: " + this.width + ", length: " + this
                .length + ", color: " + this.color;
    }
}
