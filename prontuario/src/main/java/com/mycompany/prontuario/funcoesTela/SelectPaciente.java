package com.mycompany.prontuario.funcoesTela;

import com.mycompany.prontuario.conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class SelectPaciente {
    public void selecionarDadosPaciente() throws SQLException{
        String sql1="SELECT * FROM PACIENTE";
        PreparedStatement preparedStatement1;
        preparedStatement1= Conexao.getConexao().prepareStatement(sql1);
        ResultSet[] rs=new ResultSet[5];
        String[] pacientesLista=new String[5];
        rs[0]=preparedStatement1.executeQuery();
        Object[] colunas=new Object[]{"id","nome","idade","telefone","email"};
        DefaultTableModel modelo=new DefaultTableModel(colunas,0);
        while(rs[0].next()){
            for(int i=0;i<5;i++){
                Object[] pacientes=new Object[]{
                    rs[0].getString("ID"),
                    rs[0].getString("NOME"),
                    rs[0].getString("IDADE"),
                    rs[0].getString("TELEFONE"),
                    rs[0].getString("EMAIL")
                };
                modelo.addRow(pacientes);
            }
        }
         /*tabelaSelect1.setModel(modelo);*/
    }
}
