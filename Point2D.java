public class Point2D {

    private int x,y;

    public Point2D(){
        this(0,0);
    }

    public Point2D(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public final void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public final void setY(int y) {
        this.y = y;
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
}
