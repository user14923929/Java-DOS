import java.util.Date;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.runtime.version");
        long startTime = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        String userInput;
        System.out.println("Java-DOS v0.1.2 (C) 2025 user14923929 All rights reserved.");
        System.out.println("Java-DOS is a simple command-line interface for Java.");
        System.out.println("Version Java: " + javaVersion);
        System.out.println("\nType 'help' to see the list of commands.");
        try {
            while (true) {
                System.out.print("Java-DOS >>> ");
                userInput = input.next();
                if (userInput.equals("about")) {
                    System.out.println("Java-DOS v0.1.2 (C) 2025 user14923929 All rights reserved.");
                    System.out.println("Java-DOS is a simple command-line interface for Java.");
                    System.out.println("Версия Java: " + javaVersion);
                } else if (userInput.equals("dice")) {
                    System.out.println(Math.round((Math.random() * 6) + 1));
                } else if (userInput.equals("calc")) {
                    System.out.println("Calculator");
                    System.out.println("Enter first number:");
                    double num1 = input.nextDouble();
                    System.out.println("Enter second number:");
                    double num2 = input.nextDouble();
                    System.out.println("Enter an operator (+, -, *, /, sin, cos):");
                    String operator = input.next();
                    double result;
                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                        case "sin":
                            result = Math.sin(num1);
                            break;
                        case "cos":
                            result = Math.cos(num1);
                            break;
                        default:
                            System.out.println("Error! operator is not correct");
                            return;
                    }
                    System.out.println("The result is: " + result);
                } else if (userInput.equals("exit")) {
                    System.out.println("Exiting Java-DOS...");
                    break;
                } else if (userInput.equals("echo")) {
                    System.out.println("Enter message");
                    String message = input.next();
                    System.out.println(message);
                } else if (userInput.equals("help")) {
                    System.out.println("Available commands:");
                    System.out.println("  about - Display information about Java-DOS");
                    System.out.println("  calc - Calculator");
                    System.out.println("  dice - Just Dice :)");
                    System.out.println("  exit - Exit Java-DOS");
                    System.out.println("  echo - Print the message");
                    System.out.println("  help - Display this help message");
                    System.out.println("  time - Print the time");
                    System.out.println("  runtime - Print the system runtime");
                } else if (userInput.equals("time")) {
                    Date currentDate = new Date();
                    System.out.println(currentDate);
                } else if (userInput.equals("runtime")) {
                    long endTime = System.currentTimeMillis();
                    long duration = endTime - startTime;
                    System.out.println("System runtime: " + duration + " milliseconds (" + duration / 1000 + " seconds)");
                } else {
                    System.out.println("Unknown command: " + userInput);
                }
            }
        } catch (Exception e) {
            System.out.println("JSC Manager v1.0");
            System.out.println("System crashed with code: " + e);
            while (true) {

            }
        }
        input.close();
    }
}
