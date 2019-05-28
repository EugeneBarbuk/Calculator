package by.epam.barbuk.lab.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

public class BaseCalculatorTest {

    protected Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public void setDown() {
        calculator = null;
    }
}
