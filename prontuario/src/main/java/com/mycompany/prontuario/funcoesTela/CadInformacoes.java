package com.mycompany.prontuario.funcoesTela;

import com.mycompany.prontuario.DAO.InformacoesDao;
import com.mycompany.prontuario.entidades.Informacoes;


public class CadInformacoes{
    public void botaoCadInformacoes(
            String queixa, String doencaAtual, String medicaPregressa, String medicacaoAtual,
            String alcool, String fumo, String pressaoArterial, String exameFisico, String intraOral,
            String extraOral){
        Informacoes informacoes= new Informacoes();
        informacoes.setQueixa(queixa);
        informacoes.setDoencaAtual(doencaAtual);
        informacoes.setMedicaPregressa(medicaPregressa);
        informacoes.setMedicacaoAtual(medicacaoAtual);
        informacoes.setAlcool(alcool);
        informacoes.setFumo(fumo);
        informacoes.setPressaoArterial(pressaoArterial);
        informacoes.setExameFisico(exameFisico);
        informacoes.setIntraOral(intraOral);
        informacoes.setExtraOral(extraOral);
        new InformacoesDao().cadastrarInformacoes(informacoes);
    }
}
