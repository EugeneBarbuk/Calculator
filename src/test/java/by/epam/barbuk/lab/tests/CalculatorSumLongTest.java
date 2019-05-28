package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorSumLongTest extends BaseCalculatorTest {
    @Test(dataProvider = "valuesForSumLongTest")
    public void testSumLong(long a, long b, long expectedResult) {
        long id = Thread.currentThread().getId();
        System.out.println(id);
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of sum operation!");
    }

    @Test(dataProvider = "valuesForSumLongTestNegative")
    public void testSumLongNegative(long a, long b, long expectedResult) {
        double result = calculator.sum(a, b);
        Assert.assertNotEquals(result, expectedResult, "Invalid result of sum operation!");
    }

    @DataProvider(name = "valuesForSumLongTest")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {10, 23, 33},
                {10, -1, 9},
                {0, 0, 0},
                {-1, 10, 9}
        };
    }

    @DataProvider(name = "valuesForSumLongTestNegative")
    public Object[][] valuesForSumNegative() {
        return new Object[][]{
                {33, 12, 10}
        };
    }
}
