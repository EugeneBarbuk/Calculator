package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorSubDoubleTest extends BaseCalculatorTest {
    @Test(dataProvider = "valuesForSubDoubleTest")
    public void testSubDouble(double a, double b, double expectedResult) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of sub operation!");
    }

    @Test(dataProvider = "valuesForSubDoubleTestNegative")
    public void testSubDoubleNegative(double a, double b, double expectedResult) {
        double result = calculator.sub(a, b);
        Assert.assertNotEquals(result, expectedResult, "Invalid result of sub operation!");
    }

    @DataProvider(name = "valuesForSubDoubleTest")
    public Object[][] valuesForSub() {
        return new Object[][]{
                {23.23, 10.13, 13.10},
                {10.11, -1.12, 11.23},
                {0.0, 0.0, 0.0},
                {10.10, 10.10, 0}
        };
    }

    @DataProvider(name = "valuesForSubDoubleTestNegative")
    public Object[][] valuesForSubNegative() {
        return new Object[][]{
                {33.17, 12.45, 10.22}
        };
    }
}
