package lv2_calculator_with_class;
import java.util.Scanner;

public class Calculator {

    // 1. 속성(변수)



    // 2. 생성자




    // 3. 기능(메서드) - 나중에는 클래스마다 롤을 줘서 나누어서 관리함 , 인터페이스를 만들어서 합치는 등
//    Scanner
    Scanner scanner = new Scanner(System.in);


    // Calculation
    public int calculator(int num1, int num2, String operator) {

        int result = 0;
        switch (operator) {

            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "/":
                //반복문 쓰면 0 안넣을때까지 반복됨 > 가성비를 위해 위치생각해야함(효율성을 위하여)
                while (num2 == 0) {
                    System.out.println("Division by zero is not allowed. Please type again.\nType 2nd integer number:");
                    num2 = scanner.nextInt();
                }
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
