package roman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FunctionalityTestRomans{
    private RomanConverterImpl converter;

    @BeforeEach
    public void setUp() {
        converter = new RomanConverterImpl();
    }

    @Test
    public void convertsSingleChar() {
        assertEquals(1,converter.fromRoman("I"));
        assertEquals(5,converter.fromRoman("V"));
        assertEquals(500,converter.fromRoman("D"));
        assertEquals(1000,converter.fromRoman("M"));
    }

    @Test
    public void convertsString() {
        assertEquals(9,converter.fromRoman("IX"));
        assertEquals(3,converter.fromRoman("III"));
        assertEquals(1090,converter.fromRoman("MXC"));
        assertEquals(941,converter.fromRoman("CMXLI"));
        assertEquals(45,converter.fromRoman("XLV"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"MMMM", "DD", "CCCC", "LL", "XXXX", "VV", "IIII"})
    public void recurringChars(String numeral) {
        assertThrows(IllegalArgumentException.class, () -> converter.fromRoman(numeral));
    }

    @ParameterizedTest
    @ValueSource(strings = {"IIMXCC", "VX", "DCM", "CMM", "IXIV", "MCMC", "XCX", "IVI", "LM", "LD", "LC"})
    public void incorrectRomanNotation(String numeral) {
        assertThrows(IllegalArgumentException.class, () -> converter.fromRoman(numeral));
    }
}

