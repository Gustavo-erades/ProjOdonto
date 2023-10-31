/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prontuario.telas;

import com.mycompany.prontuario.DAO.PacienteDao;
import com.mycompany.prontuario.entidades.Paciente;

/**
 *
 * @author Gustavo
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }

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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cor = new javax.swing.JTextField();
        profissao = new javax.swing.JTextField();
        estadoCivil = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sexo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idade = new javax.swing.JTextField();
        dataNasc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        contatoResponsavel = new javax.swing.JTextField();
        telCelular = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        cep = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        telResidencial = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        telTrabalho = new javax.swing.JTextField();
        responsavelLegal = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        novoProntuario = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prontuário Odontológico Estácio");

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setText("1. IDENTIFICAÇÃO");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setText("NOME:");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        nome.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        nome.setToolTipText("");
        nome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 651, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel3.setText("CPF:");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel4.setText("RG:");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 31, -1));

        cor.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cor.setToolTipText("");
        cor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corActionPerformed(evt);
            }
        });
        jDesktopPane1.add(cor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 270, -1));

        profissao.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        profissao.setToolTipText("");
        profissao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        profissao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        profissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profissaoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(profissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 270, -1));

        estadoCivil.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        estadoCivil.setToolTipText("");
        estadoCivil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        estadoCivil.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        estadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoCivilActionPerformed(evt);
            }
        });
        jDesktopPane1.add(estadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 312, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel5.setText("SEXO:");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel6.setText("COR:");
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        cpf.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cpf.setToolTipText("");
        cpf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cpf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });
        jDesktopPane1.add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 312, -1));

        rg.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rg.setToolTipText("");
        rg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgActionPerformed(evt);
            }
        });
        jDesktopPane1.add(rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 270, -1));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel7.setText("ESTADO CIVIL:");
        jDesktopPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel8.setText("IDADE:");
        jDesktopPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        sexo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        sexo.setToolTipText("");
        sexo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sexo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 312, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel9.setText("DATA DE NASCIMENTO:");
        jDesktopPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel10.setText("PROFISSÃO:");
        jDesktopPane1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        idade.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        idade.setToolTipText("");
        idade.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        idade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 270, -1));

        dataNasc.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        dataNasc.setToolTipText("");
        dataNasc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dataNasc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNascActionPerformed(evt);
            }
        });
        jDesktopPane1.add(dataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 312, -1));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel11.setText("ENDEREÇO:");
        jDesktopPane1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        endereco.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        endereco.setToolTipText("");
        endereco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        endereco.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 651, -1));

        btnCadastrar.setBackground(new java.awt.Color(0, 102, 102));
        btnCadastrar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(204, 255, 255));
        btnCadastrar.setText("Próximo >");
        btnCadastrar.setBorder(null);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 690, 111, 39));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel12.setText("CIDADE:");
        jDesktopPane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel13.setText("CEP:");
        jDesktopPane1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 40, -1));

        email.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        email.setToolTipText("");
        email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jDesktopPane1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 270, -1));

        contatoResponsavel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        contatoResponsavel.setToolTipText("");
        contatoResponsavel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        contatoResponsavel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        contatoResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contatoResponsavelActionPerformed(evt);
            }
        });
        jDesktopPane1.add(contatoResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, 270, -1));

        telCelular.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        telCelular.setToolTipText("");
        telCelular.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        telCelular.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        telCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telCelularActionPerformed(evt);
            }
        });
        jDesktopPane1.add(telCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 312, -1));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel14.setText("TELEFONE RESIDENCIAL:");
        jDesktopPane1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel15.setText("E-MAIL:");
        jDesktopPane1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, -1, -1));

        cidade.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cidade.setToolTipText("");
        cidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cidade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeActionPerformed(evt);
            }
        });
        jDesktopPane1.add(cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 312, -1));

        cep.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cep.setToolTipText("");
        cep.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cep.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepActionPerformed(evt);
            }
        });
        jDesktopPane1.add(cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 270, -1));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel16.setText("TELEFONE CELULAR:");
        jDesktopPane1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, -1, -1));

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel17.setText("TELEFONE TRABALHO:");
        jDesktopPane1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        telResidencial.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        telResidencial.setToolTipText("");
        telResidencial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        telResidencial.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        telResidencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telResidencialActionPerformed(evt);
            }
        });
        jDesktopPane1.add(telResidencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 312, -1));

        jLabel18.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel18.setText("RESPONSÁVEL LEGAL:");
        jDesktopPane1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, -1, -1));

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel19.setText("CONTATO RESPONSÁVEL:");
        jDesktopPane1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 630, -1, -1));

        telTrabalho.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        telTrabalho.setToolTipText("");
        telTrabalho.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        telTrabalho.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        telTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telTrabalhoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(telTrabalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 270, -1));

        responsavelLegal.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        responsavelLegal.setToolTipText("");
        responsavelLegal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        responsavelLegal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        responsavelLegal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responsavelLegalActionPerformed(evt);
            }
        });
        jDesktopPane1.add(responsavelLegal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 660, 312, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gustavo\\OneDrive\\Área de Trabalho\\GitHub\\ProjOdonto\\lgEstacio.png")); // NOI18N
        jDesktopPane1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 120, 50));

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gustavo\\OneDrive\\Área de Trabalho\\GitHub\\ProjOdonto\\fundo.jpg")); // NOI18N
        jDesktopPane1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, -1, -1));

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setNextFocusableComponent(novoProntuario);

        novoProntuario.setText("novo prontuário");
        novoProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoProntuarioActionPerformed(evt);
            }
        });
        jMenuBar1.add(novoProntuario);

        jMenu2.setText("prontuários");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("nova consulta");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("consultas");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void novoProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoProntuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novoProntuarioActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void corActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corActionPerformed

    private void profissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profissaoActionPerformed

    private void estadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoCivilActionPerformed

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

    private void rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgActionPerformed

    private void idadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeActionPerformed

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    private void dataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNascActionPerformed

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void contatoResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contatoResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contatoResponsavelActionPerformed

    private void telCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telCelularActionPerformed

    private void cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeActionPerformed

    private void cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepActionPerformed

    private void telResidencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telResidencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telResidencialActionPerformed

    private void telTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telTrabalhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telTrabalhoActionPerformed

    private void responsavelLegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responsavelLegalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_responsavelLegalActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        Paciente paciente= new Paciente();
        paciente.setNome(nome.getText());
        paciente.setEmail(email.getText());
        paciente.setCpf(cpf.getText());
        paciente.setEndereco(endereco.getText());
        int numIdade=Integer.parseInt(idade.getText());
        paciente.setIdade(numIdade);
        paciente.setRg(rg.getText());
        paciente.setTelefoneCelular(telCelular.getText());
        paciente.setCidade(cidade.getText());
        paciente.setTelefoneResidencial(telResidencial.getText());
        paciente.setTelefoneTrabalho(telTrabalho.getText());
        paciente.setSexo(sexo.getText());
        paciente.setDataNasc(dataNasc.getText());
        paciente.setCor(cor.getText());
        paciente.setEstadoCivil(estadoCivil.getText());
        paciente.setCep(cep.getText());
        paciente.setProfissao(profissao.getText());
        paciente.setNomeResponsavel(responsavelLegal.getText());
        paciente.setContatoResponsavel(contatoResponsavel.getText());
        new PacienteDao().cadastrarPaciente(paciente);
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField contatoResponsavel;
    private javax.swing.JTextField cor;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField dataNasc;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField estadoCivil;
    private javax.swing.JTextField idade;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField nome;
    private javax.swing.JMenu novoProntuario;
    private javax.swing.JTextField profissao;
    private javax.swing.JTextField responsavelLegal;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField sexo;
    private javax.swing.JTextField telCelular;
    private javax.swing.JTextField telResidencial;
    private javax.swing.JTextField telTrabalho;
    // End of variables declaration//GEN-END:variables
}
