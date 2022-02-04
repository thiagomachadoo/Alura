package escola;
//fazer teste de unidade da classe telefone
public class CPF {

        private String numero;

        public CPF(String numero) {
                if (numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")){
                        throw new IllegalArgumentException("CPF Inválido!");
                }else{
                        System.out.println("CPF válido!!");
                }
                this.numero = numero;
        }
}
