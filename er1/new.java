public class Calculator {
    
    // Add two numbers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    // Multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    // Divide two numbers
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
    
    // Main method
    public static void main(String[] args) {
        System.out.println("Addition: " + add(10, 5));
        System.out.println("Subtraction: " + subtract(10, 5));
        System.out.println("Multiplication: " + multiply(10, 5));
        System.out.println("Division: " + divide(10, 5));
    }
}
