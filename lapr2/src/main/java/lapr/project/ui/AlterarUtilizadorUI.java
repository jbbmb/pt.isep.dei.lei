package lapr.project.ui;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lapr.project.controller.AlterarPerfilUtilizadorController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/** @author Grupo 18_LAPR2 15-16 */

public class AlterarUtilizadorUI extends javax.swing.JFrame {

    private CentroExposicoes ce;
    private Utilizador utilizadorAtual;
    private String username;
    private AlterarPerfilUtilizadorController controller;
    private String[] infoUser;
    
    /**
     * Creates new form RegistarUtilizadorUI
     */
    public AlterarUtilizadorUI(CentroExposicoes ce, String username) {
        this.ce = ce;
        this.username = username;
        controller = new AlterarPerfilUtilizadorController(ce, username);
        this.infoUser = controller.getDadosUtilizador(username);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        usernameUtilizador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomeUtilizador = new javax.swing.JTextField();
        emailUtilizador = new javax.swing.JTextField();
        botaoContinuar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        respostaSegurancaUtilizador = new javax.swing.JTextField();
        botaoAlterarPassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar perfil de utilizador");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Credenciais de acesso");

        jLabel2.setText("Nome de utilizador:");

        usernameUtilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameUtilizadorActionPerformed(evt);
            }
        });
        usernameUtilizador.setText(infoUser[0]);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Informações do utilizador");

        jLabel5.setText("Nome completo:");

        jLabel6.setText("Endereço de e-mail:");

        nomeUtilizador.setText(infoUser[1]);
        nomeUtilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUtilizadorActionPerformed(evt);
            }
        });

        emailUtilizador.setText(infoUser[2]);

        botaoContinuar.setText("Continuar");
        botaoContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContinuarActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        jLabel7.setText("Resposta de segurança:");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel8.setText("Qual é o seu trabalho de sonho?");

        respostaSegurancaUtilizador.setText(infoUser[3]);

        botaoAlterarPassword.setText("Alterar palavra-passe");
        botaoAlterarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(emailUtilizador))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nomeUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(respostaSegurancaUtilizador)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoAlterarPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nomeUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(emailUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(respostaSegurancaUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoContinuar)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoAlterarPassword))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameUtilizadorActionPerformed
        // INPUT ONLY
    }//GEN-LAST:event_usernameUtilizadorActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        String[] respostas = {"Sim", "Não"};
            final ImageIcon icon = new ImageIcon("src/main/resources/question.png");
            int confirmDialog = JOptionPane.showOptionDialog(null, "Tem a certeza que pretende cancelar a operação?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, respostas, respostas[0]);
                if (confirmDialog == 0) {
                    this.dispose();
                }
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarActionPerformed
        String[] respostas = {"Sim", "Não"};
        boolean validacao = controller.setDadosAlterados(usernameUtilizador.getText(), nomeUtilizador.getText(), emailUtilizador.getText(), respostaSegurancaUtilizador.getText());
           if(validacao){    
        final ImageIcon icon = new ImageIcon("src/main/resources/question.png");
            int confirmDialog = JOptionPane.showOptionDialog(null, "Tem a certeza que pretende guardar as alterações efetuadas?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, respostas, respostas[0]);
                if (confirmDialog == 0) {
                    controller.registarUtilizadorAlterado();
                    final ImageIcon icon2 = new ImageIcon("src/main/resources/check.png");
                    JOptionPane.showMessageDialog(null, "Perfil alterado com sucesso.", "Informação", JOptionPane.ERROR_MESSAGE, icon2);
                    this.dispose();
                }
           }else{
            final ImageIcon icon = new ImageIcon("src/main/resources/error.png");
            JOptionPane.showMessageDialog(null, "Não foi possivel alterar o seu perfil.", "Erro", JOptionPane.ERROR_MESSAGE, icon);
           }
    }//GEN-LAST:event_botaoContinuarActionPerformed

    private void botaoAlterarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarPasswordActionPerformed
        new ReporPasswordUI(ce, username).setVisible(true);
    }//GEN-LAST:event_botaoAlterarPasswordActionPerformed

    private void nomeUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUtilizadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUtilizadorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterarPassword;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoContinuar;
    private javax.swing.JTextField emailUtilizador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nomeUtilizador;
    private javax.swing.JTextField respostaSegurancaUtilizador;
    private javax.swing.JTextField usernameUtilizador;
    // End of variables declaration//GEN-END:variables
}