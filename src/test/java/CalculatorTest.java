import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        int result = calc.add(8, 9);
        assertEquals(17, result);
    }

    @Test
    void dif() {
        Calculator calc = new Calculator();
        int result = calc.dif(8, 9);
        assertEquals(-1, result);
    }

    @Test
    void div() {
        Calculator calc = new Calculator();
        int result = calc.div(18, 9);
        assertEquals(2, result);
    }

    @Test
    void times() {
        Calculator calc = new Calculator();
        int result = calc.div(18, 9);
        assertEquals(2, result);
    }

    @Test
    void solver() {
        Calculator calc = new Calculator();
        int result = calc.solver(2, 8, 6);
        assertEquals(-60, result);
    }
}