package by.epam.barbuk.lab.tests;


import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class CalculatorDivDoubleJunitTest extends BaseCalculatorJunitTest {
    @ParameterizedTest
    @MethodSource("valuesForDivDoubleTest")
    public void testDivDouble(double a, double b, double expectedResult) {
        double result = calculator.div(a, b);
        Assertions.assertEquals(expectedResult, result, "Invalid result of div operation!");
    }


    @Test
    public void testDivZero() {
        Assertions.assertThrows(NumberFormatException.class, () ->{
            calculator.div(0.0,0.0);
        } );
    }

    public static Stream<Arguments> valuesForDivDoubleTest() {
        return Stream.of(Arguments.of(10.10, 10, 1.01),
                Arguments.of(0.0, 10, 0.0)
                );


    }


}
