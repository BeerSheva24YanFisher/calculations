package demo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import static demo.Calculations.divide;
import static demo.Calculations.divide1;
import static demo.Calculations.isDivideOn;
import static demo.Calculations.maxDigit;
import static demo.Calculations.multiply;
import static demo.Calculations.sub;
import static demo.Calculations.sum;

public class CalculationsTest {

    @Test
    void sumTest(){
        assertEquals(4, sum(1, 3));
        assertNotEquals(-4, sum(-2, 2));
    }

    @Test
    void subTest(){
        assertEquals(4, sub(7, 3));
        assertNotEquals(4, sub(-2, 2));
    }

    @Test
    void divide1Test(){
        assertEquals(4, divide1(12, 3));
        assertNotEquals(4, divide1(-2, 2));
        assertEquals(0, divide1(10, 0));
    }

    @Test
    void divideTest(){
        assertEquals(4, divide(12, 3));
        assertNotEquals(4, divide(-2, 2));
        //assertEquals(0, divide(10, 0));
        assertThrowsExactly(ArithmeticException.class, () -> divide(10, 0));
    }


    @Test
    void multiplyTest(){
        assertEquals(36, multiply(12, 3));
        assertNotEquals(4, multiply(-2, 2));
    }

    @Test
    void sumOfDigitsTest() {
        assertEquals(10, Calculations.sumOfDigits(1234));
        assertEquals(0, Calculations.sumOfDigits(0));
        assertEquals(9, Calculations.sumOfDigits(9));
        assertEquals(10, Calculations.sumOfDigits(-1234));
    }

    @Test
    void maxDigitTest() {
        assertEquals(5, maxDigit(12345));
        assertEquals(9, maxDigit(9876));
        assertEquals(0, maxDigit(0));
        assertEquals(8, maxDigit(-2468));
        assertEquals(5, maxDigit(555555));
    }

    @Test
    void isDivideOnTest() {
        assertTrue(isDivideOn(10, 2));
        assertFalse(isDivideOn(10, 3));
        assertTrue(isDivideOn(15, 5));
        assertFalse(isDivideOn(17, 4));
        assertTrue(isDivideOn(0, 1));
        assertFalse(isDivideOn(4, 0));
    }

}
