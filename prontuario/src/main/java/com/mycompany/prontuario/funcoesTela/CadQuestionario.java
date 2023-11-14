
package com.mycompany.prontuario.funcoesTela;

import com.mycompany.prontuario.DAO.QuestOdontoDao;
import com.mycompany.prontuario.DAO.SaudeGeralDao;
import com.mycompany.prontuario.entidades.QuestOdonto;
import com.mycompany.prontuario.entidades.SaudeGeral;
import java.sql.SQLException;

public class CadQuestionario {
    public void botaoCadProntuario1(String questoes,String doenca_contagiosa,
            String alergia, String bebida, String drogas, String medicamento,
            String fumo ) throws SQLException{
        SaudeGeral saudeGeral= new SaudeGeral();
        saudeGeral.setQuestoes(questoes);
        saudeGeral.setDoencaContagiosa(doenca_contagiosa);
        saudeGeral.setAlergia(alergia);
        saudeGeral.setBebida(bebida);
        saudeGeral.setDrogas(drogas);
        saudeGeral.setMedicamento(medicamento);
        saudeGeral.setFumo(fumo);
        new SaudeGeralDao().cadastrarSaudeGeral(saudeGeral);
        }
}
