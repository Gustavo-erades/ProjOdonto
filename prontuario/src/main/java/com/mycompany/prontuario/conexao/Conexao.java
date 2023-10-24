package com.mycompany.prontuario.conexao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
        private static final String url="jdbc:mysql://localhost:3306/prontuariobd";
        private static final String user="root";
        private static final String password="admin1234";
        private static Connection conexao;
        public static Connection getConexao(){
        try {
            if(conexao==null){
                conexao=DriverManager.getConnection(url,user,password);
                return conexao;
            }else{
                return conexao;
            }
        } catch (SQLException erro) {
            System.out.println("Driver de banco de dados não localizado"+erro);
            return null;
        }
    }
}
