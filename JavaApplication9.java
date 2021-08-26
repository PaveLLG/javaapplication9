public class JavaApplication9 {

    public static void main(String[] args){

        System.out.println("Total pointer: " + Point2D.getPointsCounter());

        Point2D p1 = new Point2D();
        p1.setX(0);
        p1.setY(1);

        System.out.println(p1.getID() + " :" + p1 + ", length = " + p1.getLength());

        Point2D p2 = new Point2D(3, 4);
        System.out.println(p2.getID() + " :" + p2+ ", length = " + p2.getLength());

        System.out.println("Total pointer:  " + Point2D.getPointsCounter());

        System.out.println("Distance between = " + p1.distanceTo(p2));


       //     Class.forName("javaapplication9.Point2D");


    }
}
