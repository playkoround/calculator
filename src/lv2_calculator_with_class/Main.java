package lv2_calculator_with_class;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner 생성
        Scanner scanner = new Scanner(System.in);

        // calculator 객체화
        Calculator calculator = new Calculator();

        // method 메서드 호출하기

        boolean isFinished = false;
        while(!isFinished) {
            // First number
            System.out.print("Type 1st integer number: ");
            int num1 = scanner.nextInt();
            scanner.nextLine(); // 엔터(\n) 제거

            // Operator
            System.out.println("Your 1st number is " + num1 + ".\nType your operator(+, -, /, *) with double quotes: ");
            String operator = scanner.nextLine();

            // Second number
            System.out.println("Your operator is " + operator + ".\nType 2nd integer number: ");
            int num2 = scanner.nextInt();
            System.out.println("Your 2nd number is " + num2 + ".");

            // Calculate



            // Ask if it is finished
            System.out.print("Type 'exit' to quit, type anything to keep running: ");
            scanner.nextLine();
            isFinished = scanner.nextLine().equals("exit");

        }

        }
}
