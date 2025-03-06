package lv2_calculator_with_class;
import java.util.Queue;
import java.util.LinkedList;

public class Calculator {

    // Queue saving result (FIFO)
    private final Queue<Integer> results; //Queue 재할당 안하니 상수처리, 불변!

    // Array of results
    public Calculator() {
        this.results = new LinkedList<>();
    }

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

        results.add(result); // Save at result array
        return result;
    }

    //  Reading the result by getter
    public Queue<Integer> getResults() {
        return new LinkedList<>(results);
    }

    // Removing the oldest record
    public void removeResult() {
        if (!results.isEmpty()) {
            results.poll(); // remove the oldest records
        } else {
            System.out.println("There is nothing to remove.");
        }
    }
}