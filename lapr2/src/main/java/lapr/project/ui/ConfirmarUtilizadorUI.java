package lapr.project.ui;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lapr.project.controller.ConfirmarUtilizadorController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/** @author Grupo 18_LAPR2 15-16 */

public class ConfirmarUtilizadorUI extends javax.swing.JFrame {

    private CentroExposicoes centroExposicoes;
    private ConfirmarUtilizadorController cuctrl;
    private DefaultComboBoxModel listaUtilizadoresModel;

    /**
     * Creates new form ConfirmarUtilizadorUI
     *
     * @param <error>
     */
    public ConfirmarUtilizadorUI(CentroExposicoes centro) {
        this.centroExposicoes = centro;
        this.cuctrl = new ConfirmarUtilizadorController(centroExposicoes);
        this.listaUtilizadoresModel = new DefaultComboBoxModel();
        List<Utilizador> listaUtilizadores = cuctrl.getListaUtilizadoresNaoConfirmados();
        for (int i = 0; i < listaUtilizadores.size(); i++) {
            listaUtilizadoresModel.addElement(listaUtilizadores.get(i).getUsername());
        }
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

        botaoCancelar = new javax.swing.JButton();
        usernamePendente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomePendente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        emailPendente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        botaoContinuar3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        boxUtilizadoresPendentes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmar novo perfil de utilizador");
        setResizable(false);

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        usernamePendente.setEditable(false);
        usernamePendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamePendenteActionPerformed(evt);
            }
        });

        jLabel5.setText("Nome completo:");

        jLabel6.setText("Endereço de e-mail:");

        nomePendente.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Informações registadas");

        emailPendente.setEditable(false);

        botaoContinuar3.setText("Continuar");
        botaoContinuar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContinuar3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome de utilizador:");

        jLabel10.setText("Utilizadores com perfil por confirmar:");

        boxUtilizadoresPendentes.setModel(listaUtilizadoresModel);
        boxUtilizadoresPendentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxUtilizadoresPendentesActionPerformed(evt);
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
                        .addComponent(usernamePendente, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailPendente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomePendente, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxUtilizadoresPendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoContinuar3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(boxUtilizadoresPendentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernamePendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nomePendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(emailPendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoContinuar3)
                    .addComponent(botaoCancelar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        String[] respostas = {"Sim", "Não"};
        final ImageIcon icon = new ImageIcon("src/main/resources/question.png");
        int confirmDialog = JOptionPane.showOptionDialog(null, "Tem a certeza que pretende cancelar a operação?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, respostas, respostas[0]);
        if (confirmDialog == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void usernamePendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamePendenteActionPerformed
        // ONLY INPUT
    }//GEN-LAST:event_usernamePendenteActionPerformed

    private void botaoContinuar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuar3ActionPerformed
        String[] respostas = {"Sim", "Não"};
        final ImageIcon icon = new ImageIcon("src/main/resources/question.png");
        int confirmDialog = JOptionPane.showOptionDialog(null, "Tem a certeza que pretende garantir o acesso\ndeste utilizador ao sistema?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, respostas, respostas[0]);
        if (confirmDialog == JOptionPane.YES_OPTION) {
            cuctrl.confirmaUtilizador();
            listaUtilizadoresModel.removeElementAt(boxUtilizadoresPendentes.getSelectedIndex());
            final ImageIcon icon1 = new ImageIcon("src/main/resources/check.png");
            JOptionPane.showMessageDialog(null, "Utilizador confirmado com sucesso.", "Informação", JOptionPane.ERROR_MESSAGE, icon1);
            this.dispose();
        }
    }//GEN-LAST:event_botaoContinuar3ActionPerformed

    private void boxUtilizadoresPendentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxUtilizadoresPendentesActionPerformed
        String[] dadosUtilizador = cuctrl.getUtilizador(boxUtilizadoresPendentes.getSelectedIndex());
        this.usernamePendente.setText(dadosUtilizador[0]);
        this.nomePendente.setText(dadosUtilizador[1]);
        this.emailPendente.setText(dadosUtilizador[2]);
    }//GEN-LAST:event_boxUtilizadoresPendentesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoContinuar3;
    private javax.swing.JComboBox<String> boxUtilizadoresPendentes;
    private javax.swing.JTextField emailPendente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nomePendente;
    private javax.swing.JTextField usernamePendente;
    // End of variables declaration//GEN-END:variables
}