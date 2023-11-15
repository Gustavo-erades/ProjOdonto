
package com.mycompany.prontuario.funcoesTela;

import com.mycompany.prontuario.DAO.ResultadoPesquisaDao;
import java.sql.SQLException;

public class ChamaResultadoPesquisa {
    public void botaoPesquisar(String id) throws SQLException{
        ResultadoPesquisa resultadoPesquisa=new ResultadoPesquisa();
        resultadoPesquisa.setId(id);
        new ResultadoPesquisaDao().fazerNovaPesquisa(resultadoPesquisa);
    }
}
