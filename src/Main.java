import java.util.Date;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Thread.sleep(3000);
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String osArch = System.getProperty("os.arch");
        System.out.println("Java-DOS v0.1.5 (C) 2025 user14923929 All rights reserved.");
        System.out.printf("Machine info: %s %s %s\n", osName, osVersion, osArch);
        Thread.sleep(5000);
        String javaVersion = System.getProperty("java.runtime.version");
        long startTime = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        String userInput;
        System.out.println("Search new versions on https://github.com/user14923929/Java-DOS");
        System.out.println("Version Java: " + javaVersion);
        System.out.println("\nType 'help' to see the list of commands.");
        try {
            while (true) {
                System.out.print("Java-DOS >>> ");
                userInput = input.next();
                if (userInput.equals("about")) {
                    System.out.println("Java-DOS v0.1.5 (C) 2025 user14923929 All rights reserved.");
                    System.out.println("Version Java: " + javaVersion);
                } else if (userInput.equals("dice")) {
                    int dice = (int) (Math.random() * 6) + 1;
                    System.out.println(dice);
                } else if (userInput.equals("calc")) {
                    System.out.println("Calculator");
                    System.out.println("Enter first number:");
                    double num1 = input.nextDouble();
                    System.out.println("Enter an operator (+, -, *, /, sin, cos):");
                    String operator = input.next();
                    double result;

                    if (operator.equals("sin")) {
                        result = Math.sin(num1);
                    } else if (operator.equals("cos")) {
                        result = Math.cos(num1);
                    } else {
                        System.out.println("Enter second number:");
                        double num2 = input.nextDouble();
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
                            default:
                                System.out.println("Error! operator is not correct");
                                continue;
                        }
                    }
                    System.out.println("The result is: " + result);
                } else if (userInput.equals("clear")) {
                    if (osName.toLowerCase().contains("win")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } else {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                    }
                } else if (userInput.equals("exit")) {
                    System.out.println("Exiting Java-DOS...");
                    break;
                } else if (userInput.equals("echo")) {
                    System.out.println("Enter message:");
                    input.nextLine(); // очистка после next()
                    String message = input.nextLine();
                    System.out.println(message);
                } else if (userInput.equals("help")) {
                    System.out.println("Available commands:");
                    System.out.println("  about   - Display information about Java-DOS");
                    System.out.println("  calc    - Calculator");
                    System.out.println("  clear   - Clean the screen");
                    System.out.println("  dice    - Just Dice :)");
                    System.out.println("  exit    - Exit Java-DOS");
                    System.out.println("  echo    - Print the message");
                    System.out.println("  help    - Display this help message");
                    System.out.println("  time    - Print the time");
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
            e.printStackTrace();
            System.exit(1);
        }
        input.close();
    }
}
