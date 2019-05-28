package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorSumDoubleTest extends BaseCalculatorTest {
    @Test(dataProvider = "valuesForSumDoubleTest")
    public void testSumDoublePositive(double a, double b, double expectedResult) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of sum operation!");
    }

    @Test(dataProvider = "valuesForSumDoubleTestNegative")
    public void testSumDoubleNegative(double a, double b, double expectedResult) {
        double result = calculator.sum(a, b);
        Assert.assertNotEquals(result, expectedResult, "Invalid result of sum operation!");
    }

    @DataProvider(name = "valuesForSumDoubleTest")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {10.51, 23.48, 33.99},
                {10, -1.33, 8.67},
                {0, 0, 0},
                {-1, 10, 9}
        };
    }

    @DataProvider(name = "valuesForSumDoubleTestNegative")
    public Object[][] valuesForSumNegative() {
        return new Object[][]{
                {33.3, 12.17, 10.01}
        };
    }
}
