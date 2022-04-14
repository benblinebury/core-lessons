package lessons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LessonOneServiceTest {

    private LessonOneService lessonOneService;

    @BeforeEach
    void setUp() {
        lessonOneService = new LessonOneService();
    }

    @Test
    void additionTest() {
        int firstInput = 3;
        int secondInput = 8;

        int result = lessonOneService.findSum(firstInput, secondInput);

        assertEquals(11, result, "Results do not match");
    }

    @Test
    void subtractionTest() {
        int firstInput = 18;
        int secondInput = 4;

        int result = lessonOneService.findDifference(firstInput, secondInput);

        assertEquals(14, result, "Results do not match");
    }

    @Test
    void multiplicationTest() {
        int firstInput = 7;
        int secondInput = 3;

        int result = lessonOneService.findProduct(firstInput, secondInput);

        assertEquals(21, result, "Results do not match");
    }

    @Test
    void divisionTest() {
        int firstInput = 10;
        int secondInput = 2;

        int result = lessonOneService.findQuotient(firstInput, secondInput);

        assertEquals(5, result, "Results do not match");
    }

    @Test
    void concatStringTest() {
        String firstInput = "My name is";
        String secondInput = "HAL";

        String result = lessonOneService.concatString(firstInput, secondInput);

        assertEquals("My name is HAL", result, "Results do not match");
    }

    @Test
    void reverseStringTest() {
        String firstInput = "My name is";
        String secondInput = "HAL";

        String result = lessonOneService.reverseStringToLowerCase(firstInput, secondInput);

        assertEquals("lah si eman ym", result, "Results do not match");
    }
}