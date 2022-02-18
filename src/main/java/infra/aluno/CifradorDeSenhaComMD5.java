package infra.aluno;

import dominio.CifradorDeSenha;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CifradorDeSenhaComMD5 implements CifradorDeSenha {


    @Override
    public String cifrarSenha(String senha) {
       try{
           MessageDigest md = MessageDigest.getInstance("MD5");
           md.update(senha.getBytes());
           byte[] bytes = md.digest();
           StringBuilder sb = new StringBuilder();
           for(int i = 0; i < bytes.length; i++){
               sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
           }
           return sb.toString();
       }catch (NoSuchAlgorithmException e){
           throw new RuntimeException("erro aoo gerar hash", e);
       }
    }

    @Override
    public boolean validarSenhaCifrada(String senhaCifrada, String senha) {
        return senhaCifrada.equals(cifrarSenha(senhaCifrada));
    }
}
