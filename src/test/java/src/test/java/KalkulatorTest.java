package src.test.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;
import org.w3c.dom.css.Counter;

public class KalkulatorTest {
    @Test
    public void testReset() {
        Kalkulator testKalkulator = new Kalkulator();
        
        for(int i = 0; i < 10; i++) {
            testKalkulator.tambah();
        }
        
        testKalkulator.reset();
        
        assertEquals(0, testKalkulator.getHasil());
    }

    @Test
    public void testtambah() {
        Kalkulator testKalkulator = new Kalkulator();
        
        for(int i = 1; i < 10; i++) {
            testKalkulator.tambah();
            assertEquals(i, testKalkulator.getHasil());
        }
    }

    @Test
    public void testkurang() {
        Kalkulator testKalkulator = new Kalkulator();
        
        for(int i = 1; i < 10; i++) {
            testKalkulator.kurang();
            assertEquals(i * -1, testKalkulator.getHasil());
        }
    }

    @Test
    public void testnaikkanSebanyak() {
        Kalkulator testKalkulator = new Kalkulator();
        testKalkulator.tambahSebanyak(5);
        assertEquals(5, testKalkulator.getHasil());
        
        testKalkulator.tambahSebanyak(10);
        assertEquals(15, testKalkulator.getHasil());
    }

    @Test
    public void testkurangSebanyak() {
        Kalkulator testKalkulator = new Kalkulator();
        testKalkulator.kurangSebanyak(5);
        assertEquals(-5, testKalkulator.getHasil());
        
        testKalkulator.kurangSebanyak(10);
        assertEquals(-15, testKalkulator.getHasil());
    }

    @Test
    public void testkalikanDengan() {
        Kalkulator testKalkulator = new Kalkulator();
        testKalkulator.tambahSebanyak(5);
        testKalkulator.kalikanDengan(3);
        assertEquals(15, testKalkulator.getHasil());
        
        testKalkulator.kalikanDengan(1);
        assertEquals(15, testKalkulator.getHasil());
    }

    @Test
    public void testkalidua() {
        Kalkulator testKalkulator = new Kalkulator();
        testKalkulator.tambahSebanyak(2);
        testKalkulator.kalidua();
        assertEquals(4, testKalkulator.getHasil());
        
        testKalkulator.kalidua();
        assertEquals(8, testKalkulator.getHasil());
    }

    @Test
    public void testPowerBy() {
        Kalkulator testKalkulator = new Kalkulator();
        testKalkulator.tambahSebanyak(2);
        testKalkulator.pangkatkanDengan(3); // 2 ^ 3 = 1 (binary XOR)
        assertEquals(1, testKalkulator.getHasil());
        
        testKalkulator.pangkatkanDengan(1); // 1 ^ 1 = 0 (binary XOR)
        assertEquals(0, testKalkulator.getHasil());
    }

    @Test
    public void testIsGenap() {
        Kalkulator testKalkulator = new Kalkulator();
        assertTrue(testKalkulator.isGenap());
        
        testKalkulator.tambah();
        assertFalse(testKalkulator.isGenap());
        
        testKalkulator.tambah();
        assertTrue(testKalkulator.isGenap());
    }
}
