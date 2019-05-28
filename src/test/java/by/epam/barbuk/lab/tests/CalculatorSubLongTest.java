package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorSubLongTest extends BaseCalculatorTest {
    @Test(dataProvider = "valuesForSubLongTest")
    public void testSubLong(long a, long b, long expectedResult) {
        long id = Thread.currentThread().getId();
        System.out.println(id);
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of sub operation!");
    }

    @Test(dataProvider = "valuesForSubLongTestNegative")
    public void testSubLongNegative(long a, long b, long expectedResult) {
        long result = calculator.sub(a, b);
        Assert.assertNotEquals(result, expectedResult, "Invalid result of sub operation!");
    }

    @DataProvider(name = "valuesForSubLongTest")
    public Object[][] valuesForSub() {
        return new Object[][]{
                {23, 10, 13},
                {10, -1, 11},
                {0, 0, 0},
                {10, 10, 0}
        };
    }

    @DataProvider(name = "valuesForSubLongTestNegative")
    public Object[][] valuesForSubNegative() {
        return new Object[][]{
                {33, 12, 10}
        };
    }
}
