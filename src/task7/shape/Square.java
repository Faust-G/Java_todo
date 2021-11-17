package task7.shape;

public final class Square extends Rectangle {
    public Square() {
        this(5);
    }

    public Square(double side) {
        this(side,"red",true);
    }

    public Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.length + ", color: " + this.color;
    }
}
