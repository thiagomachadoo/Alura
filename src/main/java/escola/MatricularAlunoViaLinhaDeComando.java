package escola;

import aplicacao.indicacao.matricular.MatricularAluno;
import aplicacao.indicacao.matricular.MatricularAlunoDTO;
import dominio.aluno.CPF;
import dominio.aluno.Email;
import infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {
    public static void main(String[] args) {
        String nome = "Jocrenildo Elvis Macuelo";
        String cpf = ("123.456.789-00");
        String email = ("Jocrenildo123@gmail.com");

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricular.executa(new MatricularAlunoDTO(nome, cpf, email));
    }
}
