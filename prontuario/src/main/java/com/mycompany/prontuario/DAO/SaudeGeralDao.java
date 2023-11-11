
package com.mycompany.prontuario.DAO;

import com.mycompany.prontuario.conexao.Conexao;
import com.mycompany.prontuario.entidades.SaudeGeral;
import com.mycompany.prontuario.telas.Identificacao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SaudeGeralDao {
    public void cadastrarSaudeGeral(SaudeGeral SaudeGeral) throws SQLException{
        String sql="INSERT INTO PACIENTE_SAUDE_GERAL"
                + "(QUESTOES,DOENCA_CONTAGIOSA,ALERGIA,BEBIDA,DROGAS,MEDICAMENTO,FUMO)"
                + "VALUES(?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement;
        Identificacao identificacao=new Identificacao();
        try{
            preparedStatement=Conexao.getConexao().prepareStatement(sql);
            preparedStatement.setString(1,SaudeGeral.getQuestoes());
            preparedStatement.setString(2,SaudeGeral.getDoenca_contagiosa());
            preparedStatement.setString(3,SaudeGeral.getAlergia());
            preparedStatement.setString(4,SaudeGeral.getBebida());
            preparedStatement.setString(5,SaudeGeral.getDrogas());
            preparedStatement.setString(6,SaudeGeral.getMedicamento());
            preparedStatement.setString(7,SaudeGeral.getFumo());
            preparedStatement.execute();
            preparedStatement.close();
            JOptionPane.showMessageDialog(identificacao, "Dados de saúde geral do paciente cadastrados com sucesso!", "Sucesso no cadastro dos dados de saúde geral", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(identificacao, "Problemas com o banco de dados. Volte no arquivo 'SaudeGeralDao.java'"+erro, "Problemas na saude geral", JOptionPane.ERROR_MESSAGE);
        }
    }
}
