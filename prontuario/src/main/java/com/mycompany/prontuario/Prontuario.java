
package com.mycompany.prontuario;

import com.mycompany.prontuario.DAO.PacienteDao;
import com.mycompany.prontuario.entidades.Paciente;

public class Prontuario {

    public static void main(String[] args){
        Paciente paciente= new Paciente();
        paciente.setNome("Hal Jordan");
        paciente.setEmail("piorlanterna@verde.com");
        paciente.setCpf("0123213413");
        paciente.setEndereco("OA,Planeta");
        paciente.setIdade(32);
        paciente.setRg("12323");
        paciente.setTelefone("(93)77889-7679");
        new PacienteDao().cadastrarPaciente(paciente);
        /*Connection conexao=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao=DriverManager.getConnection("jdbc:mysql://localhost:3306/prontuariobd","root","admin1234");
            ResultSet rePaciente= conexao.createStatement().executeQuery("select * from paciente;");
            while(rePaciente.next()){
                System.out.println(rePaciente.getString("nome"));
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver de banco de dados não localizado");
        } catch(SQLException ex){
            System.out.println("Ocorreu um erro ao acessar o banco "+ex.getMessage());
        } finally{
            if(conexao!=null){
                conexao.close();
            }
        }*/
    }
}
