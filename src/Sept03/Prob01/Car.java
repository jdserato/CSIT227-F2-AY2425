package Sept03.Prob01;

public class Car {
    private String color;
    private double price;
    private char size;

    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    @Override
    public String toString() {
        String s ="";
        switch (size) {
            case 'S':
                s = "small";
                break;
        }

        return "Car (" + color + ") - P" + String.format("%.2f", price) + " - " + s;
    }
}
