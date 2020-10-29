public class Tester{
  public static void main(String[] args){
    Point a = new Point(2, 3);
    Point b = new Point(3, 3);
    System.out.println(a.getX());
    System.out.println(a.getY());
    System.out.println(a.distanceTo(b));
  }
}
