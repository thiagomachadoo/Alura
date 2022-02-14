package dominio.aluno;

public class AlunoNaoEncontrado extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public AlunoNaoEncontrado(CPF cpf) {
        super("ALuno não encontrado com CPF: " + cpf.getNumero());
    }
}
