package aplicacao.indicacao.matricular;

import dominio.aluno.Aluno;
import dominio.aluno.RepositorioDeAlunos;
import org.jetbrains.annotations.NotNull;

public class MatricularAluno {
    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }
    //COMMAND - padrão
    public void executa(@NotNull MatricularAlunoDTO dados){
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);
    }
}
