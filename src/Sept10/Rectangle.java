package Sept10;

public class Rectangle extends Shape {
    double length, width;
    Rectangle(String color, double length, double width) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return super.toString() + " and is a rectangle";
    }

    public static class Square extends Rectangle {
        Square(String color, double side) {
            super(color, side, side);
        }

        @Override
        public String toString() {
            return super.toString() + " and a square";
        }
    }
}
