package com.mycompany.prontuario.funcoesTela;

import com.mycompany.prontuario.entidades.Paciente;
import com.mycompany.prontuario.DAO.PacienteDao;
import java.sql.SQLException;

public class CadPaciente {
    public void botaoCadPaciente(String nome, String email,String cpf,String endereco,
            int idade,String rg,String telCelular,String cidade, String telResidencial,
            String telTrabalho, String sexo, String dataNasc, String cor, String estadoCivil, 
            String cep,String profissao,String responsavelLegal, String contatoResponsavel) throws SQLException{
        Paciente paciente= new Paciente();
        paciente.setNome(nome);
        paciente.setEmail(email);
        paciente.setCpf(cpf);
        paciente.setEndereco(endereco);
        paciente.setIdade(idade);
        paciente.setRg(rg);
        paciente.setTelefoneCelular(telCelular);
        paciente.setCidade(cidade);
        paciente.setTelefoneResidencial(telResidencial);
        paciente.setTelefoneTrabalho(telTrabalho);
        paciente.setSexo(sexo);
        paciente.setDataNasc(dataNasc);
        paciente.setCor(cor);
        paciente.setEstadoCivil(estadoCivil);
        paciente.setCep(cep);
        paciente.setProfissao(profissao);
        paciente.setNomeResponsavel(responsavelLegal);
        paciente.setContatoResponsavel(contatoResponsavel);
        new PacienteDao().cadastrarPaciente(paciente);
    }
}

