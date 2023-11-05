
package com.mycompany.prontuario;

import com.mycompany.prontuario.conexao.Conexao;
import com.mycompany.prontuario.telas.Identificacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/*import com.mycompany.prontuario.DAO.PacienteDao;
import com.mycompany.prontuario.entidades.Paciente;*/

public class Prontuario {
    public static void main(String[] args) throws SQLException{
        Identificacao telaPrincipal= new Identificacao();
        telaPrincipal.setVisible(true);
        
        
        
        String sql1="SELECT * FROM PACIENTE";
        PreparedStatement preparedStatement1;
        preparedStatement1= Conexao.getConexao().prepareStatement(sql1);
        ResultSet[] rs=new ResultSet[5];
        rs[0]=preparedStatement1.executeQuery();
        while(rs[0].next()){
           System.out.println(rs[0].getString("ID"));
           System.out.println(rs[0].getString("NOME"));
           System.out.println(rs[0].getString("IDADE"));
           System.out.println(rs[0].getString("TELEFONE"));
           System.out.println(rs[0].getString("EMAIL"));
        }
    
    }
}
