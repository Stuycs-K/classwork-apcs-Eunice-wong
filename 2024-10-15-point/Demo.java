public class Demo{

    /*
    Write this method third. Test it then move on
    to the others.
    */
    public static double distance(Point a, Point b){
      return (Math.sqrt(Math.pow(a.getX()-b.getX(),2) + Math.pow(a.getY()-b.getY(),2)));
    }
  
    public static void main(String[]args){
      Point p1 = new Point(1,1);
      Point p2 = new Point(-1,-1);
      Point p3 = new Point(3,4);
      Point p6 = new Point(5,6);
      Point p5 = new Point(10,3);
      System.out.println( p3);
      System.out.println( distance(p1,p2));
      System.out.println( Point.distance(p1,p2));
      System.out.println( Point.distance(p3, p6));
      System.out.println( Point.distance(p6, p5));
      System.out.println( p6.distanceTo(p5));
      System.out.println( p3.distanceTo(p6));
      System.out.println( p1.distanceTo(p2));
      Point p4 = new Point(p3);
      System.out.println("p3:" + p3 + "p4:" + p4);
      Point p7 = new Point(1, 1);
      Point p8 = new Point(0.5, (1-(2 * Math.sqrt(3))));
      Point p9 = new Point(1.5, (1-(2 * Math.sqrt(3))));
    }
  }
