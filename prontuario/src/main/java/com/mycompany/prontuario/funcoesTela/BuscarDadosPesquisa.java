
package com.mycompany.prontuario.funcoesTela;

import com.mycompany.prontuario.conexao.Conexao;
import com.mycompany.prontuario.telas.Identificacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BuscarDadosPesquisa {
    public void dadosPesquisa(String id) throws SQLException{
        String sql="SELECT ENDERECO FROM PACIENTE WHERE"
                + "ID=1; ";
        PreparedStatement ps;
        ps=Conexao.getConexao().prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
            ResultadoPesquisa resultadoPesquisa=new ResultadoPesquisa();
            resultadoPesquisa.setEndereco(rs.toString());
    }
}
