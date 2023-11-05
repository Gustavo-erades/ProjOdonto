package com.mycompany.prontuario.funcoesTela;

import com.mycompany.prontuario.conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class SelectPaciente {
    public Object selecionarDadosPaciente(){
        String sql="SELECT * FROM PACIENTE;";
        Object linha[]=new Object[];
        PreparedStatement preparedStatement;
        try {
            preparedStatement=Conexao.getConexao().prepareStatement(sql);
            preparedStatement.execute();
            
            for(int i=0;i<=preparedStatement.getFetchSize();i++){
                linha[]={preparedStatement};
            }
           
            
            preparedStatement.close();
        } catch (SQLException erro) {
            System.out.println("Erro: "+erro);
        }
        return linha;
    }
}
