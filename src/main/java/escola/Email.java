package escola;

public class Email {
    //value object

    private String endereco;

    public Email(String endereco) {
        if (endereco == null || !endereco.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            throw new IllegalArgumentException("E-mail inválido");
        }
            this.endereco = endereco;
    }



}

