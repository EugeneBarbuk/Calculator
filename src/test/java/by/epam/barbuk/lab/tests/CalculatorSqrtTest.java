package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorSqrtTest extends BaseCalculatorTest {
    @Test(dataProvider = "valuesForSqrtTest")
    public void testSqrt(double a, double expectedResult) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedResult, 1, "Invalid result of sqrt operation!");
    }

    @Test(dataProvider = "valuesForSqrtTestNegative")
    public void testSqrtNegative(double a, double expectedResult) {
        double result = calculator.sqrt(a);
        Assert.assertNotEquals(result, expectedResult, "Invalid result of sqrt operation!");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testSqrtNegativeNumber() {
        calculator.sqrt(-4);
    }

    @DataProvider(name = "valuesForSqrtTest")
    public Object[][] valuesForSqrt() {
        return new Object[][]{
                {100, 10},
                {4, 2},
                {0, 0},
                {10, 3.162},
        };
    }

    @DataProvider(name = "valuesForSqrtTestNegative")
    public Object[][] valuesForSqrtNegative() {
        return new Object[][]{
                {15, 10}
        };
    }
}
