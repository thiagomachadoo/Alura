package infra.aluno;

import dominio.aluno.Aluno;

import dominio.aluno.AlunoNaoEncontrado;
import dominio.aluno.CPF;
import dominio.aluno.RepositorioDeAlunos;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {
   private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);

    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) throws SQLException {
        return this.matriculados.stream()
                .filter(a -> a.getCpf().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.matriculados;
    }
}
