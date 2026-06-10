import java.util.Scanner;

public class Maysbmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRecording = true;

        System.out.println("Maya's BMI Recorder");
        System.out.println("Enter height in meters and weight in kilograms.");

        while (continueRecording) {
            System.out.print("Enter height (m): ");
            double height = scanner.nextDouble();
            System.out.print("Enter weight (kg): ");
            double weight = scanner.nextDouble();

            if (height <= 0 || weight <= 0) {
                System.out.println("Invalid input. Height and weight must be positive numbers.");
            } else {
                double bodyMassIndex = weight / (height * height);
                System.out.printf("BMI = %.2f\n", bodyMassIndex);

                if (bodyMassIndex < 18.5) {
                    System.out.println("Category: Underweight");
                } else if (bodyMassIndex < 25.0) {
                    System.out.println("Category: Normal");
                } else {
                    System.out.println("Category: Overweight");
                }
            }

            System.out.print("Do you want to record another client? (yes/no): ");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("yes") && !userResponse.equalsIgnoreCase("y")) {
                continueRecording = false;
            }
            System.out.println();
        }

        System.out.println("Exiting BMI recorder. Goodbye!");
        scanner.close();
    }
}
