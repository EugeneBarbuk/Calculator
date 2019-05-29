package by.epam.barbuk.lab.tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CalculatorDivDoubleJunitTest extends BaseCalculatorJunitTest {
    @ParameterizedTest
    @MethodSource("valuesForDivDoubleTest")
    void testDivDouble(double a, double b, double expectedResult) {
        double result = calculator.div(a, b);
        Assertions.assertEquals(expectedResult, result, "Invalid result of div operation!");
    }


    @Test
    void testDivZero() {
        Assertions.assertThrows(NumberFormatException.class, () -> calculator.div(0.0,0.0));
    }

    static Stream<Arguments> valuesForDivDoubleTest() {
        return Stream.of(Arguments.of(10.10, 10, 1.01),
                Arguments.of(0.0, 10, 0.0)
                );


    }


}
