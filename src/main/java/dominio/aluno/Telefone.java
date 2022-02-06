package dominio.aluno;

//fazer teste de unidade da classe telefone
public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        //validacao do ddd e numero
        if ((ddd == null || !ddd.matches("\\d{2}"))) {
                throw new IllegalArgumentException("Digite um DDD válido!!");
        }else{
            System.out.println("DDD válido!");
        }
        if (numero == null || !numero.matches("\\d{5}\\-\\d{4}")){
            throw new IllegalArgumentException("Digite um número válido!!");
        }else{
            System.out.println("número válido!");
        }
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
