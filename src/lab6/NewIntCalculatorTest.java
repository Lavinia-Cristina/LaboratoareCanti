package lab6;

import lab5.advanced.NewIntCalculator;
import org.junit.jupiter.api.*;

public class NewIntCalculatorTest {

    private NewIntCalculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new NewIntCalculator(10);
    }

    @Test
    public void testAddPositive() {

        calculator.add(5);
        Assertions.assertEquals(15, calculator.result(), "Adunarea nu functioneaza corect!");
    }

    @Test
    public void testAddNegatives() {

        calculator.add(-3);
        Assertions.assertEquals(7, calculator.result());
    }

    @Test
    public void testSubtractPositives() {

        calculator.subtract(4);
        Assertions.assertEquals(6, calculator.result());
    }

    @Test
    public void testMultiplyBy0() {

        calculator.multiply(0);
        Assertions.assertEquals(0, calculator.result());
    }
}