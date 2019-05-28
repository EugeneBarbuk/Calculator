package by.epam.barbuk.lab.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorIsPositiveNumberTest extends BaseCalculatorTest {
    @Test(dataProvider = "valuesForPosTest")
    public void testPos(long a) {
        Assert.assertTrue(calculator.isPositive(a), "Invalid result of isPositive operation!");
    }

    @Test(dataProvider = "valuesForPosTestNegative")
    public void testPosNegative(long a) {
        Assert.assertFalse(calculator.isPositive(a), "Invalid result of isPositive operation!");
    }

    @DataProvider(name = "valuesForPosTest")
    public Object[][] valuesForPos() {
        return new Object[][]{
                {2},
                {505},
        };
    }

    @DataProvider(name = "valuesForPosTestNegative")
    public Object[][] valuesForPosNegative() {
        return new Object[][]{
                {-3},
                {0}
        };
    }
}
