package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumberTestCase() {
        StringUtils myClass = new StringUtils();
        assertTrue(myClass.isPositiveNumber("10"));
        assertFalse(myClass.isPositiveNumber("-10"));
    }
}