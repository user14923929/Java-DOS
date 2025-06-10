import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        System.out.println("Java-DOS v0.1.0 (C) 2025 JavaIllia Project");
        System.out.println("Java version at the time of build: ");
        for (String s : Arrays.asList("java version \"24.0.1\" 2025-04-15\n" +
                "Java(TM) SE Runtime Environment (build 24.0.1+9-30)\n" +
                "Java HotSpot(TM) 64-Bit Server VM (build 24.0.1+9-30, mixed mode, sharing)")) {
            System.out.println(s);
        }
        System.out.println("\nType 'help' to see the list of commands.");
        while (true) {
            System.out.print("Java-DOS >>> ");
            userInput = input.next();
            if (userInput.equals("about")) {
                System.out.println("Java-DOS v0.1.0 (C) 2025 JavaIllia Project");
                System.out.println("Java-DOS is a simple command-line interface for Java.");
                for (String s : Arrays.asList("java version \"24.0.1\" 2025-04-15\n" +
                        "Java(TM) SE Runtime Environment (build 24.0.1+9-30)\n" +
                        "Java HotSpot(TM) 64-Bit Server VM (build 24.0.1+9-30, mixed mode, sharing)")) {
                    System.out.println(s);
                }
            } else if (userInput.equals("calc")) {
                System.out.println("Calculator");
                System.out.println("Enter first number:");
                double num1 = input.nextDouble();
                System.out.println("Enter second number:");
                double num2 = input.nextDouble();
                System.out.println("Enter an operator (+, -, *, /):");
                char operator = input.next().charAt(0);
                double result;
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Error! operator is not correct");
                        return;
                }
                System.out.println("The result is: " + result);
            }
            else if (userInput.equals("exit")) {
                System.out.println("Exiting Java-DOS...");
                break;
            }
            else if (userInput.equals("help")) {
                System.out.println("Available commands:");
                System.out.println("  about - Display information about Java-DOS");
                System.out.println("  calc - Calculator");
                System.out.println("  exit - Exit Java-DOS");
                System.out.println("  help - Display this help message");
            }
            else {
                System.out.println("Unknown command: " + userInput);
            }
        }
        input.close();
    }
}