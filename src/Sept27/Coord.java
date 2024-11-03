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
        return String.format("{%d, %.2f}",row,col);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coord) {
            Coord c = (Coord) obj;
            return this.row == c.row && this.col == c.col;
        }
        return super.equals(obj);
    }

    public double distance(Coord o) {
        return Math.sqrt(Math.pow(this.row - o.row,2)+Math.pow(this.col - o.col,2));
    }
}
