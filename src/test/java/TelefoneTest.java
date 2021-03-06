import dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefoneTest {
    @Test
    public void naoDevePassar(){
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, null));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("",""));
    }

    @Test
    public void devePassar(){
        new Telefone("10","10099-9999");
    }
}
