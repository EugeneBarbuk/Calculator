package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorIsNegativeNumberTest extends BaseCalculatorTest {
    @Test(dataProvider = "valuesForNegTest")
    public void testNeg(long a) {
        Assert.assertTrue(calculator.isNegative(a), "Invalid result of isNegative operation!");
    }

    @Test(dataProvider = "valuesForNegTestNegative")
    public void testPosNegative(long a) {
        Assert.assertFalse(calculator.isNegative(a), "Invalid result of isNegative operation!");
    }

    @DataProvider(name = "valuesForNegTest")
    public Object[][] valuesForNeg() {
        return new Object[][]{
                {-2},
                {-505},
        };
    }

    @DataProvider(name = "valuesForNegTestNegative")
    public Object[][] valuesForNegNegative() {
        return new Object[][]{
                {3},
                {0}
        };
    }
}
