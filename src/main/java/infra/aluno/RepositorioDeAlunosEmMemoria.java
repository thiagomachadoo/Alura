package infra.aluno;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria extends RepositorioDeAlunosUsandoJDBC {
   private List<Alunos> matriculados = new ArrayList<Alunos>();

    public RepositorioDeAlunosEmMemoria(Connection connection) {
        super(connection);

    }
}
