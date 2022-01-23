package escola;
import org.junit.jupiter.api.Test;

import java.io.Console;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmailTest {
    @Test
    void naoDeveriaCriarInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailInvalido"));

    }

    @Test
    void deveriarCriar(){
        assertThrows(IllegalArgumentException.class,
                () -> new Email("thiago@fsaaddada"));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("thiagofsa12123"));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("thiago@2344343.com"));

    }

}

