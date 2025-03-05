package lv1_calculator_without_class;

import lv2_calculator_with_class.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // while loop
        boolean isFinished = false;
        while(!isFinished) {
            // First number
            System.out.print("Type 1st integer number: ");
            int firstNumber = scanner.nextInt();
            scanner.nextLine(); // 엔터(\n) 제거

            // Operator
            System.out.println("Your 1st number is " + firstNumber + ".\nType your operator(+, -, /, *) with double quotes: ");
            String operator = scanner.nextLine();

            // Second number
            System.out.println("Your operator is " + operator + ".\nType 2nd integer number: ");
            int secondNumber = scanner.nextInt();
            System.out.println("Your 2nd number is " + secondNumber + ".");

            // Calculation
            int result = 0;
            switch (operator) {

                case "+":
                    result = firstNumber + secondNumber;
                    break;

                case "-":
                    result = firstNumber - secondNumber;
                    break;

                case "/":
                    //반복문 쓰면 0 안넣을때까지 반복됨 > 가성비를 위해 위치생각해야함(효율성을 위하여)
                    while (secondNumber == 0) {
                        System.out.println("Division by zero is not allowed. Please type again.\nType 2nd integer number:");
                        secondNumber = scanner.nextInt();
                    }
                    result = firstNumber / secondNumber;
                    break;

                case "*":
                    result = firstNumber * secondNumber;
                    break;

                default:
                    System.out.println("You typed something wrong.");
                    return;
            }

            System.out.println("You typed: " + firstNumber + " " + operator + " " + secondNumber + ". The result is " + result + ".");

            // Ask if it is finished
            System.out.print("Type 'exit' to quit, type anything to keep running: ");
            scanner.nextLine();
            isFinished = scanner.nextLine().equals("exit");

        }
    }
}