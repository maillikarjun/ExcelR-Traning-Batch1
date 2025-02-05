import java.util.Scanner;

public class Demo08 {

    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;  // Formula: Area = π * radius^2
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate and display the area
        double area = calculateArea(radius);
        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }
}