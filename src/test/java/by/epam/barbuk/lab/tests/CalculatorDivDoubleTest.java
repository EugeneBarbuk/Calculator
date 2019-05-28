package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorDivDoubleTest extends BaseCalculatorTest {
    @Test(dataProvider = "valuesForDivDoubleTest")
    public void testDivDouble(double a, double b, double expectedResult) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of div operation!");
    }

    @Test(dataProvider = "valuesForDivDoubleTestNegative")
    public void testDivDoubleNegative(double a, double b, double expectedResult) {
        double result = calculator.div(a, b);
        Assert.assertNotEquals(result, expectedResult, "Invalid result of div operation!");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testDivZero() {
        calculator.div(0.0, 0.0);
    }

    @DataProvider(name = "valuesForDivDoubleTest")
    public Object[][] valuesForDiv() {
        return new Object[][]{
                {100.10, 10, 10.01},
                {10.10, -1, -10.10},
                {6.0, 3.0, 2}
        };
    }

    @DataProvider(name = "valuesForDivDoubleTestNegative")
    public Object[][] valuesForDivNegative() {
        return new Object[][]{
                {10.23, 10.32, 2}
        };
    }
}
