package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorDivLongTest extends BaseCalculatorTest {
    @Test(dataProvider = "valuesForDivLongTest")
    public void testDivLong(long a, long b, long expectedResult) {
        long result = calculator.div(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of div operation!");
    }

    @Test(dataProvider = "valuesForDivLongTestNegative")
    public void testDivLongNegative(long a, long b, long expectedResult) {
        long result = calculator.div(a, b);
        Assert.assertNotEquals(result, expectedResult, "Invalid result of div operation!");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testDivZero() {
        calculator.div(0, 0);
    }

    @DataProvider(name = "valuesForDivLongTest")
    public Object[][] valuesForDiv() {
        return new Object[][]{
                {100, 10, 10},
                {10, -1, -10},
                {6, 3, 2}
        };
    }

    @DataProvider(name = "valuesForDivLongTestNegative")
    public Object[][] valuesForDivNegative() {
        return new Object[][]{
                {10, 10, 2}
        };
    }
}
