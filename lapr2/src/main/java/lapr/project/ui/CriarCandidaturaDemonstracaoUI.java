package lapr.project.ui;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lapr.project.controller.CriarCandidaturaDemonstracaoController;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaDemonstracoes;

/** @author Grupo 18_LAPR2 15-16 */

public class CriarCandidaturaDemonstracaoUI extends javax.swing.JFrame {

    private CriarCandidaturaDemonstracaoController controller;
    private CentroExposicoes centro;
    private DefaultComboBoxModel listaExposicoesModel = new DefaultComboBoxModel();
    private DefaultComboBoxModel listaDemonstracoesExposicaoModel = new DefaultComboBoxModel();
    private String username;

    /**
     * Creates new form CriarCandidaturaDemonstracaoUI
     */
    public CriarCandidaturaDemonstracaoUI(CentroExposicoes centro, String username) {
        this.controller = new CriarCandidaturaDemonstracaoController(centro, username);
        this.centro = centro;
        this.username = username;
        List<Exposicao> listaExposicoes = controller.getListaExposicoes();
        for (int i = 0; i < listaExposicoes.size(); i++) {
            listaExposicoesModel.addElement(listaExposicoes.get(i).getTitulo());
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

        jLabel1 = new javax.swing.JLabel();
        boxExposicoes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        boxDemonstracoes = new javax.swing.JComboBox<>();
        botaoContinuar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar candidatura à demonstração");
        setResizable(false);

        jLabel1.setText("Por favor, selecione uma exposição:");

        boxExposicoes.setModel(listaExposicoesModel);
        boxExposicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxExposicoesActionPerformed(evt);
            }
        });

        jLabel2.setText("Por favor, selecione a demonstração à qual se pretende candidatar:");

        boxDemonstracoes.setModel(listaDemonstracoesExposicaoModel);
        boxDemonstracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDemonstracoesActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(boxExposicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(boxDemonstracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoContinuar)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxExposicoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxDemonstracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 66, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoContinuar)
                            .addComponent(botaoCancelar))
                        .addGap(10, 10, 10))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarActionPerformed
        if (boxDemonstracoes.getSelectedIndex() >= 0) {
            new CriarCandidaturaDemonstracaoFormularioUI(centro, controller,
                    controller.getListaDemonstracao(controller.
                            getListaExposicoes().get(boxExposicoes.
                                    getSelectedIndex())).getListaDemonstracoes()
                    .get(boxDemonstracoes.getSelectedIndex())).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_botaoContinuarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        String[] respostas = {"Sim", "Não"};
        final ImageIcon icon = new ImageIcon("src/main/resources/question.png");
        int confirmDialog = JOptionPane.showOptionDialog(null, "Tem a certeza "
                + "que pretende cancelar a operação?", "Atenção",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon,
                respostas, respostas[0]);
        if (confirmDialog == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void boxDemonstracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDemonstracoesActionPerformed
        // INPUT ONLY
    }//GEN-LAST:event_boxDemonstracoesActionPerformed

    private void boxExposicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxExposicoesActionPerformed
        String item = (String) boxExposicoes.getSelectedItem();
        ListaDemonstracoes listaDemonstracoes
                = controller.getListaDemonstracao(controller.getListaExposicoes().
                        get(boxExposicoes.getSelectedIndex()));
        //ListaCandidaturas listaDemonstracoesInteressadas
         //       = controller.getListaCandidaturaDemonstracao();
        for (int i = 0; i < listaDemonstracoes.getListaDemonstracoes().size(); i++) {
            //if (controller.getListaCandidaturaDemonstracao().
            //        getCandidaturaRepresentante(username) != null) {
                listaDemonstracoesExposicaoModel.addElement(listaDemonstracoes.
                        getListaDemonstracoes().get(i).getCodigoUnico());
            //}

        }
        boxDemonstracoes.setModel(listaDemonstracoesExposicaoModel);
    }//GEN-LAST:event_boxExposicoesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoContinuar;
    private javax.swing.JComboBox<String> boxDemonstracoes;
    private javax.swing.JComboBox<String> boxExposicoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}