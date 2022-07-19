package roman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InterfaceTestIntegers {
    private RomanConverterImpl converter;

    @BeforeEach
    public void setUp() {
        converter = new RomanConverterImpl();
    }

    @Test
    public void isZero() {
        assertThrows(IllegalArgumentException.class, () -> converter.toRoman(0));
    }

    @Test
    public void isPositive() {
        assertEquals("D" ,converter.toRoman(500));
    }

    @Test
    public void isNegative() {
        assertThrows(IllegalArgumentException.class, () -> converter.toRoman(-5));
    }
}

