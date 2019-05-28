package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorSinusTest extends BaseCalculatorTest {
    @Test( groups = "trigonometric" , dataProvider = "valuesForSinusTest")
    public void testSin(double a, double expectedResult) {
        double result = calculator.sin(a);
        Assert.assertEquals(result, expectedResult, 0.01, "Invalid result of sinus operation!");
    }

    @Test(dataProvider = "valuesForSinusTestNegative")
    public void testSinNegative(double a, double expectedResult) {
        double result = calculator.sin(a);
        Assert.assertNotEquals(result, expectedResult, 0.01, "Invalid result of sinus operation!");
    }

    @DataProvider(name = "valuesForSinusTest")
    public Object[][] valuesForSin() {
        return new Object[][]{
                {0, 0},
                {1, 0.8414},
                {30, -0.988},
        };
    }

    @DataProvider(name = "valuesForSinusTestNegative")
    public Object[][] valuesForSinNegative() {
        return new Object[][]{
                {15, 10}
        };
    }
}
