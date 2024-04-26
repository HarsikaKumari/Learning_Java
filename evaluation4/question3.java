package evaluation4;

public class question3 {
    public static void main(String[] args) {
        try {
            throw new Exception("This is a custom exception!");
        } catch (Exception e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }
    }
}
