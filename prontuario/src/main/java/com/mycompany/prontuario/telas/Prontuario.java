
package com.mycompany.prontuario.telas;

import com.mycompany.prontuario.conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prontuario extends javax.swing.JFrame {
    PreparedStatement preparedStatement;
    public void questoesAbertasSaudeGeral(String id,String nome) throws SQLException{
        
        resultadoId.setText(id);
        resultadoNome.setText(nome);
        String sql="SELECT doenca_contagiosa,alergia,bebida,drogas,medicamento,fumo FROM PACIENTE_SAUDE_GERAL WHERE ID="+id+";";
        ResultSet[] rs=new ResultSet[6];
        preparedStatement= Conexao.getConexao().prepareStatement(sql);
        rs[0]=preparedStatement.executeQuery();
        while(rs[0].next()){
            doencaContagiosa.setText(rs[0].getString("doenca_contagiosa"));
            alergia.setText(rs[0].getString("alergia"));
            bebida.setText(rs[0].getString("bebida"));
            drogas.setText(rs[0].getString("drogas"));
            medicamento.setText(rs[0].getString("medicamento"));
            fumo.setText(rs[0].getString("fumo"));
        }
    }
    public void questoesAbertasOdonto(String id) throws SQLException{
        String sql="SELECT implante, tempo FROM PACIENTE_QUEST_ODONTO WHERE ID="+id+";";
        ResultSet[] rs=new ResultSet[2];
        preparedStatement= Conexao.getConexao().prepareStatement(sql);
        rs[0]=preparedStatement.executeQuery();
        while(rs[0].next()){
            implante.setText(rs[0].getString("implante"));
            tempo.setText(rs[0].getString("tempo"));
        }
    }
    public void questoesOdonto(String id) throws SQLException{
        char[] array;
        String sql="SELECT questoes FROM PACIENTE_QUEST_ODONTO WHERE ID="+id+";";
        ResultSet[] rs=new ResultSet[1];
        preparedStatement= Conexao.getConexao().prepareStatement(sql);
        rs[0]=preparedStatement.executeQuery();
        while(rs[0].next()){
            array = rs[0].getString("questoes").toCharArray();
            if(Character.compare(array[0],'1') == 0){
                afita.setSelected(true);
            }
            if(Character.compare(array[1],'1') == 0){
                gengiva.setSelected(true);
            }
            if(Character.compare(array[2],'1') == 0){
                halitose.setSelected(true);
            }
            if(Character.compare(array[3],'1') == 0){
                mobilidade.setSelected(true);
            }
            if(Character.compare(array[4],'1') == 0){
                sensibilidade.setSelected(true);
            }
            if(Character.compare(array[5],'1') == 0){
                mastigar.setSelected(true);
            }
            if(Character.compare(array[6],'1') == 0){
                estalos.setSelected(true);
            }
            if(Character.compare(array[7],'1') == 0){
                dorCabeca.setSelected(true);
            }
            if(Character.compare(array[8],'1') == 0){
                ranger.setSelected(true);
            }
            if(Character.compare(array[9],'1') == 0){
                alteracao.setSelected(true);
            }
            if(Character.compare(array[10],'1') == 0){
                sorriso.setSelected(true);
            }
            if(Character.compare(array[11],'1') == 0){
                periodental.setSelected(true);
            }
            if(Character.compare(array[12],'1') == 0){
                cirurgia.setSelected(true);
            }
            if(Character.compare(array[13],'1') == 0){
                radiografia.setSelected(true);
            }
            if(Character.compare(array[14],'1') == 0){
                dor.setSelected(true);
            }
            if(Character.compare(array[15],'1') == 0){
                lingua.setSelected(true);
            }
            if(Character.compare(array[16],'1') == 0){
                mastigaDoisLados.setSelected(true);
            }
            if(Character.compare(array[17],'1') == 0){
                alteracaoBoca.setSelected(true);
            }
        }
    }
    public void questoesSaudeGeral(String id) throws SQLException{
        char[] array;
        String sql="SELECT questoes FROM PACIENTE_SAUDE_GERAL WHERE ID="+id+";";
        ResultSet[] rs=new ResultSet[1];
        preparedStatement= Conexao.getConexao().prepareStatement(sql);
        rs[0]=preparedStatement.executeQuery();
        while(rs[0].next()){
            array = rs[0].getString("questoes").toCharArray();
            if(Character.compare(array[0],'1') == 0){
                doresFortes.setSelected(true);
            }
            if(Character.compare(array[1],'1') == 0){
                temVarizes.setSelected(true);
            }
            if(Character.compare(array[2],'1') == 0){
                tontura.setSelected(true);
            }
            if(Character.compare(array[3],'1') == 0){
                hipertenso.setSelected(true);
            }
            if(Character.compare(array[4],'1') == 0){
                pneumonia.setSelected(true);
            }
            if(Character.compare(array[5],'1') == 0){
                respiraBoca.setSelected(true);
            }
            if(Character.compare(array[6],'1') == 0){
                marcapasso.setSelected(true);
            }
            if(Character.compare(array[7],'1') == 0){
                problemaCoracao.setSelected(true);
            }
            if(Character.compare(array[8],'1') == 0){
                tuberculose.setSelected(true);
            }
            if(Character.compare(array[9],'1') == 0){
                diabete.setSelected(true);
            }
            if(Character.compare(array[10],'1') == 0){
                pedraRins.setSelected(true);
            }
            if(Character.compare(array[11],'1') == 0){
                fuma.setSelected(true);
            }
            if(Character.compare(array[12],'1') == 0){
                psicologico.setSelected(true);
            }
            if(Character.compare(array[13],'1') == 0){
                osteoporose.setSelected(true);
            }
            if(Character.compare(array[14],'1') == 0){
                reumatismo.setSelected(true);
            }
            if(Character.compare(array[15],'1') == 0){
                anticoncepcional.setSelected(true);
            }
            if(Character.compare(array[16],'1') == 0){
                eplepsia.setSelected(true);
            }
            if(Character.compare(array[17],'1') == 0){
                sinusite.setSelected(true);
            }
            if(Character.compare(array[18],'1') == 0){
                tratamentoMedico.setSelected(true);
            }
            if(Character.compare(array[19],'1') == 0){
                quimioterapia.setSelected(true);
            }
            if(Character.compare(array[20],'1') == 0){
                dst.setSelected(true);
            }
            if(Character.compare(array[21],'1') == 0){
                aids.setSelected(true);
            }
            if(Character.compare(array[22],'1') == 0){
                anemia.setSelected(true);
            }
            if(Character.compare(array[23],'1') == 0){
                hepatite.setSelected(true);
            }
            if(Character.compare(array[24],'1') == 0){
                cicatrizacao.setSelected(true);
            }
            if(Character.compare(array[25],'1') == 0){
                leucemia.setSelected(true);
            }
            if(Character.compare(array[26],'1') == 0){
                transfusao.setSelected(true);
            }
            if(Character.compare(array[27],'1') == 0){
                labirintite.setSelected(true);
            }
            if(Character.compare(array[28],'1') == 0){
                sangramento.setSelected(true);
            }
            if(Character.compare(array[29],'1') == 0){
                enxaqueca.setSelected(true);
            }
            if(Character.compare(array[30],'1') == 0){
                gravidez.setSelected(true);
            }
            if(Character.compare(array[31],'1') == 0){
                problemaHormonal.setSelected(true);
            }
            if(Character.compare(array[32],'1') == 0){
                hemodialise.setSelected(true);
            }
            if(Character.compare(array[33],'1') == 0){
                cirrose.setSelected(true);
            }
            if(Character.compare(array[34],'1') == 0){
                hempfilia.setSelected(true);
            }
            
        }
        
    }

    /**
     * Creates new form Prontuario
     */
    public Prontuario() {
        initComponents();
        doresFortes.setEnabled(false);
        labirintite.setEnabled(false);
        leucemia.setEnabled(false);
        marcapasso.setEnabled(false);
        osteoporose.setEnabled(false);
        pedraRins.setEnabled(false);
        pneumonia.setEnabled(false);
        problemaCoracao.setEnabled(false);
        problemaHormonal.setEnabled(false);
        psicologico.setEnabled(false);
        quimioterapia.setEnabled(false);
        respiraBoca.setEnabled(false);
        reumatismo.setEnabled(false);
        sangramento.setEnabled(false);
        sinusite.setEnabled(false);
        temVarizes.setEnabled(false);
        tempo.setEnabled(false);
        tontura.setEnabled(false);
        transfusao.setEnabled(false);
        tratamentoMedico.setEnabled(false);
        tuberculose.setEnabled(false);
        aids.setEnabled(false);
        anemia.setEnabled(false);
        anticoncepcional.setEnabled(false);
        cicatrizacao.setEnabled(false);
        cirrose.setEnabled(false);
        diabete.setEnabled(false);
        doresFortes.setEnabled(false);
        dst.setEnabled(false);
        enxaqueca.setEnabled(false);
        eplepsia.setEnabled(false);
        gravidez.setEnabled(false);
        fuma.setEnabled(false);
        hemodialise.setEnabled(false);
        hempfilia.setEnabled(false);
        hepatite.setEnabled(false);
        hipertenso.setEnabled(false);
        afita.setEnabled(false);
        gengiva.setEnabled(false);
        mobilidade.setEnabled(false);
        halitose.setEnabled(false);
        sensibilidade.setEnabled(false);
        mastigar.setEnabled(false);
        estalos.setEnabled(false);
        dorCabeca.setEnabled(false);
        ranger.setEnabled(false);
        alteracao.setEnabled(false);
        sorriso.setEnabled(false);
        periodental.setEnabled(false);
        cirurgia.setEnabled(false);
        radiografia.setEnabled(false);
        dor.setEnabled(false);
        lingua.setEnabled(false);
        mastigaDoisLados.setEnabled(false);
        alteracaoBoca.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane14 = new javax.swing.JScrollPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        resultadoId = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        resultadoNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doencaContagiosa = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        alergia = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        fumo = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        medicamento = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        drogas = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        bebida = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        implante = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        tempo = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        doresFortes = new javax.swing.JCheckBox();
        temVarizes = new javax.swing.JCheckBox();
        tontura = new javax.swing.JCheckBox();
        hipertenso = new javax.swing.JCheckBox();
        pneumonia = new javax.swing.JCheckBox();
        respiraBoca = new javax.swing.JCheckBox();
        marcapasso = new javax.swing.JCheckBox();
        problemaCoracao = new javax.swing.JCheckBox();
        tuberculose = new javax.swing.JCheckBox();
        diabete = new javax.swing.JCheckBox();
        pedraRins = new javax.swing.JCheckBox();
        fuma = new javax.swing.JCheckBox();
        aids = new javax.swing.JCheckBox();
        dst = new javax.swing.JCheckBox();
        quimioterapia = new javax.swing.JCheckBox();
        tratamentoMedico = new javax.swing.JCheckBox();
        sinusite = new javax.swing.JCheckBox();
        eplepsia = new javax.swing.JCheckBox();
        psicologico = new javax.swing.JCheckBox();
        anticoncepcional = new javax.swing.JCheckBox();
        reumatismo = new javax.swing.JCheckBox();
        osteoporose = new javax.swing.JCheckBox();
        hepatite = new javax.swing.JCheckBox();
        anemia = new javax.swing.JCheckBox();
        cirrose = new javax.swing.JCheckBox();
        hempfilia = new javax.swing.JCheckBox();
        leucemia = new javax.swing.JCheckBox();
        transfusao = new javax.swing.JCheckBox();
        labirintite = new javax.swing.JCheckBox();
        cicatrizacao = new javax.swing.JCheckBox();
        sangramento = new javax.swing.JCheckBox();
        enxaqueca = new javax.swing.JCheckBox();
        gravidez = new javax.swing.JCheckBox();
        problemaHormonal = new javax.swing.JCheckBox();
        hemodialise = new javax.swing.JCheckBox();
        jScrollPane11 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        afita = new javax.swing.JCheckBox();
        mobilidade = new javax.swing.JCheckBox();
        gengiva = new javax.swing.JCheckBox();
        sensibilidade = new javax.swing.JCheckBox();
        mastigar = new javax.swing.JCheckBox();
        estalos = new javax.swing.JCheckBox();
        dorCabeca = new javax.swing.JCheckBox();
        alteracao = new javax.swing.JCheckBox();
        ranger = new javax.swing.JCheckBox();
        sorriso = new javax.swing.JCheckBox();
        periodental = new javax.swing.JCheckBox();
        cirurgia = new javax.swing.JCheckBox();
        radiografia = new javax.swing.JCheckBox();
        dor = new javax.swing.JCheckBox();
        mastigaDoisLados = new javax.swing.JCheckBox();
        alteracaoBoca = new javax.swing.JCheckBox();
        lingua = new javax.swing.JCheckBox();
        halitose = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informações do questionário");
        setResizable(false);

        jLabel78.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel78.setText("ID:");
        jLabel78.setToolTipText("ID:");

        resultadoId.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        resultadoId.setText("id");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel62.setText("Nome:");

        resultadoNome.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        resultadoNome.setText("jLabel81");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("questionário de saúde geral");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("questionário odontológico");

        doencaContagiosa.setEditable(false);
        doencaContagiosa.setColumns(20);
        doencaContagiosa.setRows(5);
        jScrollPane1.setViewportView(doencaContagiosa);

        alergia.setEditable(false);
        alergia.setColumns(20);
        alergia.setRows(5);
        jScrollPane2.setViewportView(alergia);

        fumo.setEditable(false);
        fumo.setColumns(20);
        fumo.setRows(5);
        jScrollPane3.setViewportView(fumo);

        medicamento.setEditable(false);
        medicamento.setColumns(20);
        medicamento.setRows(5);
        jScrollPane4.setViewportView(medicamento);

        drogas.setEditable(false);
        drogas.setColumns(20);
        drogas.setRows(5);
        jScrollPane5.setViewportView(drogas);

        bebida.setEditable(false);
        bebida.setColumns(20);
        bebida.setRows(5);
        jScrollPane6.setViewportView(bebida);

        implante.setEditable(false);
        implante.setColumns(20);
        implante.setRows(5);
        jScrollPane7.setViewportView(implante);

        tempo.setEditable(false);
        tempo.setColumns(20);
        tempo.setRows(5);
        jScrollPane8.setViewportView(tempo);

        doresFortes.setText("Já sentiu ou sente dores fortes no peito");

        temVarizes.setText("Tem varizes");
        temVarizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temVarizesActionPerformed(evt);
            }
        });

        tontura.setText(" Quando se levanta depressa sente tontura");

        hipertenso.setText("É hipertenso(a)");

        pneumonia.setText("Já teve pneumonia");

        respiraBoca.setText("Respira pela boca");

        marcapasso.setText("Possui prótese cardíaca ou marcapasso");

        problemaCoracao.setText("Possui algum problema no coração");

        tuberculose.setText("Já teve tuberculose");

        diabete.setText("Tem diabete");

        pedraRins.setText("Tem/Teve pedra nos rins");
        pedraRins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedraRinsActionPerformed(evt);
            }
        });

        fuma.setText("Fuma");

        aids.setText("Tem AIDS");

        dst.setText("Tem/Teve Doença Sexualmente Transmissível");

        quimioterapia.setText("Já fez quimioterapia ou radioterapia");

        tratamentoMedico.setText("Está agora sob tratamento médico");

        sinusite.setText("Tem/teve sinusite ou rinite");

        eplepsia.setText("Tem eplepsia");

        psicologico.setText("Fez/já fez tratamento psicológico/psiquiátrico");

        anticoncepcional.setText("Toma anticoncepcional");

        reumatismo.setText("Tem reumatismo");

        osteoporose.setText("Tem osteoporose");
        osteoporose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                osteoporoseActionPerformed(evt);
            }
        });

        hepatite.setText("Já teve ou tem hepatite");

        anemia.setText("Tem/Teve anemia");

        cirrose.setText("Tem cirrose");

        hempfilia.setText("Tem/Teve hempfilia");

        leucemia.setText("Tem/Teve leucemia");
        leucemia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leucemiaActionPerformed(evt);
            }
        });

        transfusao.setText("Já fez transfusão sanguínea");

        labirintite.setText("Tem labirintite");

        cicatrizacao.setText("A sua cicatrização demora a acontecer");

        sangramento.setText("Quando se machuca sangra muito tempo");

        enxaqueca.setText("Tem enxaqueca");

        gravidez.setText("Está grávida");

        problemaHormonal.setText("Tem algum problema hormonal");

        hemodialise.setText("Faz/Fez hemodiálise");
        hemodialise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hemodialiseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tontura)
                                    .addComponent(hipertenso)
                                    .addComponent(osteoporose, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eplepsia)
                                    .addComponent(problemaCoracao)
                                    .addComponent(pneumonia)
                                    .addComponent(sinusite)
                                    .addComponent(tratamentoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quimioterapia)
                                    .addComponent(sangramento)
                                    .addComponent(enxaqueca)
                                    .addComponent(gravidez)
                                    .addComponent(problemaHormonal)
                                    .addComponent(respiraBoca, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marcapasso, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(doresFortes)
                            .addComponent(temVarizes, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fuma, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diabete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tuberculose)
                            .addComponent(pedraRins, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(psicologico)
                            .addComponent(reumatismo)
                            .addComponent(anticoncepcional)
                            .addComponent(leucemia)
                            .addComponent(transfusao)
                            .addComponent(labirintite)
                            .addComponent(cicatrizacao))
                        .addGap(278, 278, 278)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aids, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dst)
                            .addComponent(anemia, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hepatite)
                            .addComponent(hemodialise)
                            .addComponent(cirrose, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hempfilia))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doresFortes)
                    .addComponent(pneumonia)
                    .addComponent(tuberculose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temVarizes)
                    .addComponent(respiraBoca)
                    .addComponent(diabete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tontura)
                    .addComponent(marcapasso)
                    .addComponent(pedraRins))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hipertenso)
                    .addComponent(problemaCoracao)
                    .addComponent(fuma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eplepsia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(psicologico)
                        .addComponent(dst)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(aids, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sinusite))
                    .addComponent(osteoporose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reumatismo)
                    .addComponent(tratamentoMedico)
                    .addComponent(anemia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anticoncepcional)
                    .addComponent(quimioterapia)
                    .addComponent(hepatite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cicatrizacao)
                    .addComponent(sangramento)
                    .addComponent(hemodialise))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leucemia)
                    .addComponent(enxaqueca)
                    .addComponent(cirrose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transfusao)
                    .addComponent(gravidez)
                    .addComponent(hempfilia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labirintite)
                    .addComponent(problemaHormonal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane10.setViewportView(jPanel2);

        jScrollPane9.setViewportView(jScrollPane10);

        afita.setText("Costuma ter afitas ou herpes?");

        mobilidade.setText("Tem mobilidade nos dentes?");

        gengiva.setText("Sua gengiva costuma sangrar?");
        gengiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gengivaActionPerformed(evt);
            }
        });

        sensibilidade.setText("possui sensibilidade nos dentes com quente/frio?");

        mastigar.setText("Tem dificuldade em abrir a boca e mastigar?");

        estalos.setText("Ouve estalos quando abre ou fecha a boca?");

        dorCabeca.setText("Acorda com dores de cabeça e/ou no pescoço?");

        alteracao.setText("No rosto, alguma alteração de forma, tamanho ou cor?");

        ranger.setText("Costuma apertar ou ranger os dentes?");

        sorriso.setText("O que o/a incomoda no seu sorriso?");

        periodental.setText("Já submeteu-se a tratamento periodental (gengiva)?");

        cirurgia.setText("Já submeteu-se a cirurgia odontológica?");

        radiografia.setText("Fez radiografias recentemente?");

        dor.setText("Sente alguma dor?");

        mastigaDoisLados.setText("Mastiga dos dois lados da boca?");

        alteracaoBoca.setText("Observou alguma alteração de forma, tamanho ou cor na boca?");

        lingua.setText("Morde língua, lábios ou bochechas?");

        halitose.setText("Apresenta mau hálito (halitose)?");
        halitose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halitoseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(afita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gengiva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobilidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mastigar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estalos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sensibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radiografia, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dor, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lingua, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dorCabeca, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ranger, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sorriso, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodental, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cirurgia, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mastigaDoisLados, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alteracaoBoca, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(halitose, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(227, 227, 227))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(afita)
                        .addGap(9, 9, 9)
                        .addComponent(gengiva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mobilidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sensibilidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mastigar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estalos))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(dorCabeca)
                        .addGap(9, 9, 9)
                        .addComponent(ranger)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alteracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sorriso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(periodental)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cirurgia)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radiografia)
                    .addComponent(mastigaDoisLados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dor)
                    .addComponent(alteracaoBoca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lingua)
                    .addComponent(halitose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane11.setViewportView(jPanel3);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("Já teve alguma doença contagiosa? Se SIM qual?");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setText("Já teve alguma doença contagiosa? Se SIM qual?");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setText("Já teve alguma doença contagiosa? Se SIM qual?");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setText("Já teve alguma doença contagiosa? Se SIM qual?");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setText("Já teve alguma doença contagiosa? Se SIM qual?");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setText("Já teve alguma doença contagiosa? Se SIM qual?");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setText("Já realizou implantes dentários? Se sim, como foi a sua experiência?");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel10.setText("Quanto tempo tem seu último tratamento odontológico?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))
                                .addGap(104, 104, 104)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)))
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10))
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultadoId)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultadoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(115, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resultadoId))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(resultadoNome))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jScrollPane13.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void temVarizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temVarizesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temVarizesActionPerformed

    private void osteoporoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_osteoporoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_osteoporoseActionPerformed

    private void leucemiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leucemiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leucemiaActionPerformed

    private void hemodialiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hemodialiseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hemodialiseActionPerformed

    private void pedraRinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedraRinsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pedraRinsActionPerformed

    private void gengivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gengivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gengivaActionPerformed

    private void halitoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halitoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_halitoseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Prontuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prontuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prontuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prontuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prontuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox afita;
    private javax.swing.JCheckBox aids;
    private javax.swing.JTextArea alergia;
    private javax.swing.JCheckBox alteracao;
    private javax.swing.JCheckBox alteracaoBoca;
    private javax.swing.JCheckBox anemia;
    private javax.swing.JCheckBox anticoncepcional;
    private javax.swing.JTextArea bebida;
    private javax.swing.JCheckBox cicatrizacao;
    private javax.swing.JCheckBox cirrose;
    private javax.swing.JCheckBox cirurgia;
    private javax.swing.JCheckBox diabete;
    private javax.swing.JTextArea doencaContagiosa;
    private javax.swing.JCheckBox dor;
    private javax.swing.JCheckBox dorCabeca;
    private javax.swing.JCheckBox doresFortes;
    private javax.swing.JTextArea drogas;
    private javax.swing.JCheckBox dst;
    private javax.swing.JCheckBox enxaqueca;
    private javax.swing.JCheckBox eplepsia;
    private javax.swing.JCheckBox estalos;
    private javax.swing.JCheckBox fuma;
    private javax.swing.JTextArea fumo;
    private javax.swing.JCheckBox gengiva;
    private javax.swing.JCheckBox gravidez;
    private javax.swing.JCheckBox halitose;
    private javax.swing.JCheckBox hemodialise;
    private javax.swing.JCheckBox hempfilia;
    private javax.swing.JCheckBox hepatite;
    private javax.swing.JCheckBox hipertenso;
    private javax.swing.JTextArea implante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JCheckBox labirintite;
    private javax.swing.JCheckBox leucemia;
    private javax.swing.JCheckBox lingua;
    private javax.swing.JCheckBox marcapasso;
    private javax.swing.JCheckBox mastigaDoisLados;
    private javax.swing.JCheckBox mastigar;
    private javax.swing.JTextArea medicamento;
    private javax.swing.JCheckBox mobilidade;
    private javax.swing.JCheckBox osteoporose;
    private javax.swing.JCheckBox pedraRins;
    private javax.swing.JCheckBox periodental;
    private javax.swing.JCheckBox pneumonia;
    private javax.swing.JCheckBox problemaCoracao;
    private javax.swing.JCheckBox problemaHormonal;
    private javax.swing.JCheckBox psicologico;
    private javax.swing.JCheckBox quimioterapia;
    private javax.swing.JCheckBox radiografia;
    private javax.swing.JCheckBox ranger;
    private javax.swing.JCheckBox respiraBoca;
    private javax.swing.JLabel resultadoId;
    private javax.swing.JLabel resultadoNome;
    private javax.swing.JCheckBox reumatismo;
    private javax.swing.JCheckBox sangramento;
    private javax.swing.JCheckBox sensibilidade;
    private javax.swing.JCheckBox sinusite;
    private javax.swing.JCheckBox sorriso;
    private javax.swing.JCheckBox temVarizes;
    private javax.swing.JTextArea tempo;
    private javax.swing.JCheckBox tontura;
    private javax.swing.JCheckBox transfusao;
    private javax.swing.JCheckBox tratamentoMedico;
    private javax.swing.JCheckBox tuberculose;
    // End of variables declaration//GEN-END:variables
}
