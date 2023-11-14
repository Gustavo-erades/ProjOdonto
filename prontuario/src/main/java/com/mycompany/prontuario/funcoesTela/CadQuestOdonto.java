
package com.mycompany.prontuario.funcoesTela;

import com.mycompany.prontuario.DAO.QuestOdontoDao;
import com.mycompany.prontuario.entidades.QuestOdonto;
import java.sql.SQLException;

public class CadQuestOdonto {
    public void botaoCadProntuario2(String questoes,String implante,
            String tempo) throws SQLException{
        QuestOdonto questOdonto= new QuestOdonto();
        questOdonto.setQuestoes(questoes);
        questOdonto.setImplante(implante);
        questOdonto.setTempo(tempo);
        new QuestOdontoDao().cadastrarQuestOdonto(questOdonto);
        }
}
