package dominio.aluno;

import java.sql.SQLException;
import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(Aluno aluno);

    Aluno buscarPorCPF(CPF cpf) throws SQLException;

    List<Aluno> listarTodosAlunosMatriculados();
}
