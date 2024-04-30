public class multipleInterface {
  public static void main (String[] args) {
    Rectangle r = new Rectangle(22, 4);
    r.Draw();
    System.out.println("Area of Rectangle = " + r.calculateArea ());
  }
}
interface Draw {
    void draw();
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
//   The code you've provided has a few issues that need to be addressed:

// 1. **Interface Naming Convention**: In Java, the convention for interface names is to start with an uppercase letter. Your interface `circle` should be named `Circle`.

// 2. **Interface Extension**: The `circle` interface extends `Draw`, but it's not clear what `Draw` is supposed to be. If `Draw` is intended to be an interface, it should be defined before it's used. However, based on the context, it seems like you might have intended for `circle` to be a class that implements both `Draw` and `Circle` interfaces. In Java, a class can implement multiple interfaces, but an interface cannot extend another interface in the way you've attempted.

// 3. **Interface Implementation**: The `Rectangle` class is attempting to implement an interface named `circle`, which, as mentioned, should be `Circle` and should be an interface. However, the `Rectangle` class is also implementing a method `calculateArea()` which is not defined in the `Draw` interface. This is not an error per se, but it's important to ensure that all methods implemented in a class are defined in the interfaces it implements.

// 4. **Interface Method Signature**: The `Draw` interface defines a method `Draw()`. In Java, method names should start with a lowercase letter. So, it should be `draw()`.

// Here's a corrected version of your code with the above issues addressed:

// ```java
// public class MultipleInterface {
//  public static void main (String[] args) {
//     Rectangle r = new Rectangle(22, 4);
//     r.draw();
//     System.out.println("Area of Rectangle = " + r.calculateArea());
//  }
// }

// interface Draw {
//  void draw();
// }

// interface Circle {
//  double calculateArea();
// }

// class Rectangle implements Draw, Circle {
//  double a;
//  double b;
//  Rectangle (double a, double b) {
//     this.a = a;
//     this.b = b;
//  }
//  public void draw() {
//     System.out.println("It is a Rectangle!!");
//  }
//  public double calculateArea() {
//     return a*b;
//  }
// }
// ```

// Key changes:
// - Renamed `circle` to `Circle` and `Draw` to `draw()`.
// - Made `Rectangle` implement both `Draw` and `Circle` interfaces.
// - Corrected the method names to follow Java naming conventions.
