import java.util.Scanner;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiplication(int a, int b) {
        return a * b;
    }

    int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }

    int modulus(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }

    double percentage(int a, int b) {
        if (b != 0) {
            return (a * 100.0) / b;
        } else {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }
}

class CalculatorApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        int x, y;
        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Percentage");
            System.out.println("0. Quit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter first number: ");
                    x = sc.nextInt();
                    System.out.print("Enter second number: ");
                    y = sc.nextInt();
                    System.out.println("Addition = " + calc.add(x, y));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    x = sc.nextInt();
                    System.out.print("Enter second number: ");
                    y = sc.nextInt();
                    System.out.println("Subtraction = " + calc.subtract(x, y));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    x = sc.nextInt();
                    System.out.print("Enter second number: ");
                    y = sc.nextInt();
                    System.out.println("Multiplication = " + calc.multiplication(x, y));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    x = sc.nextInt();
                    System.out.print("Enter second number: ");
                    y = sc.nextInt();
                    System.out.println("Division = " + calc.division(x, y));
                    break;

                case 5:
                    System.out.print("Enter first number: ");
                    x = sc.nextInt();
                    System.out.print("Enter second number: ");
                    y = sc.nextInt();
                    System.out.println("Modulus = " + calc.modulus(x, y));
                    break;

                case 6:
                    System.out.print("Enter result value: ");
                    x = sc.nextInt();
                    System.out.print("Enter total value: ");
                    y = sc.nextInt();
                    System.out.println("Percentage = " + calc.percentage(x, y) + "%");
                    break;

                case 0:
                    System.out.println("Exiting program");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
