package lapr.project.ui;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lapr.project.controller.AvaliarCandidaturaController;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.ExposicaoEstadoCandidaturasExposicaoFechadas;

/**
 * @author Grupo 18_LAPR2 15-16
 */
public class AvaliarCandidaturaUI extends javax.swing.JFrame {

    private CentroExposicoes centroExposicoes;
    private String idFAE;
    private AvaliarCandidaturaController acctrl;
    private DefaultComboBoxModel listaExposicoesModel = new DefaultComboBoxModel();
    private DefaultComboBoxModel listaDemonstracoesModel = new DefaultComboBoxModel();
    private DefaultComboBoxModel listaCandidaturasModel = new DefaultComboBoxModel();

    /**
     * Creates new form AvaliarCandidaturaUI
     */
    public AvaliarCandidaturaUI(CentroExposicoes centroExposicoes, String id) {
        this.centroExposicoes = centroExposicoes;
        this.idFAE = id;
        this.acctrl = new AvaliarCandidaturaController(centroExposicoes);
        List<Exposicao> listaExposicoes = acctrl.getListaExposicoesFAE(idFAE);
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

        candidaturasLabel = new javax.swing.JLabel();
        botaoContinuar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        candidaturaComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        conhecimentoFAELabel = new javax.swing.JLabel();
        adequacaoExposicaoLabel = new javax.swing.JLabel();
        adequacaoDemonstracoesLabel = new javax.swing.JLabel();
        adequacaoConvitesLabel = new javax.swing.JLabel();
        recomendacaoLabel = new javax.swing.JLabel();
        adequacaoExposicaoField = new javax.swing.JTextField();
        adequacaoDemonstracoesField = new javax.swing.JTextField();
        adequacaoConvitesField = new javax.swing.JTextField();
        recomendacaoField = new javax.swing.JTextField();
        conhecimentoFAEField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        exposicoesLabel = new javax.swing.JLabel();
        exposicoesComboBox = new javax.swing.JComboBox<>();
        demonstracoesLabel = new javax.swing.JLabel();
        demonstracoesComboBox = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Avaliar Candidatura");
        setResizable(false);

        candidaturasLabel.setText("Selecione uma candidatura: ");

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

        candidaturaComboBox.setModel(listaCandidaturasModel);
        candidaturaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candidaturaComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Por favor, atribue uma classificação de 0 a 5:");

        conhecimentoFAELabel.setText("Conhecimento do FAE sobre o tema da exposição:");

        adequacaoExposicaoLabel.setText("Adequação da candidatura à exposição:");

        adequacaoDemonstracoesLabel.setText("Adequação da candidatura às demonstrações:");

        adequacaoConvitesLabel.setText("Adequação do número de convites por candidatura:");

        recomendacaoLabel.setText("Recomendação global:");

        adequacaoExposicaoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        adequacaoDemonstracoesField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        adequacaoConvitesField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        recomendacaoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        recomendacaoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recomendacaoFieldActionPerformed(evt);
            }
        });

        conhecimentoFAEField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setText("Por favor, escolha uma opção em todos os campos abaixo:");

        exposicoesLabel.setText("Selecione uma exposição:");

        exposicoesComboBox.setModel(listaExposicoesModel);
        exposicoesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exposicoesComboBoxActionPerformed(evt);
            }
        });

        demonstracoesLabel.setText("Selecione uma demonstração:");
        demonstracoesLabel.setEnabled(false);

        demonstracoesComboBox.setModel(listaDemonstracoesModel);
        demonstracoesComboBox.setEnabled(false);
        demonstracoesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demonstracoesComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conhecimentoFAELabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(adequacaoExposicaoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(adequacaoDemonstracoesLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(adequacaoConvitesLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(recomendacaoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adequacaoExposicaoField)
                                    .addComponent(adequacaoDemonstracoesField)
                                    .addComponent(adequacaoConvitesField)
                                    .addComponent(recomendacaoField)
                                    .addComponent(conhecimentoFAEField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(candidaturasLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(337, 337, 337)
                                .addComponent(botaoCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoContinuar)))
                        .addContainerGap(10, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(candidaturaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(demonstracoesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel8))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(exposicoesLabel)
                                .addComponent(demonstracoesLabel)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(exposicoesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(34, 34, 34)
                .addComponent(exposicoesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exposicoesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(demonstracoesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(demonstracoesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(candidaturasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(candidaturaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conhecimentoFAELabel)
                    .addComponent(conhecimentoFAEField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adequacaoExposicaoLabel)
                    .addComponent(adequacaoExposicaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adequacaoDemonstracoesLabel)
                    .addComponent(adequacaoDemonstracoesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adequacaoConvitesLabel)
                    .addComponent(adequacaoConvitesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recomendacaoLabel)
                    .addComponent(recomendacaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoContinuar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recomendacaoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recomendacaoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recomendacaoFieldActionPerformed

    private void candidaturaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candidaturaComboBoxActionPerformed
        acctrl.selectCandidatura(candidaturaComboBox.getSelectedIndex());
        acctrl.novaAvaliacao();
    }//GEN-LAST:event_candidaturaComboBoxActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        String[] respostas = {"Sim", "Não"};
        final ImageIcon icon = new ImageIcon("src/main/resources/question.png");
        int confirmDialog = JOptionPane.showOptionDialog(null, "Tem a certeza que pretende cancelar a operação?",
                "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, respostas, respostas[0]);
        if (confirmDialog == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarActionPerformed

        String[] respostas = {"Sim", "Não"};
        boolean validacao = acctrl.setRespostas(conhecimentoFAEField.getText(),
                adequacaoExposicaoField.getText(), adequacaoDemonstracoesField.getText(),
                adequacaoConvitesField.getText(), recomendacaoField.getText());
        if (validacao) {
            final ImageIcon icon3 = new ImageIcon("src/main/resources/question.png");
            int confirmDialog = JOptionPane.showOptionDialog(null, "Tem a certeza que pretende guardar a avaliação?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon3, respostas, respostas[0]);
            if (confirmDialog == 0) {
                acctrl.registaAvaliacao();
                this.dispose();
            }
        } else {
            final ImageIcon icon = new ImageIcon("src/main/resources/error.png");
            JOptionPane.showMessageDialog(null, "Os dados que introduziu não estão corretos.", "Erro", JOptionPane.ERROR_MESSAGE, icon);
        }
    }//GEN-LAST:event_botaoContinuarActionPerformed

    private void exposicoesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exposicoesComboBoxActionPerformed
        ExposicaoEstado estado = acctrl.selectExposicao(exposicoesComboBox.getSelectedIndex());
        if (estado instanceof ExposicaoEstadoCandidaturasExposicaoFechadas) {
            demonstracoesLabel.setEnabled(true);
            demonstracoesComboBox.setEnabled(true);
            adequacaoConvitesLabel.setEnabled(false);
            adequacaoConvitesField.setEnabled(false);
            List<Demonstracao> listaDemonstracoes = acctrl.getListaDemonstracoes();
            for (int i = 0; i < listaDemonstracoes.size(); i++) {
                listaDemonstracoesModel.addElement(listaDemonstracoes.get(i).getDescricao());
            }
        } else {
            List<Candidatura> listaCandidaturas = acctrl.getListaCandidaturasExposicao();
            for (int i = 0; i < listaCandidaturas.size(); i++) {
                listaCandidaturasModel.addElement(listaCandidaturas.get(i).getNomeEmpresa());
            }
        }

    }//GEN-LAST:event_exposicoesComboBoxActionPerformed

    private void demonstracoesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demonstracoesComboBoxActionPerformed
        acctrl.selectDemonstracao(demonstracoesComboBox.getSelectedIndex());
        List<Candidatura> listaCandidaturas = acctrl.getListaCandidaturasDemonstracao();
        for (int i = 0; i < listaCandidaturas.size(); i++) {
            listaCandidaturasModel.addElement(listaCandidaturas.get(i).getDescricao());
        }

    }//GEN-LAST:event_demonstracoesComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adequacaoConvitesField;
    private javax.swing.JLabel adequacaoConvitesLabel;
    private javax.swing.JTextField adequacaoDemonstracoesField;
    private javax.swing.JLabel adequacaoDemonstracoesLabel;
    private javax.swing.JTextField adequacaoExposicaoField;
    private javax.swing.JLabel adequacaoExposicaoLabel;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoContinuar;
    private javax.swing.JComboBox<String> candidaturaComboBox;
    private javax.swing.JLabel candidaturasLabel;
    private javax.swing.JTextField conhecimentoFAEField;
    private javax.swing.JLabel conhecimentoFAELabel;
    private javax.swing.JComboBox<String> demonstracoesComboBox;
    private javax.swing.JLabel demonstracoesLabel;
    private javax.swing.JComboBox<String> exposicoesComboBox;
    private javax.swing.JLabel exposicoesLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField recomendacaoField;
    private javax.swing.JLabel recomendacaoLabel;
    // End of variables declaration//GEN-END:variables
}
