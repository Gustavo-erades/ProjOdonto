/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prontuario.telas;

import com.mycompany.prontuario.conexao.Conexao;
import com.mycompany.prontuario.funcoesTela.CadInformacoes;
import com.mycompany.prontuario.funcoesTela.CadPaciente;
import com.mycompany.prontuario.funcoesTela.CadQuestOdonto;
import com.mycompany.prontuario.funcoesTela.CadQuestionario;
import com.mycompany.prontuario.funcoesTela.ChamaResultadoPesquisa;
import com.mycompany.prontuario.funcoesTela.Contrato;
import com.mycompany.prontuario.funcoesTela.CriarArquivo;
import com.mycompany.prontuario.funcoesTela.ResultadoPesquisa;
import static java.lang.Integer.parseInt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Gustavo
 */
public class Identificacao extends javax.swing.JFrame {
    PreparedStatement preparedStatement1;
    public void selecionarDadosPaciente() throws SQLException{
        String sql1="SELECT * FROM PACIENTE ORDER BY NOME ASC";
        ResultSet[] rs=new ResultSet[5];
        preparedStatement1= Conexao.getConexao().prepareStatement(sql1);
        rs[0]=preparedStatement1.executeQuery();
        Object[] colunas=new Object[]{"id","nome","idade","telefone","email"};
        DefaultTableModel modelo=new DefaultTableModel(colunas,0);
        while(rs[0].next()){
            Object[] pacientes=new Object[]{
               rs[0].getString("ID"),
               rs[0].getString("NOME"),
               rs[0].getString("IDADE"),
               rs[0].getString("TELEFONE"),
               rs[0].getString("EMAIL")
            };
            modelo.addRow(pacientes);   
        }
         resultPesquisa1.setModel(modelo);
    }
    public void resultadoPesquisaPaciente(String id) throws SQLException{
        String sql="SELECT * FROM PACIENTE WHERE ID="+id+" ORDER BY NOME ASC";
        ResultSet[] rs=new ResultSet[5];
        preparedStatement1= Conexao.getConexao().prepareStatement(sql);
        rs[0]=preparedStatement1.executeQuery();
        Object[] colunas=new Object[]{"CPF","RG","Sexo","Cor/Raça","Estado Civil",
        "Data de Nascimento","Idade","Profissão"};
        DefaultTableModel modelo=new DefaultTableModel(colunas,0);
        while(rs[0].next()){
            Object[] pacientes=new Object[]{
               rs[0].getString("CPF"),
               rs[0].getString("RG"),
               rs[0].getString("SEXO"),
               rs[0].getString("COR"),
               rs[0].getString("ESTADO_CIVIL"),
               rs[0].getString("DATA_NASCIMENTO"),
               rs[0].getString("IDADE"),
               rs[0].getString("PROFISSAO")
            };
            modelo.addRow(pacientes);   
        }
         resultPesquisa2.setModel(modelo);
    }
    public void resultadoPesquisaContato(String id) throws SQLException{
        String sql="SELECT * FROM PACIENTE WHERE ID="+id+";";
        ResultSet[] rs=new ResultSet[4];
        preparedStatement1= Conexao.getConexao().prepareStatement(sql);
        rs[0]=preparedStatement1.executeQuery();
        Object[] colunas=new Object[]{"E-mail","Telefone Residencial","Telefone Celular","Telefone trabalho"};
        DefaultTableModel modelo=new DefaultTableModel(colunas,0);
        while(rs[0].next()){
            Object[] pacientes=new Object[]{
               rs[0].getString("email"),
               rs[0].getString("telefone_casa"),
               rs[0].getString("telefone"),
               rs[0].getString("telefone_trab")
            };
            modelo.addRow(pacientes);   
        }
         resultPesquisa3.setModel(modelo);
    }
    public void resultadoPesquisaEndereco(String id) throws SQLException{
        String sql="SELECT * FROM PACIENTE WHERE ID="+id+";";
        ResultSet[] rs=new ResultSet[3];
        preparedStatement1= Conexao.getConexao().prepareStatement(sql);
        rs[0]=preparedStatement1.executeQuery();
        Object[] colunas=new Object[]{"Endereço","Cidade","CEP"};
        DefaultTableModel modelo=new DefaultTableModel(colunas,0);
        while(rs[0].next()){
            Object[] pacientes=new Object[]{
               rs[0].getString("endereco"),
               rs[0].getString("cidade"),
               rs[0].getString("cep")
            };
            modelo.addRow(pacientes);   
        }
         resultPesquisa4.setModel(modelo);
    }
    public void resultadoPesquisaFiliacao(String id) throws SQLException{
        String sql="SELECT * FROM PACIENTE WHERE ID="+id+";";
        ResultSet[] rs=new ResultSet[3];
        preparedStatement1= Conexao.getConexao().prepareStatement(sql);
        rs[0]=preparedStatement1.executeQuery();
        Object[] colunas=new Object[]{"Nome do responsável legal","Contato do responsável legal","Email do responsavel legal"};
        DefaultTableModel modelo=new DefaultTableModel(colunas,0);
        while(rs[0].next()){
            Object[] pacientes=new Object[]{
               rs[0].getString("responsavel"),
               rs[0].getString("telefone_responsavel"),
               rs[0].getString("email_responsavel")
            };
            modelo.addRow(pacientes);   
        }
         resultPesquisa5.setModel(modelo);
    }
    public void pesquisarDadosPaciente() throws SQLException{
        String sql2="SELECT * FROM PACIENTE WHERE "
                + "(NOME LIKE '%"+caixaPesquisa.getText()+"%') OR"
                + "(ID LIKE '%"+caixaPesquisa.getText()+"%') OR"
                + "(IDADE LIKE'%"+caixaPesquisa.getText()+"%') OR"
                + "(TELEFONE LIKE '%"+caixaPesquisa.getText()+"%') OR"
                + "(EMAIL LIKE '%"+caixaPesquisa.getText()+"%');";
        preparedStatement1= Conexao.getConexao().prepareStatement(sql2);
        ResultSet[] rs=new ResultSet[5];
        rs[0]=preparedStatement1.executeQuery();
        Object[] colunas=new Object[]{"id","nome","idade","telefone","email"};
        DefaultTableModel modelo=new DefaultTableModel(colunas,0);
        while(rs[0].next()){
            Object[] pacientes=new Object[]{
               rs[0].getString("ID"),
               rs[0].getString("NOME"),
               rs[0].getString("IDADE"),
               rs[0].getString("TELEFONE"),
               rs[0].getString("EMAIL")
            };
            modelo.addRow(pacientes);   
        }
         resultPesquisa1.setModel(modelo);
    }
    public void resultadoPesquisaInformacoes(String id) throws SQLException{
        String sql="SELECT * FROM PACIENTE_INFORMACOES WHERE ID_PACIENTE="+id+";";
        ResultSet[] rs=new ResultSet[10];
        preparedStatement1= Conexao.getConexao().prepareStatement(sql);
        rs[0]=preparedStatement1.executeQuery();
        while(rs[0].next()){
            queixa.setText(rs[0].getString("queixa"));
            doenca_atual.setText(rs[0].getString("doenca_atual"));
            medica_pre.setText(rs[0].getString("medica_pre"));
            medicacao.setText(rs[0].getString("medicacao"));
            campo_alcool.setText(rs[0].getString("alcool"));
            campo_fumo.setText(rs[0].getString("fumo"));
            pressao_arterial.setText(rs[0].getString("pressao_arterial"));
            exame_fisico.setText(rs[0].getString("exame_fisico"));
            intra_oral.setText(rs[0].getString("intra_oral"));
            extra_oral.setText(rs[0].getString("extra_oral"));
        }
    }
    public void dadosContrato(String id) throws SQLException{
        String sql="SELECT id,nome,cpf,rg FROM PACIENTE WHERE ID="+id+";";
        ResultSet[] rs=new ResultSet[3];
        preparedStatement1= Conexao.getConexao().prepareStatement(sql);
        rs[0]=preparedStatement1.executeQuery();
        while(rs[0].next()){
            new Contrato().contratoPaciente(rs[0].getString("NOME"),
                    rs[0].getString("CPF"),rs[0].getString("RG"));
        }
    }
    
    public void tabelaSequenciaTratamento(){
        
    }
    /**
     * Creates new form principal
     */
    String campoNome, campoCpf, campoRg, campoCor, campoEstadoCivil, campoDataNasc,
            campoProfissao,campoEndereco,campoCidade,campoCep,campoEmail,
            campoTelResidencial,campoTelCelular,campoTelTrabalho,
            campoResponsavelLegal,campoContatoResponsavelLegal,campoEmailResponsavel,campoSexo;
    int campoIdade;
    String campoQueixa,campoMedicacaoAtual,campoMedicaPregressa,campoIntraOral,campoExtraOral,
            campoDoencaAtual,campoAlcool,campoFumo,campoPressaoArterial,campoExameFisico;
    public Identificacao() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);  
        selecionarDadosPaciente();
        visualizar.setVisible(false);
        resultadoPesquisa.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    /*@SuppressWarnings("unchecked")    int campoIdade;
    String campoQueixa,campoMedicacaoAtual,campoMedicaPregressa,campoIntraOral,campoExtraOral,
            campoDoencaAtual,campoAlcool,campoFumo,campoPressaoArterial,campoExameFisico;
*/
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jComboBox1 = new javax.swing.JComboBox<>();
        doresPeito = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        visualizar = new javax.swing.JButton();
        caixaPesquisa = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultPesquisa1 = new javax.swing.JTable();
        resultadoPesquisa = new javax.swing.JScrollPane();
        resultadoPesquisa2 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultPesquisa2 = new javax.swing.JTable();
        jLabel79 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        resultPesquisa3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        resultPesquisa4 = new javax.swing.JTable();
        jLabel77 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        resultPesquisa5 = new javax.swing.JTable();
        jLabel80 = new javax.swing.JLabel();
        resultadoId = new javax.swing.JLabel();
        resultadoNome = new javax.swing.JLabel();
        resultadoEmail = new javax.swing.JLabel();
        resultadoIdade = new javax.swing.JLabel();
        resultadoCelular = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        queixa = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        doenca_atual = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        medica_pre = new javax.swing.JTextArea();
        jScrollPane21 = new javax.swing.JScrollPane();
        medicacao = new javax.swing.JTextArea();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        campo_alcool = new javax.swing.JTextArea();
        jLabel88 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        pressao_arterial = new javax.swing.JTextArea();
        jScrollPane24 = new javax.swing.JScrollPane();
        intra_oral = new javax.swing.JTextArea();
        jLabel89 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        extra_oral = new javax.swing.JTextArea();
        jLabel90 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        exame_fisico = new javax.swing.JTextArea();
        jLabel91 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        campo_fumo = new javax.swing.JTextArea();
        jLabel92 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dataNasc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        estadoCivil = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cor = new javax.swing.JTextField();
        profissao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        responsavelLegal = new javax.swing.JTextField();
        idade = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cpf = new javax.swing.JFormattedTextField();
        rg = new javax.swing.JFormattedTextField();
        telResidencial = new javax.swing.JFormattedTextField();
        telTrabalho = new javax.swing.JFormattedTextField();
        telCelular = new javax.swing.JFormattedTextField();
        cep = new javax.swing.JFormattedTextField();
        contatoResponsavel = new javax.swing.JFormattedTextField();
        jLabel81 = new javax.swing.JLabel();
        emailResponsavel = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        queixaPrincipal = new javax.swing.JTextArea();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane34 = new javax.swing.JScrollPane();
        doencaAtual = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane35 = new javax.swing.JScrollPane();
        medicaPregressa = new javax.swing.JTextArea();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane36 = new javax.swing.JScrollPane();
        medicacaoUso = new javax.swing.JTextArea();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane37 = new javax.swing.JScrollPane();
        alcool = new javax.swing.JTextArea();
        jScrollPane38 = new javax.swing.JScrollPane();
        fumo = new javax.swing.JTextArea();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane39 = new javax.swing.JScrollPane();
        pressaoArterial = new javax.swing.JTextArea();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane40 = new javax.swing.JScrollPane();
        exameFisico = new javax.swing.JTextArea();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane41 = new javax.swing.JScrollPane();
        intraOral = new javax.swing.JTextArea();
        jLabel58 = new javax.swing.JLabel();
        jScrollPane42 = new javax.swing.JScrollPane();
        extraOral = new javax.swing.JTextArea();
        btnCadastrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        doencaContagiosa = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        tomandoMedicamento = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        drogasIlicitas = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        bebidaAlcoolica = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        alergiaMedicamento = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        parouFumar = new javax.swing.JTextArea();
        temVarizes = new javax.swing.JCheckBox();
        tontura = new javax.swing.JCheckBox();
        doresFortes = new javax.swing.JCheckBox();
        respiraBoca = new javax.swing.JCheckBox();
        hipertenso = new javax.swing.JCheckBox();
        pneumonia = new javax.swing.JCheckBox();
        problemaCoracao = new javax.swing.JCheckBox();
        marcapasso = new javax.swing.JCheckBox();
        diabete = new javax.swing.JCheckBox();
        tuberculose = new javax.swing.JCheckBox();
        osteoporose = new javax.swing.JCheckBox();
        reumatismo = new javax.swing.JCheckBox();
        psicologico = new javax.swing.JCheckBox();
        sinusite = new javax.swing.JCheckBox();
        anticoncepcional = new javax.swing.JCheckBox();
        eplepsia = new javax.swing.JCheckBox();
        quimioterapia = new javax.swing.JCheckBox();
        tratamentoMedico = new javax.swing.JCheckBox();
        aids = new javax.swing.JCheckBox();
        dst = new javax.swing.JCheckBox();
        leucemia = new javax.swing.JCheckBox();
        transfusao = new javax.swing.JCheckBox();
        cicatrizacao = new javax.swing.JCheckBox();
        enxaqueca = new javax.swing.JCheckBox();
        labirintite = new javax.swing.JCheckBox();
        sangramento = new javax.swing.JCheckBox();
        gravidez = new javax.swing.JCheckBox();
        hemodialise = new javax.swing.JCheckBox();
        problemaHormonal = new javax.swing.JCheckBox();
        anemia = new javax.swing.JCheckBox();
        cirrose = new javax.swing.JCheckBox();
        pedraRins = new javax.swing.JCheckBox();
        fuma = new javax.swing.JCheckBox();
        hepatite = new javax.swing.JCheckBox();
        hempfilia = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        dorDente = new javax.swing.JCheckBox();
        cirurgia = new javax.swing.JCheckBox();
        radiografia = new javax.swing.JCheckBox();
        mastigaDoisLados = new javax.swing.JCheckBox();
        alteracaoBoca = new javax.swing.JCheckBox();
        gengiva = new javax.swing.JCheckBox();
        halitose = new javax.swing.JCheckBox();
        afita = new javax.swing.JCheckBox();
        mastigar = new javax.swing.JCheckBox();
        mobilidade = new javax.swing.JCheckBox();
        sensibilidade = new javax.swing.JCheckBox();
        doresPescoco = new javax.swing.JCheckBox();
        estalos = new javax.swing.JCheckBox();
        lingua = new javax.swing.JCheckBox();
        ranger = new javax.swing.JCheckBox();
        sorriso = new javax.swing.JCheckBox();
        periodental = new javax.swing.JCheckBox();
        alteracao = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel46 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        implante = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        tempo = new javax.swing.JTextArea();
        cadastrarProntuario1 = new javax.swing.JButton();
        cancealarQuestionario = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prontuário Odontológico Estácio");

        jTabbedPane1.setForeground(new java.awt.Color(0, 51, 204));

        visualizar.setText("visualizar");
        visualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizarMouseClicked(evt);
            }
        });
        visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarActionPerformed(evt);
            }
        });

        caixaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaPesquisaActionPerformed(evt);
            }
        });

        jButton8.setText("pesquisar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        resultPesquisa1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resultPesquisa1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Idade", "Contato", "Email", "Última Consulta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultPesquisa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultPesquisa1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(resultPesquisa1);

        resultadoPesquisa2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado da pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel62.setText("Nome:");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel69.setText("Email:");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel70.setText("Celular:");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel75.setText("Idade:");

        jLabel78.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel78.setText("ID:");
        jLabel78.setToolTipText("ID:");

        resultPesquisa2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resultPesquisa2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Endereço", "CEP", "Telefone Residencial", "Profissão", "Data de nascimento", "Telefone de Trabalho", "Sexo", "Estado Civil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultPesquisa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultPesquisa2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(resultPesquisa2);

        jLabel79.setText("Dados Pessoais:");

        jLabel76.setText("Dados de Contato:");

        resultPesquisa3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resultPesquisa3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Email", "Telefone Celular", "Telefone Residencial", "Telefone de Trabalho"
            }
        ));
        jScrollPane4.setViewportView(resultPesquisa3);
        if (resultPesquisa3.getColumnModel().getColumnCount() > 0) {
            resultPesquisa3.getColumnModel().getColumn(0).setResizable(false);
            resultPesquisa3.getColumnModel().getColumn(2).setResizable(false);
            resultPesquisa3.getColumnModel().getColumn(3).setResizable(false);
            resultPesquisa3.getColumnModel().getColumn(3).setHeaderValue("Telefone de Trabalho");
        }

        resultPesquisa4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resultPesquisa4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Endereço", "Cidade", "Telefone Residencial"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(resultPesquisa4);
        if (resultPesquisa4.getColumnModel().getColumnCount() > 0) {
            resultPesquisa4.getColumnModel().getColumn(0).setResizable(false);
            resultPesquisa4.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel77.setText("Endereço:");

        resultPesquisa5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resultPesquisa5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome do Responsável Legal", "contato do Responsável Legal"
            }
        ));
        jScrollPane6.setViewportView(resultPesquisa5);
        if (resultPesquisa5.getColumnModel().getColumnCount() > 0) {
            resultPesquisa5.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel80.setText("Filiação:");

        resultadoId.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        resultadoId.setText("id");

        resultadoNome.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        resultadoNome.setText("jLabel81");

        resultadoEmail.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        resultadoEmail.setText("jLabel81");

        resultadoIdade.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        resultadoIdade.setText("jLabel81");

        resultadoCelular.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        resultadoCelular.setText("jLabel81");

        jButton2.setText("questionários de saúde");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Termo de consentimento");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel82.setText("Informações:");

        queixa.setEditable(false);
        queixa.setColumns(20);
        queixa.setRows(5);
        jScrollPane11.setViewportView(queixa);

        doenca_atual.setEditable(false);
        doenca_atual.setColumns(20);
        doenca_atual.setRows(5);
        jScrollPane19.setViewportView(doenca_atual);

        medica_pre.setEditable(false);
        medica_pre.setColumns(20);
        medica_pre.setRows(5);
        jScrollPane20.setViewportView(medica_pre);

        medicacao.setEditable(false);
        medicacao.setColumns(20);
        medicacao.setRows(5);
        jScrollPane21.setViewportView(medicacao);

        jLabel83.setText("Queixa principal:");

        jLabel84.setText("História da doença atual:");

        jLabel85.setText("História médica pregressa:");

        jLabel86.setText("Medicação em uso:");

        jLabel87.setText("Álcool:");

        campo_alcool.setEditable(false);
        campo_alcool.setColumns(20);
        campo_alcool.setRows(5);
        jScrollPane22.setViewportView(campo_alcool);

        jLabel88.setText("Pressão arterial:");

        pressao_arterial.setEditable(false);
        pressao_arterial.setColumns(20);
        pressao_arterial.setRows(5);
        jScrollPane23.setViewportView(pressao_arterial);

        intra_oral.setEditable(false);
        intra_oral.setColumns(20);
        intra_oral.setRows(5);
        jScrollPane24.setViewportView(intra_oral);

        jLabel89.setText("Intra-Oral:");

        extra_oral.setEditable(false);
        extra_oral.setColumns(20);
        extra_oral.setRows(5);
        jScrollPane25.setViewportView(extra_oral);

        jLabel90.setText("Extra-Oral:");

        exame_fisico.setEditable(false);
        exame_fisico.setColumns(20);
        exame_fisico.setRows(5);
        jScrollPane26.setViewportView(exame_fisico);

        jLabel91.setText("Exame físico:");

        campo_fumo.setEditable(false);
        campo_fumo.setColumns(20);
        campo_fumo.setRows(5);
        jScrollPane27.setViewportView(campo_fumo);

        jLabel92.setText("Fumo:");

        javax.swing.GroupLayout resultadoPesquisa2Layout = new javax.swing.GroupLayout(resultadoPesquisa2);
        resultadoPesquisa2.setLayout(resultadoPesquisa2Layout);
        resultadoPesquisa2Layout.setHorizontalGroup(
            resultadoPesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadoPesquisa2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(resultadoPesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(resultadoPesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(resultadoPesquisa2Layout.createSequentialGroup()
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(resultadoId)
                            .addGap(55, 55, 55)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(resultadoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(resultadoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(resultadoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(jLabel70)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(resultadoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(resultadoPesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(resultadoPesquisa2Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
                            .addComponent(jLabel80)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
                            .addComponent(jLabel77)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
                            .addComponent(jLabel79)
                            .addComponent(jLabel76)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel82)
                            .addComponent(jScrollPane11)
                            .addComponent(jScrollPane19)
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane21)
                            .addComponent(jScrollPane22)
                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane27)
                    .addComponent(jScrollPane23)
                    .addComponent(jScrollPane26)
                    .addComponent(jScrollPane24)
                    .addComponent(jScrollPane25))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        resultadoPesquisa2Layout.setVerticalGroup(
            resultadoPesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadoPesquisa2Layout.createSequentialGroup()
                .addGroup(resultadoPesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultadoPesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resultadoId))
                    .addGroup(resultadoPesquisa2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(resultadoPesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(resultadoPesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel62)
                                .addComponent(jLabel69)
                                .addComponent(resultadoNome)
                                .addComponent(resultadoEmail))
                            .addGroup(resultadoPesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel75)
                                .addComponent(resultadoIdade)
                                .addComponent(jLabel70)
                                .addComponent(resultadoCelular)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(resultadoPesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel82)
                .addGap(3, 3, 3)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel84)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        resultadoPesquisa.setViewportView(resultadoPesquisa2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 505, Short.MAX_VALUE)
                .addComponent(caixaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addGap(474, 474, 474))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(visualizar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(resultadoPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 1334, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(155, 155, 155)
                .addComponent(visualizar)
                .addGap(18, 18, 18)
                .addComponent(resultadoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(606, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1103, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Prontuários", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Identificação"));

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("RG:");

        jLabel4.setText("Data de Nasciemento:");

        jLabel5.setText("Estado Civil:");

        jLabel6.setText("Sexo:");

        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro" }));
        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });

        jLabel7.setText("Cor/Raça:");

        jLabel8.setText("Idade:");

        jLabel9.setText("Endereço:");

        jLabel10.setText("CEP:");

        jLabel11.setText("Telefone Celular:");

        jLabel12.setText("Cidade:");

        jLabel13.setText("Telefone Residencial:");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel14.setText("E-mail:");

        jLabel15.setText("Nome do responsável legal:");

        jLabel17.setText("Telefone de Trabalho:");

        jLabel19.setText("Contato do responsável legal:");

        jLabel28.setText("Profissão:");

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.setText("  ");

        try {
            rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telResidencial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telTrabalho.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9 ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            contatoResponsavel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9 ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel81.setText("E-mail do responsável legal:");

        emailResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailResponsavelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(201, 201, 201))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(dataNasc)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(idade)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel28)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profissao, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(rg)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(telResidencial))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(telCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(telTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(167, 167, 167)
                                        .addComponent(jLabel17)))
                                .addGap(0, 20, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contatoResponsavel))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(emailResponsavel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(responsavelLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sexo, 0, 144, Short.MAX_VALUE)
                                    .addComponent(jLabel9)
                                    .addComponent(endereco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))))
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel12)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel13)
                        .addComponent(jLabel11)
                        .addComponent(jLabel17))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel15)
                        .addComponent(jLabel81)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(responsavelLegal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contatoResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        jLabel49.setText("Queixa principal:");

        queixaPrincipal.setColumns(20);
        queixaPrincipal.setRows(5);
        jScrollPane33.setViewportView(queixaPrincipal);

        jLabel50.setText("História da doença atual:");

        doencaAtual.setColumns(20);
        doencaAtual.setRows(5);
        jScrollPane34.setViewportView(doencaAtual);

        jLabel51.setText("História médica pregressa:");

        medicaPregressa.setColumns(20);
        medicaPregressa.setRows(5);
        jScrollPane35.setViewportView(medicaPregressa);

        jLabel52.setText("Medicação em uso:");

        medicacaoUso.setColumns(20);
        medicacaoUso.setRows(5);
        jScrollPane36.setViewportView(medicacaoUso);

        jLabel53.setText("Álcool:");

        jLabel54.setText("Fumo:");

        alcool.setColumns(20);
        alcool.setRows(5);
        jScrollPane37.setViewportView(alcool);

        fumo.setColumns(20);
        fumo.setRows(5);
        jScrollPane38.setViewportView(fumo);

        jLabel55.setText("Pressão arterial:");

        pressaoArterial.setColumns(20);
        pressaoArterial.setRows(5);
        jScrollPane39.setViewportView(pressaoArterial);

        jLabel56.setText("Exame  físico:");

        exameFisico.setColumns(20);
        exameFisico.setRows(5);
        jScrollPane40.setViewportView(exameFisico);

        jLabel57.setText("Intra-oral:");

        intraOral.setColumns(20);
        intraOral.setRows(5);
        jScrollPane41.setViewportView(intraOral);

        jLabel58.setText("Extra-oral:");

        extraOral.setColumns(20);
        extraOral.setRows(5);
        jScrollPane42.setViewportView(extraOral);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jScrollPane40)))
                    .addComponent(jScrollPane33)
                    .addComponent(jScrollPane41, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane42))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jScrollPane12.setViewportView(jPanel10);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(1139, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnCadastrar))
                .addContainerGap(567, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Novo Paciente", jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(1348, 700));

        jPanel2.setMaximumSize(new java.awt.Dimension(3200, 3200));
        jPanel2.setPreferredSize(new java.awt.Dimension(4700, 2000));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Questionário saúde geral"));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Já teve alguma doença contagiosa? Se SIM qual?");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Se PAROU de fumar, por quanto tempo fumou, quantidade/dia e há quanto tempo parou?");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("Ingere bebida alcoólica? Se sim qual frequência?");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel71.setText("Usa ou já usou drogas ilícitas? Se SIM qual e por quanto tempo?");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel72.setText("Está tomando algum medicamento? Se SIM quais?");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel73.setText("Tem alergia a algum medicamento? Se SIM quais?");

        doencaContagiosa.setColumns(20);
        doencaContagiosa.setRows(5);
        jScrollPane7.setViewportView(doencaContagiosa);

        tomandoMedicamento.setColumns(20);
        tomandoMedicamento.setRows(5);
        jScrollPane9.setViewportView(tomandoMedicamento);

        drogasIlicitas.setColumns(20);
        drogasIlicitas.setRows(5);
        jScrollPane13.setViewportView(drogasIlicitas);

        bebidaAlcoolica.setColumns(20);
        bebidaAlcoolica.setRows(5);
        jScrollPane14.setViewportView(bebidaAlcoolica);

        alergiaMedicamento.setColumns(20);
        alergiaMedicamento.setRows(5);
        jScrollPane15.setViewportView(alergiaMedicamento);

        parouFumar.setColumns(20);
        parouFumar.setRows(5);
        jScrollPane16.setViewportView(parouFumar);

        temVarizes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        temVarizes.setText("Tem varizes");
        temVarizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temVarizesActionPerformed(evt);
            }
        });

        tontura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tontura.setText(" Quando se levanta depressa sente tontura");
        tontura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tonturaActionPerformed(evt);
            }
        });

        doresFortes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        doresFortes.setText("Já sentiu ou sente dores fortes no peito");
        doresFortes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doresFortesActionPerformed(evt);
            }
        });

        respiraBoca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        respiraBoca.setText("Respira pela boca");
        respiraBoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respiraBocaActionPerformed(evt);
            }
        });

        hipertenso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hipertenso.setText("É hipertenso(a)");
        hipertenso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hipertensoActionPerformed(evt);
            }
        });

        pneumonia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pneumonia.setText("Já teve pneumonia");
        pneumonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pneumoniaActionPerformed(evt);
            }
        });

        problemaCoracao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        problemaCoracao.setText("Possui algum problema no coração");
        problemaCoracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                problemaCoracaoActionPerformed(evt);
            }
        });

        marcapasso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        marcapasso.setText("Possui prótese cardíaca ou marcapasso");
        marcapasso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcapassoActionPerformed(evt);
            }
        });

        diabete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        diabete.setText("Tem diabete");
        diabete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diabeteActionPerformed(evt);
            }
        });

        tuberculose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tuberculose.setText("Já teve tuberculose");
        tuberculose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuberculoseActionPerformed(evt);
            }
        });

        osteoporose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        osteoporose.setText("Tem osteoporose");
        osteoporose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                osteoporoseActionPerformed(evt);
            }
        });

        reumatismo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reumatismo.setText("Tem reumatismo");
        reumatismo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reumatismoActionPerformed(evt);
            }
        });

        psicologico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        psicologico.setText("Fez/já fez tratamento psicológico/psiquiátrico");
        psicologico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psicologicoActionPerformed(evt);
            }
        });

        sinusite.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sinusite.setText("Tem/teve sinusite ou rinite");
        sinusite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinusiteActionPerformed(evt);
            }
        });

        anticoncepcional.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        anticoncepcional.setText("Toma anticoncepcional");
        anticoncepcional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anticoncepcionalActionPerformed(evt);
            }
        });

        eplepsia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eplepsia.setText("Tem eplepsia");
        eplepsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eplepsiaActionPerformed(evt);
            }
        });

        quimioterapia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quimioterapia.setText("Já fez quimioterapia ou radioterapia");
        quimioterapia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quimioterapiaActionPerformed(evt);
            }
        });

        tratamentoMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tratamentoMedico.setText("Está agora sob tratamento médico");
        tratamentoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tratamentoMedicoActionPerformed(evt);
            }
        });

        aids.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aids.setText("Tem AIDS");
        aids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aidsActionPerformed(evt);
            }
        });

        dst.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dst.setText("Tem/Teve Doença Sexualmente Transmissível");
        dst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dstActionPerformed(evt);
            }
        });

        leucemia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        leucemia.setText("Tem/Teve leucemia");
        leucemia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leucemiaActionPerformed(evt);
            }
        });

        transfusao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfusao.setText("Já fez transfusão sanguínea");
        transfusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfusaoActionPerformed(evt);
            }
        });

        cicatrizacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cicatrizacao.setText("A sua cicatrização demora a acontecer");
        cicatrizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cicatrizacaoActionPerformed(evt);
            }
        });

        enxaqueca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enxaqueca.setText("Tem enxaqueca");
        enxaqueca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enxaquecaActionPerformed(evt);
            }
        });

        labirintite.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labirintite.setText("Tem labirintite");
        labirintite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labirintiteActionPerformed(evt);
            }
        });

        sangramento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sangramento.setText("Quando se machuca sangra muito tempo");
        sangramento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sangramentoActionPerformed(evt);
            }
        });

        gravidez.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gravidez.setText("Está grávida");
        gravidez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravidezActionPerformed(evt);
            }
        });

        hemodialise.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hemodialise.setText("Faz/Fez hemodiálise");
        hemodialise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hemodialiseActionPerformed(evt);
            }
        });

        problemaHormonal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        problemaHormonal.setText("Tem algum problema hormonal");
        problemaHormonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                problemaHormonalActionPerformed(evt);
            }
        });

        anemia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        anemia.setText("Tem/Teve anemia");
        anemia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anemiaActionPerformed(evt);
            }
        });

        cirrose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cirrose.setText("Tem cirrose");
        cirrose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cirroseActionPerformed(evt);
            }
        });

        pedraRins.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pedraRins.setText("Tem/Teve pedra nos rins");
        pedraRins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedraRinsActionPerformed(evt);
            }
        });

        fuma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fuma.setText("Fuma");
        fuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fumaActionPerformed(evt);
            }
        });

        hepatite.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hepatite.setText("Já teve ou tem hepatite");
        hepatite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hepatiteActionPerformed(evt);
            }
        });

        hempfilia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hempfilia.setText("Tem/Teve hempfilia");
        hempfilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hempfiliaActionPerformed(evt);
            }
        });

        jLabel16.setText("1.");

        jLabel18.setText("2.");

        jLabel20.setText("3.");

        jLabel21.setText("4.");

        jLabel22.setText("5.");

        jLabel23.setText("6.");

        jLabel24.setText("7.");

        jLabel27.setText("8.");

        jLabel29.setText("9.");

        jLabel31.setText("10.");

        jLabel32.setText("11.");

        jLabel33.setText("12.");

        jLabel34.setText("13.");

        jLabel35.setText("14.");

        jLabel36.setText("15.");

        jLabel37.setText("16.");

        jLabel38.setText("17.");

        jLabel39.setText("18.");

        jLabel40.setText("19.");

        jLabel41.setText("20.");

        jLabel42.setText("21");

        jLabel43.setText("22.");

        jLabel44.setText("23.");

        jLabel45.setText("24.");

        jLabel47.setText("27.");

        jLabel48.setText("26.");

        jLabel59.setText("28.");

        jLabel60.setText("29.");

        jLabel61.setText("30.");

        jLabel63.setText("31.");

        jLabel64.setText("32.");

        jLabel65.setText("33.");

        jLabel66.setText("34.");

        jLabel67.setText("35.");

        jLabel68.setText("25.");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(fuma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(pedraRins)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(diabete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(tuberculose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(problemaCoracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(marcapasso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(temVarizes)
                            .addComponent(tontura)
                            .addComponent(doresFortes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addGap(1, 1, 1))
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hipertenso)
                            .addComponent(pneumonia)
                            .addComponent(respiraBoca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hepatite)
                    .addComponent(anemia)
                    .addComponent(anticoncepcional)
                    .addComponent(reumatismo)
                    .addComponent(psicologico)
                    .addComponent(eplepsia)
                    .addComponent(sinusite)
                    .addComponent(tratamentoMedico)
                    .addComponent(dst)
                    .addComponent(aids)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(osteoporose, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(quimioterapia, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labirintite)
                    .addComponent(leucemia)
                    .addComponent(transfusao)
                    .addComponent(cicatrizacao)
                    .addComponent(sangramento)
                    .addComponent(enxaqueca)
                    .addComponent(gravidez)
                    .addComponent(problemaHormonal)
                    .addComponent(hemodialise)
                    .addComponent(cirrose)
                    .addComponent(hempfilia))
                .addGap(268, 268, 268))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane7))
                            .addComponent(jLabel25)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(doresFortes)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(temVarizes)
                                    .addComponent(jLabel18))
                                .addGap(28, 28, 28))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tontura)
                                .addComponent(jLabel20)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hipertenso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pneumonia)
                            .addComponent(jLabel22))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(respiraBoca)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(marcapasso)
                                    .addComponent(jLabel24))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(problemaCoracao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tuberculose)
                                    .addComponent(jLabel29)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diabete)
                                    .addComponent(jLabel31)))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(psicologico)
                                        .addComponent(jLabel34))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(osteoporose)
                                    .addGap(28, 28, 28))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(reumatismo)
                                    .addComponent(jLabel36)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel35)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(anticoncepcional, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(eplepsia)
                                    .addComponent(jLabel38))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(sinusite)
                                            .addComponent(jLabel39))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tratamentoMedico)
                                            .addComponent(jLabel40))
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(quimioterapia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel41))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(dst)
                                            .addComponent(jLabel42)))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(aids)
                                            .addComponent(jLabel43)))))
                            .addComponent(jLabel37)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cicatrizacao)
                                    .addComponent(jLabel68))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(leucemia)
                                    .addComponent(jLabel48))
                                .addGap(28, 28, 28))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(transfusao)
                                .addComponent(jLabel47)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labirintite, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sangramento)
                            .addComponent(jLabel60))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enxaqueca)
                            .addComponent(jLabel61))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gravidez, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(problemaHormonal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65)
                            .addComponent(hemodialise))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(cirrose))))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pedraRins)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fuma)
                            .addComponent(jLabel33)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(hempfilia)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anemia)
                            .addComponent(jLabel44))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hepatite)
                            .addComponent(jLabel45))))
                .addGap(45, 45, 45)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel73))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel71)
                            .addComponent(jLabel72))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Questionário Odontológico"));

        dorDente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dorDente.setText("Sente alguma dor?");
        dorDente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dorDenteActionPerformed(evt);
            }
        });

        cirurgia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cirurgia.setText("Já submeteu-se a cirurgia odontológica?");
        cirurgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cirurgiaActionPerformed(evt);
            }
        });

        radiografia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radiografia.setText("Fez radiografias recentemente?");
        radiografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiografiaActionPerformed(evt);
            }
        });

        mastigaDoisLados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mastigaDoisLados.setText("Mastiga dos dois lados da boca?");
        mastigaDoisLados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mastigaDoisLadosActionPerformed(evt);
            }
        });

        alteracaoBoca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        alteracaoBoca.setText("Observou alguma alteração de forma, tamanho ou cor na boca?");
        alteracaoBoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alteracaoBocaActionPerformed(evt);
            }
        });

        gengiva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gengiva.setText("Sua gengiva costuma sangrar?");
        gengiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gengivaActionPerformed(evt);
            }
        });

        halitose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        halitose.setText("Apresenta mau hálito (halitose)?");
        halitose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halitoseActionPerformed(evt);
            }
        });

        afita.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        afita.setText("Costuma ter afitas ou herpes?");
        afita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afitaActionPerformed(evt);
            }
        });

        mastigar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mastigar.setText("Tem dificuldade em abrir a boca e mastigar?");
        mastigar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mastigarActionPerformed(evt);
            }
        });

        mobilidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mobilidade.setText("Tem mobilidade nos dentes?");
        mobilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilidadeActionPerformed(evt);
            }
        });

        sensibilidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sensibilidade.setText("possui sensibilidade nos dentes com quente/frio?");
        sensibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sensibilidadeActionPerformed(evt);
            }
        });

        doresPescoco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        doresPescoco.setText("Acorda com dores de cabeça e/ou no pescoço?");
        doresPescoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doresPescocoActionPerformed(evt);
            }
        });

        estalos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estalos.setText("Ouve estalos quando abre ou fecha a boca?");
        estalos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estalosActionPerformed(evt);
            }
        });

        lingua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lingua.setText("Morde língua, lábios ou bochechas?");
        lingua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linguaActionPerformed(evt);
            }
        });

        ranger.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ranger.setText("Costuma apertar ou ranger os dentes?");
        ranger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangerActionPerformed(evt);
            }
        });

        sorriso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorriso.setText("O que o/a incomoda no seu sorriso?");
        sorriso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorrisoActionPerformed(evt);
            }
        });

        periodental.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        periodental.setText("Já submeteu-se a tratamento periodental (gengiva)?");
        periodental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodentalActionPerformed(evt);
            }
        });

        alteracao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        alteracao.setText("No rosto, alguma alteração de forma, tamanho ou cor?");
        alteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alteracaoActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel46.setText("Já realizou implantes dentários? Se sim, como foi a sua experiência?");

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel74.setText("Quanto tempo tem seu último tratamento odontológico?");

        implante.setColumns(20);
        implante.setRows(5);
        jScrollPane17.setViewportView(implante);

        tempo.setColumns(20);
        tempo.setRows(5);
        jScrollPane18.setViewportView(tempo);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mobilidade)
                                    .addComponent(gengiva)
                                    .addComponent(halitose)
                                    .addComponent(afita)
                                    .addComponent(sensibilidade)
                                    .addComponent(mastigar)
                                    .addComponent(doresPescoco)
                                    .addComponent(estalos)
                                    .addComponent(ranger))
                                .addGap(117, 117, 117)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cirurgia)
                                    .addComponent(sorriso)
                                    .addComponent(periodental)
                                    .addComponent(alteracao)
                                    .addComponent(radiografia)
                                    .addComponent(lingua)
                                    .addComponent(mastigaDoisLados)
                                    .addComponent(alteracaoBoca)
                                    .addComponent(dorDente)))
                            .addComponent(jLabel46)
                            .addComponent(jLabel74)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                            .addComponent(jScrollPane18))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(afita)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gengiva)
                                .addGap(28, 28, 28))
                            .addComponent(halitose))
                        .addGap(5, 5, 5)
                        .addComponent(mobilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sensibilidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mastigar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estalos)
                        .addGap(3, 3, 3)
                        .addComponent(doresPescoco, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ranger))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(alteracao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sorriso)
                                .addGap(28, 28, 28))
                            .addComponent(periodental))
                        .addGap(5, 5, 5)
                        .addComponent(cirurgia, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radiografia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dorDente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lingua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mastigaDoisLados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alteracaoBoca)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cadastrarProntuario1.setText("Confirmar");
        cadastrarProntuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProntuario1ActionPerformed(evt);
            }
        });

        cancealarQuestionario.setText("Cancelar");
        cancealarQuestionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancealarQuestionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cadastrarProntuario1)
                        .addGap(18, 18, 18)
                        .addComponent(cancealarQuestionario))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(3258, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarProntuario1)
                    .addComponent(cancealarQuestionario))
                .addContainerGap(719, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Novo Prontuário", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarActionPerformed
        resultadoPesquisa.setVisible(true);
    }//GEN-LAST:event_visualizarActionPerformed

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        campoNome=nome.getText();
        campoCpf=cpf.getText();
        campoRg=rg.getText();
        campoCor=cor.getText();
        campoEstadoCivil=estadoCivil.getText();
        campoDataNasc=dataNasc.getText();
        campoIdade=parseInt(idade.getText());
        campoProfissao=profissao.getText();
        campoEndereco=endereco.getText();
        campoCidade=cidade.getText();
        campoCep=cep.getText();
        campoEmail=email.getText();
        campoTelResidencial=telResidencial.getText();
        campoTelCelular=telCelular.getText();
        campoTelTrabalho=telTrabalho.getText();
        campoResponsavelLegal=responsavelLegal.getText();
        campoContatoResponsavelLegal=contatoResponsavel.getText();
        campoEmailResponsavel=emailResponsavel.getText();
        campoSexo=sexo.getSelectedItem().toString();
        try {
            new CadPaciente().botaoCadPaciente(campoNome, campoEmail,campoCpf,campoEndereco,
                    campoIdade,campoRg,campoTelCelular,campoCidade, campoTelResidencial,
                    campoTelTrabalho, campoSexo, campoDataNasc, campoCor, campoEstadoCivil,
                    campoCep,campoProfissao,campoResponsavelLegal, campoContatoResponsavelLegal,campoEmailResponsavel);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Problemas no cadastro de paciente. Volte no arquivo 'Identificacao.java'"+ex, "Problemas no cadastro de pacientes", JOptionPane.ERROR_MESSAGE);
       }
        
        nome.setText("");
        cpf.setText("");
        rg.setText("");
        cor.setText("");
        estadoCivil.setText("");
        dataNasc.setText("");
        idade.setText("");
        profissao.setText("");
        endereco.setText("");
        cidade.setText("");
        cep.setText("");
        email.setText("");
        telResidencial.setText("");
        telCelular.setText("");
        telTrabalho.setText("");
        responsavelLegal.setText("");
        contatoResponsavel.setText("");
        
        campoQueixa=queixaPrincipal.getText();
        campoDoencaAtual=doencaAtual.getText();
        campoMedicacaoAtual=medicacaoUso.getText();
        campoMedicaPregressa=medicaPregressa.getText();
        campoAlcool=alcool.getText();
        campoFumo=fumo.getText();
        campoPressaoArterial=pressaoArterial.getText();
        campoExameFisico=exameFisico.getText();
        campoIntraOral=intraOral.getText();
        campoExtraOral=extraOral.getText();
        try {
            new CadInformacoes().botaoCadInformacoes(campoQueixa, campoDoencaAtual, campoMedicaPregressa, campoMedicacaoAtual, campoAlcool, campoFumo, campoPressaoArterial, campoExameFisico, campoIntraOral, campoExtraOral);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Problemas no cadastro de informações do paciente. Volte no arquivo 'Identificacao.java'"+ex, "Problemas no cadastro de informações", JOptionPane.ERROR_MESSAGE);
        }
        
        queixaPrincipal.setText("");
        doencaAtual.setText("");
        medicacaoUso.setText("");
        alcool.setText("");
        fumo.setText("");
        pressaoArterial.setText("");
        exameFisico.setText("");
        intraOral.setText("");
        extraOral.setText("");
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        nome.setText("");
        cpf.setText("");
        rg.setText("");
        cor.setText("");
        estadoCivil.setText("");
        dataNasc.setText("");
        idade.setText("");
        profissao.setText("");
        endereco.setText("");
        cidade.setText("");
        cep.setText("");
        email.setText("");
        telResidencial.setText("");
        telCelular.setText("");
        telTrabalho.setText("");
        responsavelLegal.setText("");
        contatoResponsavel.setText("");
        
        queixaPrincipal.setText("");
        doencaAtual.setText("");
        medicacaoUso.setText("");
        alcool.setText("");
        fumo.setText("");
        pressaoArterial.setText("");
        exameFisico.setText("");
        intraOral.setText("");
        extraOral.setText("");
        
        JOptionPane.showMessageDialog(rootPane,"Cadastro dos dados cancelado", "Cancelado!",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void caixaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaPesquisaActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            pesquisarDadosPaciente();
        } catch (SQLException ex) {
            Logger.getLogger(Identificacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void resultPesquisa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultPesquisa1MouseClicked
        visualizar.setVisible(true);
        int linhaSelecionada=resultPesquisa1.getSelectedRow();
        resultadoNome.setText(resultPesquisa1.getValueAt(linhaSelecionada,1).toString());
        resultadoId.setText(resultPesquisa1.getValueAt(linhaSelecionada,0).toString());
        resultadoEmail.setText(resultPesquisa1.getValueAt(linhaSelecionada,4).toString());
        resultadoCelular.setText(resultPesquisa1.getValueAt(linhaSelecionada,3).toString());
        resultadoIdade.setText(resultPesquisa1.getValueAt(linhaSelecionada,2).toString());
        try {
            resultadoPesquisaPaciente(resultPesquisa1.getValueAt(linhaSelecionada,0).toString());
            resultadoPesquisaContato(resultPesquisa1.getValueAt(linhaSelecionada,0).toString());
            resultadoPesquisaEndereco(resultPesquisa1.getValueAt(linhaSelecionada,0).toString());
            resultadoPesquisaFiliacao(resultPesquisa1.getValueAt(linhaSelecionada,0).toString());
            resultadoPesquisaInformacoes(resultPesquisa1.getValueAt(linhaSelecionada,0).toString());
            dadosContrato(resultPesquisa1.getValueAt(linhaSelecionada,0).toString());
        } catch (SQLException ex) {
            Logger.getLogger(Identificacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_resultPesquisa1MouseClicked

    private void resultPesquisa2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultPesquisa2MouseClicked

    }//GEN-LAST:event_resultPesquisa2MouseClicked

    private void emailResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailResponsavelActionPerformed

    private void visualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_visualizarMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new TermosConsentimento().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void alteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alteracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alteracaoActionPerformed

    private void periodentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodentalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodentalActionPerformed

    private void sorrisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorrisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sorrisoActionPerformed

    private void rangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rangerActionPerformed

    private void linguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linguaActionPerformed

    private void estalosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estalosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estalosActionPerformed

    private void doresPescocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doresPescocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doresPescocoActionPerformed

    private void sensibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sensibilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sensibilidadeActionPerformed

    private void mobilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobilidadeActionPerformed

    private void mastigarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mastigarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mastigarActionPerformed

    private void afitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_afitaActionPerformed

    private void halitoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halitoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_halitoseActionPerformed

    private void gengivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gengivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gengivaActionPerformed

    private void alteracaoBocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alteracaoBocaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alteracaoBocaActionPerformed

    private void mastigaDoisLadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mastigaDoisLadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mastigaDoisLadosActionPerformed

    private void radiografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiografiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiografiaActionPerformed

    private void cirurgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cirurgiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cirurgiaActionPerformed

    private void dorDenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dorDenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dorDenteActionPerformed

    private void hempfiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hempfiliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hempfiliaActionPerformed

    private void hepatiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hepatiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hepatiteActionPerformed

    private void fumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fumaActionPerformed

    private void pedraRinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedraRinsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pedraRinsActionPerformed

    private void cirroseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cirroseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cirroseActionPerformed

    private void anemiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anemiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anemiaActionPerformed

    private void problemaHormonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_problemaHormonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_problemaHormonalActionPerformed

    private void hemodialiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hemodialiseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hemodialiseActionPerformed

    private void gravidezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravidezActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gravidezActionPerformed

    private void sangramentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sangramentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sangramentoActionPerformed

    private void labirintiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labirintiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labirintiteActionPerformed

    private void enxaquecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enxaquecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enxaquecaActionPerformed

    private void cicatrizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cicatrizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cicatrizacaoActionPerformed

    private void transfusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfusaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transfusaoActionPerformed

    private void leucemiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leucemiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leucemiaActionPerformed

    private void dstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dstActionPerformed

    private void aidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aidsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aidsActionPerformed

    private void tratamentoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tratamentoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tratamentoMedicoActionPerformed

    private void quimioterapiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quimioterapiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quimioterapiaActionPerformed

    private void eplepsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eplepsiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eplepsiaActionPerformed

    private void anticoncepcionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anticoncepcionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anticoncepcionalActionPerformed

    private void sinusiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinusiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sinusiteActionPerformed

    private void psicologicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psicologicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psicologicoActionPerformed

    private void reumatismoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reumatismoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reumatismoActionPerformed

    private void osteoporoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_osteoporoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_osteoporoseActionPerformed

    private void tuberculoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuberculoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuberculoseActionPerformed

    private void diabeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diabeteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diabeteActionPerformed

    private void marcapassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcapassoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcapassoActionPerformed

    private void problemaCoracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_problemaCoracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_problemaCoracaoActionPerformed

    private void pneumoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pneumoniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pneumoniaActionPerformed

    private void hipertensoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hipertensoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hipertensoActionPerformed

    private void respiraBocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respiraBocaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respiraBocaActionPerformed

    private void doresFortesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doresFortesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doresFortesActionPerformed

    private void tonturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tonturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tonturaActionPerformed

    private void temVarizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temVarizesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temVarizesActionPerformed

    private void cancealarQuestionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancealarQuestionarioActionPerformed
        doencaContagiosa.setText("");
        alergiaMedicamento.setText("");
        bebidaAlcoolica.setText("");
        drogasIlicitas.setText("");
        tomandoMedicamento.setText("");
        parouFumar.setText("");
        JOptionPane.showMessageDialog(rootPane, "Cadastro das informações de saúde cancelado!","Cancelar cadastro de dados de saúde",JOptionPane.CANCEL_OPTION);
    }//GEN-LAST:event_cancealarQuestionarioActionPerformed

    private void cadastrarProntuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProntuario1ActionPerformed
        String campoDoencaAtual2,campoAlergiaMedicamento,campoBebidaAlcoolica,campoDrogasIlicitas,
        campoTomandoMedicamento,campoParouFumar,questoes ;
        String campoImplante, campoTempo, questoesOdonto;
        // pega os valores dos checkboxes
        questoes=(doresFortes.isSelected()?"1":"0");
        questoes=questoes+(temVarizes.isSelected()?"1":"0");
        questoes=questoes+(tontura.isSelected()?"1":"0");
        questoes=questoes+(hipertenso.isSelected()?"1":"0");
        questoes=questoes+(pneumonia.isSelected()?"1":"0");
        questoes=questoes+(respiraBoca.isSelected()?"1":"0");
        questoes=questoes+(marcapasso.isSelected()?"1":"0");
        questoes=questoes+(problemaCoracao.isSelected()?"1":"0");
        questoes=questoes+(tuberculose.isSelected()?"1":"0");
        questoes=questoes+(diabete.isSelected()?"1":"0");
        questoes=questoes+(pedraRins.isSelected()?"1":"0");
        questoes=questoes+(fuma.isSelected()?"1":"0");
        questoes=questoes+(psicologico.isSelected()?"1":"0");
        questoes=questoes+(osteoporose.isSelected()?"1":"0");
        questoes=questoes+(reumatismo.isSelected()?"1":"0");
        questoes=questoes+(anticoncepcional.isSelected()?"1":"0");
        questoes=questoes+(eplepsia.isSelected()?"1":"0");
        questoes=questoes+(sinusite.isSelected()?"1":"0");
        questoes=questoes+(tratamentoMedico.isSelected()?"1":"0");
        questoes=questoes+(quimioterapia.isSelected()?"1":"0");
        questoes=questoes+(dst.isSelected()?"1":"0");
        questoes=questoes+(aids.isSelected()?"1":"0");
        questoes=questoes+(anemia.isSelected()?"1":"0");
        questoes=questoes+(hepatite.isSelected()?"1":"0");
        questoes=questoes+(cicatrizacao.isSelected()?"1":"0");
        questoes=questoes+(leucemia.isSelected()?"1":"0");
        questoes=questoes+(transfusao.isSelected()?"1":"0");
        questoes=questoes+(labirintite.isSelected()?"1":"0");
        questoes=questoes+(sangramento.isSelected()?"1":"0");
        questoes=questoes+(enxaqueca.isSelected()?"1":"0");
        questoes=questoes+(gravidez.isSelected()?"1":"0");
        questoes=questoes+(problemaHormonal.isSelected()?"1":"0");
        questoes=questoes+(hemodialise.isSelected()?"1":"0");
        questoes=questoes+(hempfilia.isSelected()?"1":"0");
        questoes=questoes+(cirrose.isSelected()?"1":"0");
        //pegar valor das caixas de texto
        campoDoencaAtual2=doencaContagiosa.getText();
        campoAlergiaMedicamento=alergiaMedicamento.getText();
        campoBebidaAlcoolica=bebidaAlcoolica.getText();
        campoDrogasIlicitas=drogasIlicitas.getText();
        campoTomandoMedicamento=tomandoMedicamento.getText();
        campoParouFumar=parouFumar.getText();

        questoesOdonto=(afita.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(gengiva.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(halitose.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(mobilidade.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(sensibilidade.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(mastigar.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(estalos.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(doresPescoco.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(ranger.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(alteracao.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(sorriso.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(periodental.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(cirurgia.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(radiografia.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(dorDente.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(lingua.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(mastigaDoisLados.isSelected()?"1":"0");
        questoesOdonto=questoesOdonto+(alteracaoBoca.isSelected()?"1":"0");
        campoImplante=implante.getText();
        campoTempo=tempo.getText();
        try {
            new CadQuestionario().botaoCadProntuario1(questoes,campoDoencaAtual2,campoAlergiaMedicamento,
                campoBebidaAlcoolica,campoDrogasIlicitas,campoTomandoMedicamento,campoParouFumar);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Problemas no cadastro do questionário de saúde geral. Arquivo 'Identificacao.java' "+ex, "Problemas no cadastro da saúde geral", JOptionPane.ERROR_MESSAGE);
        }
        try{
            new CadQuestOdonto().botaoCadProntuario2(questoesOdonto, campoImplante, campoTempo);
        } catch(SQLException ex2){
            JOptionPane.showMessageDialog(rootPane, "Problemas no cadastro do questionário odontológico. Arquivo 'Identificacao.java' "+ex2, "Problemas no cadastro do questionário odontológico", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cadastrarProntuario1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Prontuario questoesTela=new Prontuario();
        questoesTela.setVisible(true);
        int linhaSelecionada=resultPesquisa1.getSelectedRow();
        String id=resultPesquisa1.getValueAt(linhaSelecionada,0).toString();
        try {
            questoesTela.questoesAbertasSaudeGeral(id);
            questoesTela.questoesAbertasOdonto(id);
        } catch (SQLException ex) {
            Logger.getLogger(Identificacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Identificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Identificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Identificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Identificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Identificacao().setVisible(true);
                } catch(SQLException ex) {
                    Logger.getLogger(Identificacao.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox afita;
    private javax.swing.JCheckBox aids;
    private javax.swing.JTextArea alcool;
    private javax.swing.JTextArea alergiaMedicamento;
    private javax.swing.JCheckBox alteracao;
    private javax.swing.JCheckBox alteracaoBoca;
    private javax.swing.JCheckBox anemia;
    private javax.swing.JCheckBox anticoncepcional;
    private javax.swing.JTextArea bebidaAlcoolica;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton cadastrarProntuario1;
    private javax.swing.JTextField caixaPesquisa;
    private javax.swing.JTextArea campo_alcool;
    private javax.swing.JTextArea campo_fumo;
    private javax.swing.JButton cancealarQuestionario;
    private javax.swing.JFormattedTextField cep;
    private javax.swing.JCheckBox cicatrizacao;
    private javax.swing.JTextField cidade;
    private javax.swing.JCheckBox cirrose;
    private javax.swing.JCheckBox cirurgia;
    private javax.swing.JFormattedTextField contatoResponsavel;
    private javax.swing.JTextField cor;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JTextField dataNasc;
    private javax.swing.JCheckBox diabete;
    private javax.swing.JTextArea doencaAtual;
    private javax.swing.JTextArea doencaContagiosa;
    private javax.swing.JTextArea doenca_atual;
    private javax.swing.JCheckBox dorDente;
    private javax.swing.JCheckBox doresFortes;
    private javax.swing.ButtonGroup doresPeito;
    private javax.swing.JCheckBox doresPescoco;
    private javax.swing.JTextArea drogasIlicitas;
    private javax.swing.JCheckBox dst;
    private javax.swing.JTextField email;
    private javax.swing.JTextField emailResponsavel;
    private javax.swing.JTextField endereco;
    private javax.swing.JCheckBox enxaqueca;
    private javax.swing.JCheckBox eplepsia;
    private javax.swing.JTextField estadoCivil;
    private javax.swing.JCheckBox estalos;
    private javax.swing.JTextArea exameFisico;
    private javax.swing.JTextArea exame_fisico;
    private javax.swing.JTextArea extraOral;
    private javax.swing.JTextArea extra_oral;
    private javax.swing.JCheckBox fuma;
    private javax.swing.JTextArea fumo;
    private javax.swing.JCheckBox gengiva;
    private javax.swing.JCheckBox gravidez;
    private javax.swing.JCheckBox halitose;
    private javax.swing.JCheckBox hemodialise;
    private javax.swing.JCheckBox hempfilia;
    private javax.swing.JCheckBox hepatite;
    private javax.swing.JCheckBox hipertenso;
    private javax.swing.JTextField idade;
    private javax.swing.JTextArea implante;
    private javax.swing.JTextArea intraOral;
    private javax.swing.JTextArea intra_oral;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox labirintite;
    private javax.swing.JCheckBox leucemia;
    private javax.swing.JCheckBox lingua;
    private javax.swing.JCheckBox marcapasso;
    private javax.swing.JCheckBox mastigaDoisLados;
    private javax.swing.JCheckBox mastigar;
    private javax.swing.JTextArea medicaPregressa;
    private javax.swing.JTextArea medica_pre;
    private javax.swing.JTextArea medicacao;
    private javax.swing.JTextArea medicacaoUso;
    private javax.swing.JCheckBox mobilidade;
    private javax.swing.JTextField nome;
    private javax.swing.JCheckBox osteoporose;
    private javax.swing.JTextArea parouFumar;
    private javax.swing.JCheckBox pedraRins;
    private javax.swing.JCheckBox periodental;
    private javax.swing.JCheckBox pneumonia;
    private javax.swing.JTextArea pressaoArterial;
    private javax.swing.JTextArea pressao_arterial;
    private javax.swing.JCheckBox problemaCoracao;
    private javax.swing.JCheckBox problemaHormonal;
    private javax.swing.JTextField profissao;
    private javax.swing.JCheckBox psicologico;
    private javax.swing.JTextArea queixa;
    private javax.swing.JTextArea queixaPrincipal;
    private javax.swing.JCheckBox quimioterapia;
    private javax.swing.JCheckBox radiografia;
    private javax.swing.JCheckBox ranger;
    private javax.swing.JCheckBox respiraBoca;
    private javax.swing.JTextField responsavelLegal;
    private javax.swing.JTable resultPesquisa1;
    private javax.swing.JTable resultPesquisa2;
    private javax.swing.JTable resultPesquisa3;
    private javax.swing.JTable resultPesquisa4;
    private javax.swing.JTable resultPesquisa5;
    private javax.swing.JLabel resultadoCelular;
    private javax.swing.JLabel resultadoEmail;
    private javax.swing.JLabel resultadoId;
    private javax.swing.JLabel resultadoIdade;
    private javax.swing.JLabel resultadoNome;
    private javax.swing.JScrollPane resultadoPesquisa;
    private javax.swing.JPanel resultadoPesquisa2;
    private javax.swing.JCheckBox reumatismo;
    private javax.swing.JFormattedTextField rg;
    private javax.swing.JCheckBox sangramento;
    private javax.swing.JCheckBox sensibilidade;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JCheckBox sinusite;
    private javax.swing.JCheckBox sorriso;
    private javax.swing.JFormattedTextField telCelular;
    private javax.swing.JFormattedTextField telResidencial;
    private javax.swing.JFormattedTextField telTrabalho;
    private javax.swing.JCheckBox temVarizes;
    private javax.swing.JTextArea tempo;
    private javax.swing.JTextArea tomandoMedicamento;
    private javax.swing.JCheckBox tontura;
    private javax.swing.JCheckBox transfusao;
    private javax.swing.JCheckBox tratamentoMedico;
    private javax.swing.JCheckBox tuberculose;
    private javax.swing.JButton visualizar;
    // End of variables declaration//GEN-END:variables
}
