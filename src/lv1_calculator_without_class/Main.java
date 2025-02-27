package lv1_calculator_without_class;

import lv2_calculator_with_class.Calculator;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // First number
        System.out.print("Type 1st integer number: ");
        Scanner firstScanner = new Scanner(System.in);
        int firstNumber = firstScanner.nextInt();
        System.out.println( "Your 1st number is " + firstNumber + ".\nType your operator(+, -, /, *) with double quotes: ");

        // Operator
        Scanner operatorScanner = new Scanner(System.in);
        String operator = operatorScanner.nextLine();
        System.out.println("Your operator is " + operator + ".\nType 2nd integer number: ");

        // Second number
        Scanner secondScanner = new Scanner(System.in);
        int secondNumber = secondScanner.nextInt();
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
        System.out.println("You typed" + firstNumber + operator + secondNumber + ". The result is " + result + ".");
    }

}
