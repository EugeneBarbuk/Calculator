package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorMultLongTest extends BaseCalculatorTest {
    @Test(dataProvider = "valuesForMultLongTest")
    public void testMultLong(long a, long b, long expectedResult) {
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of mult operation!");
    }

    @Test(dataProvider = "valuesForMultLongTestNegative")
    public void testMultLongNegative(long a, long b, long expectedResult) {
        long result = calculator.mult(a, b);
        Assert.assertNotEquals(result, expectedResult, "Invalid result of mult operation!");
    }

    @DataProvider(name = "valuesForMultLongTest")
    public Object[][] valuesForMult() {
        return new Object[][]{
                {10, 23, 230},
                {10, -1, -10},
                {0, 0, 0},
                {2, 3, 6}
        };
    }

    @DataProvider(name = "valuesForMultLongTestNegative")
    public Object[][] valuesForMultNegative() {
        return new Object[][]{
                {33, 12, 100}
        };
    }
}
