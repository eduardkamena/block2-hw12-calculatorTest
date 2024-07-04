package pro.sky.calculatorTest.Impl;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculatorTest.service.CalculatorService;
import pro.sky.calculatorTest.service.Impl.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.calculatorTest.constants.CalculatorServiceTestConstants.*;

public class ParamCalculatorServiceImplTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForPlusTest() {
        return Stream.of(
                Arguments.of(NUMBER_ONE, NUMBER_TWO, RESULT_PLUS_ONE_TWO),
                Arguments.of(NUMBER_THREE, NUMBER_FOUR, RESULT_PLUS_THREE_FOUR));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPlusTest")
    public void plusParamsTest(float a, float b, float expected) {
        assertEquals(out.plus(a, b), expected);
    }

    public static Stream<Arguments> provideParamsForMinusTest() {
        return Stream.of(
                Arguments.of(NUMBER_ONE, NUMBER_TWO, RESULT_MINUS_ONE_TWO),
                Arguments.of(NUMBER_THREE, NUMBER_FOUR, RESULT_MINUS_THREE_FOUR));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTest")
    public void minusParamsTest(float a, float b, float expected) {
        assertEquals(out.minus(a, b), expected);
    }

    public static Stream<Arguments> provideParamsForMultiplyTest() {
        return Stream.of(
                Arguments.of(NUMBER_ONE, NUMBER_TWO, RESULT_MULTIPLY_ONE_TWO),
                Arguments.of(NUMBER_THREE, NUMBER_FOUR, RESULT_MULTIPLY_THREE_FOUR));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTest")
    public void multiplyParamsTest(float a, float b, float expected) {
        assertEquals(out.multiply(a, b), expected);
    }

    public static Stream<Arguments> provideParamsForDivideTest() {
        return Stream.of(
                Arguments.of(NUMBER_ONE, NUMBER_TWO, RESULT_DIVIDE_ONE_TWO),
                Arguments.of(NUMBER_THREE, NUMBER_FOUR, RESULT_DIVIDE_THREE_FOUR));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTest")
    public void divideParamsTest(float a, float b, float expected) {
        assertEquals(out.divide(a, b), expected);
    }

}
