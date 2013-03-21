/**
 * Created with IntelliJ IDEA.
 * User: pabad
 * Date: 3/21/13
 * Time: 2:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Point {
    private final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

