package lab6;

import lab5.advanced.DoubleCalculator;
import org.junit.jupiter.api.*;

public class DoublaCalculatorTest {

    private DoubleCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new DoubleCalculator(10.0);
    }

    @Test
    public void testAddPositive() {

        calculator.add(5.5);
        Assertions.assertEquals(15.5, (Double) calculator.result(), 0.001, "Adunarea numerelor pozitive a esuat!");
    }

    @Test
    public void testAddNegatives() {

        calculator.add(-3.2);
        Assertions.assertEquals(6.8, (Double) calculator.result(), 0.001);
    }

    @Test
    public void testSubtractPositives() {

        calculator.subtract(4.1);
        Assertions.assertEquals(5.9, (Double) calculator.result(), 0.001);
    }

    @Test
    public void testMultiplyPositives() {

        calculator.multiply(2.5);

        Assertions.assertEquals(25.0, (Double) calculator.result(), 0.001);
    }

    @Test
    public void testMultiplyBy0() {

        calculator.multiply(0.0);
        Assertions.assertEquals(0.0, (Double) calculator.result(), 0.001);
    }
}