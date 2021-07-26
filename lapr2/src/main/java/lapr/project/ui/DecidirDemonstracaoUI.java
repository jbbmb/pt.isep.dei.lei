package lapr.project.ui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lapr.project.model.CentroExposicoes;
import lapr.project.controller.DecidirDemonstracaoController;
import lapr.project.model.Demonstracao;
import lapr.project.model.Exposicao;
import lapr.project.model.ListaDemonstracoes;

/** @author Grupo 18_LAPR2 15-16 */

public class DecidirDemonstracaoUI extends javax.swing.JFrame {

    private CentroExposicoes centroExposicoes;
    private DecidirDemonstracaoController controller;
    private String username;
    private DefaultComboBoxModel listaExposicoesModel = new DefaultComboBoxModel();
    private DefaultComboBoxModel listaDemonstracoesModel = new DefaultComboBoxModel();
    private String decisao;
    
    /**
     * Creates new form DecidirCandidaturaUI
     */
    public DecidirDemonstracaoUI(CentroExposicoes centro, String u) {
        this.centroExposicoes = centro;
        this.username = u;
        controller = new DecidirDemonstracaoController(centroExposicoes);
        List<Exposicao> listaExposicoes = controller.getListaExposicoes(username);
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

        botoes = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        botaoContinuar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        opcaoDemonstracaoDefinitiva = new javax.swing.JRadioButton();
        opcaoDemonstracaoRecusada = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoDescricaoDemonstracao = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        boxExposicoes = new javax.swing.JComboBox<>();
        anoFimCandNovaDem1 = new javax.swing.JTextField();
        diaFimCandNovaDem1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        mesInicioCandNovaDem1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        anoInicioCandNovaDem1 = new javax.swing.JTextField();
        diaInicioCandNovaDem1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        mesFimCandNovaDem1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Decidir demonstração");
        setResizable(false);

        jLabel1.setText("Detalhes da demonstração:");

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoContinuar.setText("Continuar");
        botaoContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContinuarActionPerformed(evt);
            }
        });

        jLabel2.setText("Decisão:");

        botoes.add(opcaoDemonstracaoDefinitiva);
        opcaoDemonstracaoDefinitiva.setText("Demonstração definitiva");
        opcaoDemonstracaoDefinitiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoDemonstracaoDefinitivaActionPerformed(evt);
            }
        });

        botoes.add(opcaoDemonstracaoRecusada);
        opcaoDemonstracaoRecusada.setText("Demostração recusada");
        opcaoDemonstracaoRecusada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoDemonstracaoRecusadaActionPerformed(evt);
            }
        });

        campoDescricaoDemonstracao.setEditable(false);
        campoDescricaoDemonstracao.setColumns(20);
        campoDescricaoDemonstracao.setRows(5);
        jScrollPane2.setViewportView(campoDescricaoDemonstracao);

        jLabel3.setText("Por favor escolha uma exposição:");

        boxExposicoes.setModel(listaExposicoesModel);
        boxExposicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxExposicoesActionPerformed(evt);
            }
        });

        jLabel16.setText("/");

        jLabel17.setText("-");

        jLabel18.setText("Período de submissão de candidaturas:");

        jLabel19.setText("/");

        jLabel20.setText("/");

        jLabel21.setText("/");

        jLabel4.setText("Por favor escolha uma demonstração:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>());
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setText("para selecionar pelo facto de não ser organizador.");

        jLabel6.setText("AVISO: Não pode criar novas demonstrações caso não tenha exposições");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(opcaoDemonstracaoDefinitiva, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opcaoDemonstracaoRecusada, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jLabel2)))
                    .addComponent(jLabel18)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(diaInicioCandNovaDem1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mesInicioCandNovaDem1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anoInicioCandNovaDem1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diaFimCandNovaDem1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mesFimCandNovaDem1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anoFimCandNovaDem1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botaoCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botaoContinuar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boxExposicoes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(boxExposicoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opcaoDemonstracaoDefinitiva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opcaoDemonstracaoRecusada))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaInicioCandNovaDem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(mesInicioCandNovaDem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(anoInicioCandNovaDem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaFimCandNovaDem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(mesFimCandNovaDem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(anoFimCandNovaDem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoContinuar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarActionPerformed
        String[] respostas = {"Sim", "Não"};
        controller.setDecisao(decisao);
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date dataInicioCand = null;
        Date dataFimCand = null;
        boolean confirma = true;
        try{
           dataInicioCand = df.parse(diaInicioCandNovaDem1.getText() + "-" +
                   mesInicioCandNovaDem1.getText() + "-" + 
                   anoInicioCandNovaDem1.getText());
        } catch(ParseException ex){
            final ImageIcon icon3 = new ImageIcon("src/main/resources/error.png");
            JOptionPane.showMessageDialog(null, "Data de início do período de submissão de candidaturas à demonstração errada.", "Erro", JOptionPane.ERROR_MESSAGE, icon3);
            confirma = false;
        }
        try{
            dataFimCand = df.parse(diaFimCandNovaDem1.getText() + "-" +
                    mesFimCandNovaDem1.getText() + "-" + anoFimCandNovaDem1.getText());
        } catch(ParseException ex){
            final ImageIcon icon4 = new ImageIcon("src/main/resources/error.png");
            JOptionPane.showMessageDialog(null, "Data de fim do período de submissão de candidaturas à demonstração errada.", "Erro", JOptionPane.ERROR_MESSAGE, icon4);
            confirma = false;
        }
        controller.setPeriodoCandidaturas(dataInicioCand, dataFimCand);
        if(confirma){
            int confirmaDialog = JOptionPane.showConfirmDialog(null, "Tem a certeza "
                        + "que pretende registar a decisão?", "Confirmação",
                        JOptionPane.YES_NO_OPTION);
            if(confirmaDialog == JOptionPane.YES_OPTION){
                controller.registaDemonstracaoAceite();
            }
            this.dispose();
        } 
        
        
    }//GEN-LAST:event_botaoContinuarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        String[] respostas = {"Sim", "Não"};
        final ImageIcon icon = new ImageIcon("src/main/resources/question.png");
        int confirmDialog = JOptionPane.showOptionDialog(null, "Tem a certeza que pretende cancelar a operação?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, respostas, respostas[0]);
            if (confirmDialog == 0) {
		this.dispose();
            }
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void opcaoDemonstracaoDefinitivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoDemonstracaoDefinitivaActionPerformed
        decisao = "Definitiva";
    }//GEN-LAST:event_opcaoDemonstracaoDefinitivaActionPerformed

    private void opcaoDemonstracaoRecusadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoDemonstracaoRecusadaActionPerformed
        decisao = "Recusada";
    }//GEN-LAST:event_opcaoDemonstracaoRecusadaActionPerformed

    private void boxExposicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxExposicoesActionPerformed
        controller.selectExposicao(boxExposicoes.getSelectedIndex());
        List<Demonstracao> listaDemonstracoes = controller.getDemonstracoes().getListaDemonstracoes();
        for (int i = 0; i < listaDemonstracoes.size(); i++) {
            listaDemonstracoesModel.addElement(listaDemonstracoes.get(i).getCodigoUnico());
        }
        jComboBox1.setModel(listaDemonstracoesModel);
        
    }//GEN-LAST:event_boxExposicoesActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        controller.selectDemonstracao(jComboBox1.getSelectedIndex());
        campoDescricaoDemonstracao.setText(controller.getDadosDemonstracao());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoFimCandNovaDem1;
    private javax.swing.JTextField anoInicioCandNovaDem1;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoContinuar;
    private javax.swing.ButtonGroup botoes;
    private javax.swing.JComboBox<String> boxExposicoes;
    private javax.swing.JTextArea campoDescricaoDemonstracao;
    private javax.swing.JTextField diaFimCandNovaDem1;
    private javax.swing.JTextField diaInicioCandNovaDem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mesFimCandNovaDem1;
    private javax.swing.JTextField mesInicioCandNovaDem1;
    private javax.swing.JRadioButton opcaoDemonstracaoDefinitiva;
    private javax.swing.JRadioButton opcaoDemonstracaoRecusada;
    // End of variables declaration//GEN-END:variables
}