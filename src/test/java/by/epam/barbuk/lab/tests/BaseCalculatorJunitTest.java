package by.epam.barbuk.lab.tests;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseCalculatorJunitTest {

    protected static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new Calculator();
    }

    @AfterAll
    public static void setDown() {
        calculator = null;
    }
}
