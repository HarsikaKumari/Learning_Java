public class multipleInterface {
  public static void main (String[] args) {
    Rectangle r = new Rectangle(22, 4);
    r.Draw();
    System.out.println("Area of Rectangle = " + r.calculateArea ());
  }
}
interface Draw {
    void Draw();
  }
  interface circle extends Draw {
    double calculateArea();
  }
  class Rectangle implements circle {
    double a;
    double b;
    Rectangle (double a, double b) {
      this.a = a;
      this.b = b;
    }
    public void Draw() {
      System.out.println("It is a Rectangle!!");
    }
    public double calculateArea () {
      return a*b;
    }
  }
  