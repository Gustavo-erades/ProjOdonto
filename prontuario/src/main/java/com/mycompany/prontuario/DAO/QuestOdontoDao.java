
package com.mycompany.prontuario.DAO;
import com.mycompany.prontuario.conexao.Conexao;
import com.mycompany.prontuario.entidades.QuestOdonto;
import com.mycompany.prontuario.telas.Identificacao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class QuestOdontoDao {
    public void cadastrarQuestOdonto(QuestOdonto questOdonto) throws SQLException{
        String sql="INSERT INTO PRONTUARIOBD.PACIENTE_QUEST_ODONTO(QUESTOES,IMPLANTE,TEMPO)"
                + "VALUES(?,?,?);";
        PreparedStatement preparedStatement;
        Identificacao tela=new Identificacao();
        try{
            preparedStatement=Conexao.getConexao().prepareStatement(sql);
            preparedStatement.setString(1,questOdonto.getQuestoes());
            preparedStatement.setString(2,questOdonto.getImplante());
            preparedStatement.setString(3,questOdonto.getTempo());
            preparedStatement.execute();
            preparedStatement.close();
            JOptionPane.showMessageDialog(tela, "Dados referentes à saúde odontológica do paciente cadastrados com sucesso!", "Sucesso no cadastro dos dados odontológicos", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(tela, "Problemas com o banco de dados. Volte no arquivo 'QuestOdontoDao.java'"+erro, "Problemas na questionário odontológico", JOptionPane.ERROR_MESSAGE);
        }
    }
}
