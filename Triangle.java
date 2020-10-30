public class Triangle{
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2,double x3, double y3){
    Point v1 = new Point(x1, y1);
    Point v2 = new Point(x2, y2);
    Point v3 = new Point(x3, y3);
  }

  public double getPerimeter(){
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public double getArea(){
    return Math.sqrt(getPerimeter() * (getPerimeter() - v1.distanceTo(v2)) * (getPerimeter() - v2.distanceTo(v3)) * (getPerimeter() - v3.distanceTo(v1)));
  }

  public String classify(){
    if(v1.distanceTo(v2)==v2.distanceTo(v3) && v2.distanceTo(v3)==v1.distanceTo(v3) && v1.distanceTo(v2)==v1.distanceTo(v3)){
      return "equilateral";
    }
    else if(v1.distanceTo(v2)==v2.distanceTo(v3) || v2.distanceTo(v3)==v1.distanceTo(v3) || v1.distanceTo(v2)==v1.distanceTo(v3)){
      return "isosceles";
    }
    else{
      return "scalene";
    }
  }

  public String toString(){
    return "v1(" + v1.getX() + ", " + v1.getY() + ") v2(" + v2.getX() + ", " + v2.getY() + ") v3(" + v3.getX() + ", " + v3.getY() + ")";
  }

}
