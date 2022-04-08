import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CoreService {
    private static final String ADD = "add";
    private static final String SUBTRACT = "subtract";
    private static final String MULTIPLY = "Multiply";
    private static final String DIVIDE = "divide";
    private static final List<String> OPERATIONS = Arrays.asList(ADD, SUBTRACT, MULTIPLY, DIVIDE);

    void handleMath() {
        MathService mathService = new MathService();

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter one of the following arithmetic operations: add, subtract, multiply, divide");
        String operation = in.nextLine();

        if (!OPERATIONS.contains(operation)) {
            System.out.println("Ohnoes! You entered an invalid operation! Try again");
            operation = in.nextLine();
        } else {
            System.out.println("You entered operation: " + operation);
        }

        System.out.println("Please enter the first of two integers");

        int firstInput = in.nextInt();
        System.out.println("You entered integer: " + firstInput);

        System.out.println("Please enter the second and final integer");

        int secondInput = in.nextInt();
        System.out.println("You entered integer: " + secondInput);

        int result = mathService.getAnswerBasedOnOperationAndInputs(operation, firstInput, secondInput);

        System.out.println("When we " + operation + " " + firstInput + " and " + secondInput + " we get: " + result);
    }

    void tellJoke() {
        ComedyService comedyService = new ComedyService();

        comedyService.getJoke();
    }
}
