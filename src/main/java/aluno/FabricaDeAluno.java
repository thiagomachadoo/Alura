package aluno;

public class FabricaDeAluno {

    //método responsável por criar o objeto aluno

    private Aluno aluno;

    //impor ordens na chamada de metodo

    public FabricaDeAluno comNomeCPFeEmail(String nome, String cpf, String email){
        this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
        return this;
    }

    public FabricaDeAluno comTelefone(String ddd, String numero){
        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno criar() {
        return this.aluno;
    }

    public static void main(String[] args) {
        FabricaDeAluno fabrica = new FabricaDeAluno();
           Aluno aluno2 = fabrica.comNomeCPFeEmail("","","")
                    .comTelefone("","")
                    .criar();

    }

}
