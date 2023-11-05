package com.mycompany.prontuario.DAO;

import com.mycompany.prontuario.conexao.Conexao;
import com.mycompany.prontuario.entidades.Informacoes;
import com.mycompany.prontuario.telas.Identificacao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InformacoesDao {
    public void cadastrarInformacoes(Informacoes informacoes){
        String sql="INSERT INTO PACIENTE_INFORMACOES"+
                    "(QUEIXA,DOENCA_ATUAL,MEDICA_PRE,MEDICACAO,ALCOOL,FUMO,PRESSAO_ARTERIAL,"
                + "EXAME_FISICO,INTRA_ORAL,EXTRA_ORAL)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement preparedStatement;
        Identificacao identificacao=new Identificacao();
        try {
            preparedStatement= Conexao.getConexao().prepareStatement(sql);
            preparedStatement.setString(1,informacoes.getQueixa());
            preparedStatement.setString(2,informacoes.getDoencaAtual());
            preparedStatement.setString(3,informacoes.getMedicaPregressa());
            preparedStatement.setString(4,informacoes.getMedicacaoAtual());
            preparedStatement.setString(5,informacoes.getAlcool());
            preparedStatement.setString(6,informacoes.getFumo());
            preparedStatement.setString(7,informacoes.getPressaoArterial());
            preparedStatement.setString(8,informacoes.getExameFisico());
            preparedStatement.setString(9,informacoes.getIntraOral());
            preparedStatement.setString(10,informacoes.getExtraOral());
            preparedStatement.execute();
            preparedStatement.close();
            JOptionPane.showMessageDialog(identificacao, "Cadastro das informações do paciente realizado!", "Informações cadastradas",JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException erro) {
            /*System.out.println("Problemas no DAO: "+erro.getMessage());*/
            JOptionPane.showMessageDialog(identificacao, "Problemas no DAO (acesso aos dados do banco de dados"+erro.getMessage(), "Erro no banco de dados",JOptionPane.ERROR_MESSAGE);
        }
    }
}
