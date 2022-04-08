import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionServiceTest {

    private AdditionService additionService;

    @BeforeEach
    void setUp() {
        additionService = new AdditionService();
    }

    @Test
    void getSum() {
        int result = additionService.getSum(1, 2);

        assertEquals(3, result, "Results do not match");
    }
}