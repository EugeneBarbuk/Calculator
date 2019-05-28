package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorCosineTest extends BaseCalculatorTest {
    @Test(dataProvider = "valuesForCosineTest", groups = "trigonometric")
    public void testCos(double a, double expectedResult) {
        double result = calculator.cos(a);
        Assert.assertEquals(result, expectedResult, 0.01, "Invalid result of cosine operation!");
    }

    @Test(dataProvider = "valuesForCosineTestNegative")
    public void testCosNegative(double a, double expectedResult) {
        double result = calculator.cos(a);
        Assert.assertNotEquals(result, expectedResult, 0.01, "Invalid result of cosine operation!");
    }

    @DataProvider(name = "valuesForCosineTest")
    public Object[][] valuesForCos() {
        return new Object[][]{
                {0, 1},
                {1, 0.540},
                {30, 0.154},
        };
    }

    @DataProvider(name = "valuesForCosineTestNegative")
    public Object[][] valuesForCosNegative() {
        return new Object[][]{
                {15, 10}
        };
    }
}
