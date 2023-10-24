
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
        
    }
}
