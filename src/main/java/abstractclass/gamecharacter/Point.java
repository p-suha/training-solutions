package abstractclass.gamecharacter;

public final class Point {

    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point otherpoint) {
        long side1 = Math.abs(y - otherpoint.getY());
        long side2 = Math.abs(x - otherpoint.getX());

        long distance = (long) Math.sqrt((side1 * side1) + (side2 * side2));
        return distance;
    }
}
