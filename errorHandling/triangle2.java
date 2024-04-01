package errorHandling;

import java.util.Scanner;

public class triangle2 {
    private double base;
    private double height;

    // get
    public double getBase() {
        return base;
    }

    // Set
    public void setBase(double base) {
        this.base = base;
    }

    // Get
    public double getHeight() {
        return height;
    }

    // set height
    public void setHeight(double height) {
        this.height = height;
    }

    // area
    public double calculateArea() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        triangle2 triangle = new triangle2();

        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        triangle.setBase(base);

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        triangle.setHeight(height);

        double area = triangle.calculateArea();

        System.out.println("The area of the triangle is: " + area);
    }
}
