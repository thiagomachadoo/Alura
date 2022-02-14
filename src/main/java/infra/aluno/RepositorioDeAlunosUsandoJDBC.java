package infra.aluno;

import dominio.aluno.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RepositorioDeAlunosUsandoJDBC implements RepositorioDeAlunos {

    private final Connection connection;

    public RepositorioDeAlunosUsandoJDBC(Connection connection){
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {
        String sql = "INSERT INTO ALUNO VALUES(?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, aluno.getCpf());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getEmail());
            ps.execute();

            sql = "INSERT INTO TELEFONE VALUES(?, ?)";
            ps = connection.prepareStatement(sql);
            for (Telefone telefone: aluno.getTelefones()){
                ps.setString(1, telefone.getDdd());
                ps.setString(1, telefone.getNumero());
                ps.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
//result set
    @Override
    public Aluno buscarPorCPF(CPF cpf) throws SQLException {
        try{
            String sql = "SELECT id, nome, email FROM ALUNO WHERE cpf = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cpf.getNumero());

            ResultSet rs = ps.executeQuery();
            boolean encontrou = rs.next();
            if (!encontrou) {
                throw new IllegalArgumentException("Nao nao amigo");
            }
            String nome = rs.getNString("nome");
            Email email = new Email(rs.getString("email"));
            Aluno encontrado = new Aluno(cpf, nome, email);

            Long id = rs.getLong("id");
            sql = "SELECT ddd, numero FROM TELEFONE WHERE aluno_id = ?";
            ps = connection.prepareStatement(sql);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                String numero = rs.getString("numero");
                String ddd = rs.getString("ddd");
                encontrado.adicionarTelefone(ddd, numero);
            }
            return encontrado;
        }catch (SQLException e){
            throw new SQLException(e);
        }
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return null;
    }
}
