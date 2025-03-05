package lv2_calculator_with_class;
import java.util.Scanner;

public class Calculator {

    // Calculation
    public int calculate(int num1, int num2, String operator) {

        int result = 0;
        switch (operator) {

            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "/":
                result = num1 / num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            default:
                System.out.println("You typed something wrong.");
                return 0;
        }

        return result;
        }
}
