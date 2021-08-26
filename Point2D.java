public class Point2D {

    private int x,y;
    private double length;
    private static int pointsCounter;
    private final int pointID;

    public Point2D(){
        this(0,0);
    }

    public Point2D(int x, int y) {
        setX(x);
        setY(y);
        pointID = pointsCounter++;
    }

    public int getX() {
        return x;
    }

    public final void setX(int x) {
        this.x = x;
        length();
    }

    public int getY() {
        return y;
    }

    public final void setY(int y) {
        this.y = y;
        length();
    }

    public double getLength() {
        return length;
    }

    public int getID(){
        return pointID;
    }

    public static int getPointsCounter() {
        return pointsCounter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(x);
        sb.append(", ");
        sb.append(y);
        sb.append(")");

        return sb.toString();
    }

    private void length(){
        length = Math.sqrt(x*x + y*y);
    }
}
