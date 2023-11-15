
package com.mycompany.prontuario.DAO;

import com.mycompany.prontuario.conexao.Conexao;
import com.mycompany.prontuario.funcoesTela.ResultadoPesquisa;
import com.mycompany.prontuario.telas.Identificacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ResultadoPesquisaDao {
    public void fazerNovaPesquisa(ResultadoPesquisa resultadoPesquisa) throws SQLException{
        String sql="SELECT ENDERECO FROM PACIENTE WHERE ID=1";
        PreparedStatement preparedStatement;
        Identificacao identificacao=new Identificacao();
        try {
            preparedStatement= Conexao.getConexao().prepareStatement(sql);
            /*preparedStatement.setString(1,resultadoPesquisa.getId());*/
            preparedStatement.execute();
            ResultSet rs=preparedStatement.executeQuery();
            
            resultadoPesquisa.setEndereco(rs.getString("endereco"));
            preparedStatement.close();
            JOptionPane.showMessageDialog(identificacao, "Resultado da pesquisa funcionando!", "deu bom",JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException erro) {
            /*System.out.println("Problemas no DAO: "+erro.getMessage());*/
            JOptionPane.showMessageDialog(identificacao, "problema no DAO->"+erro.getMessage(), "deu ruim",JOptionPane.ERROR_MESSAGE);
        }
    }
}
