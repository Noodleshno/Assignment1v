import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("Circle")) {
            System.out.println("Enter the radius of the circle:");
            double radius = scanner.nextDouble();

            Circle circle = new Circle(radius);
            System.out.println("Area: " + circle.area());
            System.out.println("Circumference: " + circle.circumference());
        } else if (input.equalsIgnoreCase("Cylinder")) {
            System.out.println("Radius:");
            double radius = scanner.nextDouble();
            System.out.println("Height:");
            double height = scanner.nextDouble();

            Cylinder cylinder = new Cylinder(radius, height);
            System.out.println("Surface Area: " + cylinder.surfaceArea());
            System.out.println("Volume: " + cylinder.volume());
        }

        scanner.close();
    }
}