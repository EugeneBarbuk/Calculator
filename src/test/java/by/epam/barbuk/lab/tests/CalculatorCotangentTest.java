package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorCotangentTest extends BaseCalculatorTest {
    @Test(dataProvider = "valuesForCotangentTest")
    public void testCtg(double a, double expectedResult) {
        double result = calculator.ctg(a);
        Assert.assertEquals(result, expectedResult, 0.01, "Invalid result of cotangent operation!");
    }

    @Test(dataProvider = "valuesForCotangentTestNegative")
    public void testCtgNegative(double a, double expectedResult) {
        double result = calculator.ctg(a);
        Assert.assertNotEquals(result, expectedResult, 0.01, "Invalid result of cotangent operation!");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testCtgZero() {
        calculator.ctg(0);
    }

    @DataProvider(name = "valuesForCotangentTest")
    public Object[][] valuesForCtg() {
        return new Object[][]{
                {10, 1.543},
                {30, 0.156},
        };
    }

    @DataProvider(name = "valuesForCotangentTestNegative")
    public Object[][] valuesForCtgNegative() {
        return new Object[][]{
                {15, 10}
        };
    }
}
