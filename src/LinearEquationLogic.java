import java.util.Scanner;

public class LinearEquationLogic {
    private Scanner scanner;
    private int x1;
    private int x2;
    private int y1;
    private int y2;


    public LinearEquationLogic() {
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the Linear Equation Calculator!");
        String repeat = "yes";

        while (repeat.equals("yes")) {
                LinearEquation linearEquation = inputs();
            if  (x1 != x2) {
                System.out.println(linearEquation.lineInfo());
                System.out.print("Enter an x value: ");
                double x = scanner.nextDouble();
                System.out.println("Point on the line: " + linearEquation.coordinateForX(x));
                scanner.nextLine();
                System.out.print("Do you want to calculate another line? (yes/no): ");
                repeat = scanner.nextLine();
            }else{
                System.out.println("The points are on a vertical line: " + x1);
                System.out.print("Do you want to calculate another line? (yes/no): ");
                repeat = scanner.nextLine();
            }
        }
    }
    private LinearEquation inputs() {
        System.out.print("Enter coordinate 1: ");
        String coordinates = scanner.nextLine();
         x1 = Integer.parseInt(coordinates.substring(1, coordinates.indexOf(",")));
         y1 = Integer.parseInt(coordinates.substring(coordinates.indexOf(",") + 2, coordinates.length()-1));
        System.out.print("Enter coordinate 2: ");
        String coordinates2 = scanner.nextLine();
         x2 = Integer.parseInt(coordinates2.substring(1, coordinates2.indexOf(",")));
         y2 = Integer.parseInt(coordinates2.substring(coordinates2.indexOf(",") + 2, coordinates2.length()-1));

        return new LinearEquation(x1, y1, x2, y2);
    }
}