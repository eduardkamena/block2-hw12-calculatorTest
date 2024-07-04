package pro.sky.calculatorTest.Impl;

import org.junit.jupiter.api.Test;
import pro.sky.calculatorTest.exception.DivideOnNullException;
import pro.sky.calculatorTest.service.CalculatorService;
import pro.sky.calculatorTest.service.Impl.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.calculatorTest.constants.CalculatorServiceTestConstants.*;

public class CalculatorServiceImplTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    @Test
    public void plusTest() { // Метод сложения

        float actual = out.plus(NUMBER_ONE, NUMBER_TWO);
        float expected = NUMBER_ONE + NUMBER_TWO;

        float actual2 = out.plus(NUMBER_THREE, NUMBER_FOUR);
        float expected2 = NUMBER_THREE + NUMBER_FOUR;

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);

    }

    @Test
    public void minusTest() { // Метод сложения

        float actual = out.minus(NUMBER_ONE, NUMBER_TWO);
        float expected = NUMBER_ONE - NUMBER_TWO;

        float actual2 = out.minus(NUMBER_THREE, NUMBER_FOUR);
        float expected2 = NUMBER_THREE - NUMBER_FOUR;

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);

    }

    @Test
    public void multiplyTest() { // Метод сложения

        float actual = out.multiply(NUMBER_ONE, NUMBER_TWO);
        float expected = NUMBER_ONE * NUMBER_TWO;

        float actual2 = out.multiply(NUMBER_THREE, NUMBER_FOUR);
        float expected2 = NUMBER_THREE * NUMBER_FOUR;

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);

    }

    @Test
    public void divideTest() { // Метод сложения

        float actual = out.divide(NUMBER_ONE, NUMBER_TWO);
        float expected = NUMBER_ONE / NUMBER_TWO;

        float actual2 = out.divide(NUMBER_ONE, NUMBER_TWO);
        float expected2 = NUMBER_ONE / NUMBER_TWO;

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);

    }

    @Test
    public void divideExceptionZeroTest() {

        assertThrows(DivideOnNullException.class, () -> out.divide(NUMBER_THREE, NUMBER_ZERO));

    }

}
