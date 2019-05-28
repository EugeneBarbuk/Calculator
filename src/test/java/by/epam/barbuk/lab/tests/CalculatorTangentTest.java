package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTangentTest extends BaseCalculatorTest {
    @Test(dataProvider = "valuesForTangentTest")
    public void testTg(double a, double expectedResult) {
        double result = calculator.tg(a);
        Assert.assertEquals(result, expectedResult, 0.01, "Invalid result of tangent operation!");
    }

    @Test(dataProvider = "valuesForTangentTestNegative")
    public void testTgNegative(double a, double expectedResult) {
        double result = calculator.tg(a);
        Assert.assertNotEquals(result, expectedResult, 0.01, "Invalid result of tangent operation!");
    }

    @DataProvider(name = "valuesForTangentTest")
    public Object[][] valuesForTg() {
        return new Object[][]{
                {0, 0},
                {10, 0.648},
                {30, -6.405},
        };
    }

    @DataProvider(name = "valuesForTangentTestNegative")
    public Object[][] valuesForTgNegative() {
        return new Object[][]{
                {15, 10}
        };
    }
}
