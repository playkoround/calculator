package lv2_calculator_with_class;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner 생성
        Calculator calculator = new Calculator(); // calculator 객체 생성

        // method 메서드 호출하기
        boolean isFinished = false;
        while(!isFinished) {
            // First number
            System.out.print("Type 1st integer number: ");
            int num1 = scanner.nextInt();
            scanner.nextLine(); // 엔터(\n) 공백 제거

            // Operator
            System.out.println("Your 1st number is " + num1 + ".\nType your operator(+, -, /, *): ");
            String operator = scanner.next();
            boolean isValid = false;
            while(!isValid) {
                if (operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*")) {
                isValid = true;
                } else {
                    System.out.println("Invalid operator. Please enter one of +, -, /, *.");
                    operator = scanner.next();
                }
            }
            // Second number
            System.out.println("Your operator is " + operator + ".\nType 2nd integer number: ");
            int num2 = scanner.nextInt();
            if (operator.equals("/") && num2 == 0) {
                System.out.println("Division by zero is not allowed. Please type again.\nType 2nd integer number:");
            } else {
                num2 = scanner.nextInt();
            }
            System.out.println("Your 2nd number is " + num2 + ".");

            // Calculate
            int result = calculator.calculate(num1, num2, operator);
            System.out.println("You typed: " + num1 + " " + operator + " " + num2 + ". The result is " + result + ".");


            // Ask if it is finished
            System.out.print("Type 'exit' to quit, type anything to keep running: ");
            scanner.nextLine();
            isFinished = scanner.nextLine().equals("exit");

        }
    }
}
