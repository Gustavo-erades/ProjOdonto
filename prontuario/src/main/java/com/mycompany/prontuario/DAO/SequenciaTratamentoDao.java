
package com.mycompany.prontuario.DAO;

import com.mycompany.prontuario.conexao.Conexao;
import com.mycompany.prontuario.entidades.SequenciaTratamento;
import com.mycompany.prontuario.telas.Identificacao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SequenciaTratamentoDao {
    public void cadastrarTratamento(SequenciaTratamento procedimento) throws SQLException{
        String sql="INSERT INTO SEQUENCIA_TRATAMENTO"
                + "(DATA_TRATAMENTO,DENTE,PROCEDIMENTO)"
                + "VALUES(?,?,?)";
        PreparedStatement ps;
        Identificacao identificacao=new Identificacao();
        try{
            ps=Conexao.getConexao().prepareStatement(sql);
            ps.setString(1,procedimento.getData());
            ps.setString(2,procedimento.getDente());
            ps.setString(3, procedimento.getProcedimento());
            ps.execute();
            ps.close();
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(identificacao, "Problemas com o banco de dados. Volte no arquivo 'SequenciaTratamentoDao.java'"+erro, "Problemas na sequência de tratamento", JOptionPane.ERROR_MESSAGE);
        }
    }
}
