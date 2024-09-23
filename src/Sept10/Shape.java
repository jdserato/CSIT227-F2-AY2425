package Sept10;

public abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double area();
    abstract double perimeter();

    @Override
    public String toString() {
        return "A shape that is color " + color;
    }
}
