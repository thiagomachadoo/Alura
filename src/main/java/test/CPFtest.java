package test;

import escola.CPF;
import escola.Email;
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

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("CPF inválido"));
    }

    @Test
    public void deveriarCriarCPF() {
        new CPF("333.453.567-11");
    }
}
