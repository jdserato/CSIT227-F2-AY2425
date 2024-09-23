package Sept10;

public class Main {
    public static void main(String[] args) {
        Shape rec = new Rectangle("orange", 4,7);
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
        System.out.println(rec.toString());
        Shape sq = new Rectangle.Square("red", 5);
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        System.out.println(sq);
    }
}
