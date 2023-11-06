
package com.mycompany.prontuario;
import com.mycompany.prontuario.telas.Identificacao;
import java.sql.SQLException;

public class Prontuario {
    public static void main(String[] args) throws SQLException{
        Identificacao telaPrincipal= new Identificacao();
        telaPrincipal.setVisible(true);
    }
}
