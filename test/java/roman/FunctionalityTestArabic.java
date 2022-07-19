package roman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FunctionalityTestArabic{
    private RomanConverterImpl converter;

    @BeforeEach
    public void setUp() {
        converter = new RomanConverterImpl();
    }

    @Test
    public void isGreater() {
        assertThrows(IllegalArgumentException.class, () -> converter.toRoman(4000));
    }

    @Test
    public void isSmall() {
        assertThrows(IllegalArgumentException.class, () -> converter.toRoman(0));
    }
}

