package escola;

//fazer teste de unidade da classe telefone
public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        //validacao do ddd e numero
        if ((ddd == null || !ddd.matches("\\d{2}") && (numero == null || !numero.matches("\\d{5}\\-\\d{4}")))) {
            throw new IllegalArgumentException("Digite um número válido!!");
        }
        this.ddd = ddd;
        this.numero = numero;
    }
}
