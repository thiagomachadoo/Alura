import dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFtest {
    @Test
    public void CPF() {
        //DEVE RETORNAR INVALIDO
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));


    }

    @Test
    public void deveriarCriarCPF() {
        new CPF("333.453.567-11");
    }
}
