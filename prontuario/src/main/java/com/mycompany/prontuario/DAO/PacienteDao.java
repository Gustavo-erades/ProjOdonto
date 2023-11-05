
package com.mycompany.prontuario.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mycompany.prontuario.entidades.Paciente;
import com.mycompany.prontuario.conexao.Conexao;
import com.mycompany.prontuario.telas.Identificacao;
import javax.swing.JOptionPane;

public class PacienteDao {
    public void cadastrarPaciente(Paciente paciente){
        String sql="INSERT INTO PACIENTE"
                + "(NOME,CPF,RG,IDADE,TELEFONE,EMAIL,ENDERECO,SEXO,DATA_NASCIMENTO,ESTADO_CIVIL,COR,PROFISSAO,CEP,TELEFONE_CASA,CIDADE,TELEFONE_TRAB,RESPONSAVEL,TELEFONE_RESPONSAVEL)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement preparedStatement;
        Identificacao identificacao=new Identificacao();
        try {
            preparedStatement= Conexao.getConexao().prepareStatement(sql);
            preparedStatement.setString(1,paciente.getNome());
            preparedStatement.setString(2, paciente.getCpf());
            preparedStatement.setString(3,paciente.getRg());
            preparedStatement.setInt(4,paciente.getIdade());
            preparedStatement.setString(5,paciente.getTelefoneCelular());
            preparedStatement.setString(6,paciente.getEmail());
            preparedStatement.setString(7,paciente.getEndereco());
            preparedStatement.setString(8,paciente.getSexo());
            preparedStatement.setString(9,paciente.getDataNasc());
            preparedStatement.setString(10,paciente.getEstadoCivil());
            preparedStatement.setString(11,paciente.getCor());
            preparedStatement.setString(12,paciente.getProfissao());
            preparedStatement.setString(13,paciente.getCep());
            preparedStatement.setString(14,paciente.getTelefoneResidencial());
            preparedStatement.setString(15,paciente.getCidade());
            preparedStatement.setString(16,paciente.getTelefoneTrabalho());
            preparedStatement.setString(17,paciente.getNomeResponsavel());
            preparedStatement.setString(18,paciente.getContatoResponsavel());
            preparedStatement.execute();
            preparedStatement.close();
            JOptionPane.showMessageDialog(identificacao, "Cadastro de paciente realizado!", "Paciente cadastrado",JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException erro) {
            /*System.out.println("Problemas no DAO: "+erro.getMessage());*/
            JOptionPane.showMessageDialog(identificacao, "Problemas no DAO (acesso aos dados do banco de dados"+erro.getMessage(), "Erro no banco de dados",JOptionPane.ERROR_MESSAGE);
        }
    }
}
