package infra.aluno.indicacao;

import dominio.EnviarEmailIndicacao;
import dominio.aluno.Aluno;

public class EnviarEmailIndicacaoCOmJavaMail implements EnviarEmailIndicacao {
    @Override
    public void enviarPara(Aluno indicado) {
    //logica de envio de email com a plataforma ou servico desejado
    }
}
