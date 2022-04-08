import java.util.Scanner;

public class CoreJava {

    private static final String MATH = "math";
    private static final String COMEDY = "comedy";

    public static void main(String[] args) {
        CoreService coreService = new CoreService();
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter one of the following commands: math, comedy");
        String command = in.nextLine();

        if (MATH.equalsIgnoreCase(command)) {
            coreService.handleMath();
        } else if (COMEDY.equalsIgnoreCase(command)) {
            coreService.tellJoke();
        } else {
            System.out.println("Invalid command");
        }
    }
}
