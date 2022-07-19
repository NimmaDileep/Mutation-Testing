package roman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InterfaceTestStrings{
    private RomanConverterImpl converter;

    @BeforeEach
    public void setUp() {
        converter = new RomanConverterImpl();
    }

    @Test
    public void isNull() {
        assertThrows(IllegalArgumentException.class, () -> converter.fromRoman("null"));
    }


    @Test
    public void isEmpty() {
        assertThrows(IllegalArgumentException.class, () -> converter.fromRoman(" "));
    }
}

