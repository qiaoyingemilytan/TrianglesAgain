public class Tester{
  public static void main(String[] args){
    Point a = new Point(2, 3);
    Point b = new Point(5, 3);
    Point c = new Point(3.5, 6);
    Point d = new Point(3.5, 0);
    Triangle a1 = new Triangle(a,b,c);
    Triangle a2 = new Triangle(1, 2, 3 ,4, 5, 6);
    System.out.println(a.getX());
    System.out.println(a.getY());
    System.out.println(a.distanceTo(b));
    System.out.println(a.equals(b));
    System.out.println(a1.getPerimeter());
    System.out.println(a1.getArea());
    System.out.println(a2.classify());
    System.out.println(a1.toString());
    a1.setVertex(2, d);
    System.out.println(a1.toString());
  }
}
