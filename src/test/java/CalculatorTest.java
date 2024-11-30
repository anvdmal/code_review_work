import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(10, calculator.add(8, 2));
    }

    @Test
    void dif() {
        assertEquals(6, calculator.dif(8, 2));
    }

    @Test
    void div() {
        assertEquals(4, calculator.div(8, 2));
        assertThrows(IllegalArgumentException.class, () -> calculator.div(8, 0));
    }

    @Test
    void times() {
        assertEquals(16, calculator.times(8, 2));
    }

    @Test
    void solver() {
        assertEquals(132, calculator.solver(8, 2, 3));
    }
}