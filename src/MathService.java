public class MathService {

    private final AdditionService additionService = new AdditionService();
    private final SubtractionService subtractionService = new SubtractionService();
    private final MultiplicationService multiplicationService = new MultiplicationService();
    private final DivisionService divisionService = new DivisionService();

    public void helloWorld(String name) {
        System.out.println("Hello " + name + "!");
    }

    public int getAnswerBasedOnOperationAndInputs(String operation, int firstInput, int secondInput) {
        if (operation.equalsIgnoreCase("add")) {
            return additionService.getSum(firstInput, secondInput);
        } else if (operation.equalsIgnoreCase("Subtract")) {
            return subtractionService.getDifference(firstInput, secondInput);
        } else if (operation.equalsIgnoreCase("Multiply")) {
            return multiplicationService.getProduct(firstInput, secondInput);
        } else {
            return divisionService.getQuotient(firstInput, secondInput);
        }
    }
}
