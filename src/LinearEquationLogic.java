import java.util.Scanner;

public class LinearEquationLogic {
    private Scanner scanner;

    public LinearEquationLogic() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the Linear Equation Calculator!");
        String repeat = "yes";

        while (repeat.equals("yes")) {
            LinearEquation linearEquation = inputs();

            // Print the line information
            System.out.println(linearEquation.lineInfo());

            // Ask the user for an x value and print the corresponding point
            System.out.print("Enter an x value: ");
            double x = scanner.nextDouble();
            System.out.println("Point on the line: " + linearEquation.coordinateForX(x));

            // Ask the user if they want to repeat the process
            System.out.print("Do you want to calculate another line? (yes/no): ");
            repeat = scanner.next();
        }
    }

    private LinearEquation inputs() {
        System.out.print("Enter coordinate 1: ");
        String coordinates = scanner.nextLine();
        int stringAsInt = Integer.parseInt(coordinates);

        System.out.print("Enter coordinate 2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        return new LinearEquation(x1, y1, x2, y2);
    }
}