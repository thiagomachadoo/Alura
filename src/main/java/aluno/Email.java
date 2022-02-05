package aluno;

public class Email {
    //value object

    public String endereco;

    public Email(String endereco) {
        if (endereco == null || !endereco.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            throw new IllegalArgumentException("E-mail inválido");
        }else{
            System.out.println("Email válido!!");
        }
            this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

