import java.util.Scanner;

public class RectangleOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get length and width from the user
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate and display the area
        double area = calculateRectangleArea(length, width);
        System.out.println("The area of the rectangle is: " + area);

        // Calculate and display the perimeter
        double perimeter = calculateRectanglePerimeter(length, width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the perimeter of a rectangle
    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}

import java.util.*;

public class Main {
  // Method to find factorial:-
  public static void printFactorial(int num){
    if (num < 0){
      System.out.println("Invalid input.");
      return;
    } 
    int factorial = 1;
    
    for (int i = num; i >= 1; i--){
      factorial = factorial * i;
    }
      System.out.println("The factorial of the Number is: " + factorial);
  }
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      printFactorial(num);
  }
}

import java.util.*;

public class Main {
  // Method to find average of three numbers:-
  public static int printAverage(int firstNum, int secondNum, int thirdNum){
    int totalNumber = 3;
    return (firstNum + secondNum + thirdNum)/totalNumber;
  }
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int firstNum = scan.nextInt();
      int secondNum = scan.nextInt();
      int thirdNum = scan.nextInt();
    System.out.println("The average of the three numbers is: " +  printAverage(firstNum, secondNum, thirdNum) );
  }
}

import java.util.*;

public class main {
    // method to find the sum of all the odd numbers from 1 to n;
    public static void sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of all the odd number between 1 and " + n + " is: " + sum);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        sum(n);
    }
}
