
package com.mycompany.prontuario.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mycompany.prontuario.entidades.Paciente;
import com.mycompany.prontuario.conexao.Conexao;

public class PacienteDao {
    public void cadastrarPaciente(Paciente paciente){
        String sql="INSERT INTO PACIENTE(NOME,CPF,RG,IDADE,TELEFONE,EMAIL,ENDERECO) VALUES(?,?,?,?,?,?,?);";
        PreparedStatement preparedStatement;
        try {
            preparedStatement= Conexao.getConexao().prepareStatement(sql);
            preparedStatement.setString(1,paciente.getNome());
            preparedStatement.setString(2, paciente.getCpf());
            preparedStatement.setString(3,paciente.getRg());
            preparedStatement.setInt(4,paciente.getIdade());
            preparedStatement.setString(5,paciente.getTelefone());
            preparedStatement.setString(6,paciente.getEmail());
            preparedStatement.setString(7,paciente.getEndereco());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException erro) {
            System.out.println("Problemas no DAO: "+erro.getMessage());
        }
    }
}
