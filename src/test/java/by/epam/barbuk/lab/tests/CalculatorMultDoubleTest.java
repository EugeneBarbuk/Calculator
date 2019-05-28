package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorMultDoubleTest extends BaseCalculatorTest {
    @Test(dataProvider = "valuesForMultDoubleTest")
    public void testMultDouble(double a, double b, double expectedResult) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of mult operation!");
    }

    @Test(dataProvider = "valuesForMultDoubleTestNegative")
    public void testMultDoubleNegative(double a, double b, double expectedResult) {
        double result = calculator.mult(a, b);
        Assert.assertNotEquals(result, expectedResult, "Invalid result of mult operation!");
    }

    @DataProvider(name = "valuesForMultDoubleTest")
    public Object[][] valuesForMult() {
        return new Object[][]{
                {10, 23.1, 231.0},
                {10.5, -1, -10.5},
                {0, 0, 0},
                {2, 3, 6}
        };
    }

    @DataProvider(name = "valuesForMultDoubleTestNegative")
    public Object[][] valuesForMultNegative() {
        return new Object[][]{
                {33.33, 12.17, 100.02}
        };
    }
}
