package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorPowTest extends BaseCalculatorTest {
    @Test(dataProvider = "valuesForPowTest")
    public void testPow(double a, double b, double expectedResult) {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of pow operation!");
    }

    @Test(dataProvider = "valuesForPowTestNegative")
    public void testPowNegative(double a, double b, double expectedResult) {
        double result = calculator.pow(a, b);
        Assert.assertNotEquals(result, expectedResult, "Invalid result of pow operation!");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testPowNegativeNumberFractionalDegree() {
        calculator.pow(-2, 0.5);
    }

    @DataProvider(name = "valuesForPowTest")
    public Object[][] valuesForPow() {
        return new Object[][]{
                {10, 2, 100},
                {10, 3, 1000},
                {10, -1, 0.1},
                {-10, -1, -0.1},
                {100, 0.5, 10},
                {100, 0, 1},
                {0, 0, 1},
                {-5, 0, 1},
        };
    }

    @DataProvider(name = "valuesForPowTestNegative")
    public Object[][] valuesForPowNegative() {
        return new Object[][]{
                {15, 3, 225}
        };
    }
}
