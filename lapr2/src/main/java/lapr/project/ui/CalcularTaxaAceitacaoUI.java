package lapr.project.ui;

import lapr.project.controller.CalcularTaxaAceitacaoController;
import lapr.project.model.CentroExposicoes;

/** @author Grupo 18_LAPR2 15-16 */

public class CalcularTaxaAceitacaoUI extends javax.swing.JFrame {

    private CentroExposicoes ce;
    private CalcularTaxaAceitacaoController controller;
    
    /**
     * Creates new form CalcularTaxaAceitacaoUI
     */
    public CalcularTaxaAceitacaoUI(CentroExposicoes ce) {
        this.ce = ce;
        controller = new CalcularTaxaAceitacaoController(ce);
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
        floatPercentagemAceitacao = new javax.swing.JLabel();
        barPercentagemAceitacao = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        intCandRemovidas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        intCandNaoAvaliadas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estatísticas de candidatura");
        setResizable(false);

        jLabel1.setText("Percentagem de aceitação:");
        jLabel1.setToolTipText("Calculado através do rácio entre candidaturas\naceites e o total de candidaturas decididas");

        floatPercentagemAceitacao.setText(String.valueOf(controller.calcularPercentagemDeAceitacao() + "%"));

        barPercentagemAceitacao.setValue(Integer.valueOf(String.valueOf(controller.calcularPercentagemDeAceitacao())));

        jLabel2.setText("Número de candidaturas removidas:");

        intCandRemovidas.setText(String.valueOf(controller.candidaturasRemovidas()));

        jLabel3.setText("Número de candidaturas não avaliadas:");

        intCandNaoAvaliadas.setText(String.valueOf(controller.candidaturasNaoAvaliadas()));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(intCandRemovidas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barPercentagemAceitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(floatPercentagemAceitacao))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(intCandNaoAvaliadas)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barPercentagemAceitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(floatPercentagemAceitacao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(intCandRemovidas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(intCandNaoAvaliadas))
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barPercentagemAceitacao;
    private javax.swing.JLabel floatPercentagemAceitacao;
    private javax.swing.JLabel intCandNaoAvaliadas;
    private javax.swing.JLabel intCandRemovidas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}