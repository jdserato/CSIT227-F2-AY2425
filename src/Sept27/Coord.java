package Sept27;

public class Coord {
    int row;
    double col;

    public Coord(int row, double col) {
        this.row = row;
        this.col = col;
    }

    public Coord(int row) {
        this.row = row;
        col = 9;
    }

    @Override
    public String toString() {
        return "{" + row +
                "," + col +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coord) {
            Coord c = (Coord) obj;
            return this.row == c.row && this.col == c.col;
        }
        return super.equals(obj);
    }
}
