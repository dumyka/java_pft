package stqa;

public class Point{

  public  double x1, y1, x2, y2;

  public static void main (String[] args) {
    Point p1 = new Point();
    Point p2 = new Point();

    p1.x1 = -4;
    p1.y1 = 10;
    p2.x2 = 0;
    p2.y2 = 13;

    System.out.println("Расстояние между точками (" + p1.toString() + ") и (" + p2.toString1() + ") = " + distance(p1,p2));

  }

  public static double distance(Point p1, Point p2){

    return Math.sqrt((p2.x2 - p1.x1) * (p2.x2 - p1.x1) + (p2.y2 - p1.y1)*(p2.y2 - p1.y1));

  }

  @Override
  public String toString() {

    return this.x1 + ";" + this.y1;

  }


  public String toString1() {

    return this.x2 + ";" + this.y2;

  }
}
