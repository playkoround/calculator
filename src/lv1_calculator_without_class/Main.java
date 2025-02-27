package lv1_calculator_without_class;

import lv2_calculator_with_class.Calculator;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First number
        System.out.print("Type 1st integer number: ");
        int firstNumber = scanner.nextInt();
        scanner.nextLine(); // 엔터(\n) 제거

        // Operator
        System.out.println( "Your 1st number is " + firstNumber + ".\nType your operator(+, -, /, *) with double quotes: ");
        String operator = scanner.nextLine();

        // Second number
        System.out.println("Your operator is " + operator + ".\nType 2nd integer number: ");
        int secondNumber = scanner.nextInt();
        System.out.println( "Your 2nd number is " + secondNumber + ".");

        // Calculation
        int result = 0;
        switch (operator){

                case "+":
                result = firstNumber + secondNumber;
                break;

                case "-":
                result = firstNumber - secondNumber;
                break;

                case "/":
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
    }

}
