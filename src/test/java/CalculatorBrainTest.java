import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorBrainTest {
    CalculatorBrain calculatorBrain = new CalculatorBrain();
    @Test
    public void addTwoPositiveNumbers() {
        int expectedResult = 5;
        int actualResult = calculatorBrain.add(3,2);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void addPositiveAndNegativeNumber() {
        int expectedResult = -5;
        int actualResult = calculatorBrain.add(-7,2);
        assertEquals(expectedResult, actualResult);

    }


}