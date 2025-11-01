import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            char operator;
            double num1, num2, result;
            System.out.println("Choose an operator: +, -, *, or /");
            operator = input.next().charAt(0);
            System.out.println("Enter first number:");
            num1 = input.nextDouble();
            System.out.println("Enter second number:");
            num2 = input.nextDouble();
            switch (operator) {
                case '+' -> {
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                }
                case '-' -> {
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                }
                case '*' -> {
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                }
                case '/' -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
                default -> System.out.println("Invalid operator!");
            }
        }
    }
}