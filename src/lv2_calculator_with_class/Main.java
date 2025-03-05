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
            boolean isOperatorValid = false;
            while(!isOperatorValid) {
                if (operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*")) {
                isOperatorValid = true;
                } else {
                    System.out.println("Invalid operator. Please enter one of +, -, /, *.");
                    operator = scanner.next();
                }
            }
            // Second number
            System.out.println("Your operator is " + operator + ".\nType 2nd integer number: ");
            int num2 = scanner.nextInt();
            boolean isSecondNumberValid = false;
            while(!isSecondNumberValid) {
                if (operator.equals("/") && num2 == 0) {
                    System.out.println("Division by zero is not allowed. Please type again.\nType 2nd integer number:");
                    num2 = scanner.nextInt();
                } else {
                    isSecondNumberValid = true;
                }

            }
            System.out.println("Your 2nd number is " + num2 + ".");

            // Calculate
            int result = calculator.calculate(num1, num2, operator);
            System.out.println("You typed: " + num1 + " " + operator + " " + num2 + ". The result is " + result + ".");


            // Saving the result
            System.out.println("The result so far is " + calculator.getResults());

            // Removing the result
            System.out.print("Type 'remove' to delete the oldest record, type anything to keep running: ");
            String command = scanner.next();
            scanner.nextLine(); // 엔터(\n) 공백 제거
            if (command.equals("remove")) {
                calculator.removeResult();
                System.out.println("The result is deleted. The result so far is: " + calculator.getResults());
            }

            // Ask if it is finished
            System.out.print("Type 'exit' to quit, type anything to keep running: ");
            isFinished = scanner.nextLine().equals("exit");

        }

        scanner.close();
    }

        }

