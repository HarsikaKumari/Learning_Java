package errorHandling;

public class throwFinally {
    public static void main(String[] args) {
        
    int a = 10;
    int b = 0;
    // int c = a/b;
 
    try {
        System.err.println("Part before error!");
        int err = a / b; // This line throws ArithmeticException
        System.err.println("Part after error!");
    } catch (ArithmeticException e) {
        System.err.println("Arithmetic error occurred!");
    } finally {
        System.err.println("Finally block printed!");
    }
  }    
}

