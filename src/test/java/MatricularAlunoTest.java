import aplicacao.indicacao.matricular.MatricularAluno;
import aplicacao.indicacao.matricular.MatricularAlunoDTO;
import dominio.aluno.Aluno;
import dominio.aluno.CPF;
import infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatricularAlunoTest {
    @Test
    void alunoDeveriaSerPersistido(){
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDTO dados = new MatricularAlunoDTO("fulano", "123.456.789-00", "fulano@gmail.com");
        useCase.executa(dados);

        try {
            Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));

            assertEquals("fulano", encontrado.getNome());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
