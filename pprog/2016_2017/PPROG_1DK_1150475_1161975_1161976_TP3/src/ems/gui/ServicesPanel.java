package ems.gui;
// STATUS: DONE
// ISSUES: NONE

import ems.controller.ServicesController;
import ems.model.user.ESE;
import ems.model.user.EventManager;
import ems.model.user.Organizer;
import ems.model.user.Representative;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 * Panel with service options.
 * @author 1DK_1150475_1161975_1161976
 */
public class ServicesPanel extends javax.swing.JPanel {
    
    // Class variables
    private final EMS ems;
    private final ServicesController servicesController;
    private static final ImageIcon SETUP_ICON = new ImageIcon("src/ems/assets/setup.png");
    private static final ImageIcon QUESTION_ICON = new ImageIcon("src/ems/assets/question.png");
    private static final ImageIcon CHECK_ICON = new ImageIcon("src/ems/assets/check.png");
    private static final ImageIcon ERROR_ICON = new ImageIcon("src/ems/assets/error.png");
    private static final ImageIcon BINARY_ICON = new ImageIcon("src/ems/assets/binary.png");
    
    /**
     * Creates a new servicesPanel.
     * @param ems
     */
    public ServicesPanel(EMS ems) {
        this.ems = ems;
        this.servicesController = new ServicesController(ems.getActiveFairCenter());
        initComponents();
        checkPermissions();
    }

    public EMS getActiveEMS() {
        return ems;
    }
    
    private void checkPermissions(){
        if(getActiveEMS().getActiveFairCenter().getActiveUser() instanceof Representative){
            importButton.setEnabled(false);
            exportButton.setEnabled(false);
        } else if(getActiveEMS().getActiveFairCenter().getActiveUser() instanceof ESE){
            importButton.setEnabled(false);
            exportButton.setEnabled(false);
        } else if(getActiveEMS().getActiveFairCenter().getActiveUser() instanceof Organizer){
            importButton.setEnabled(false);
            exportButton.setEnabled(false);
        } else if(getActiveEMS().getActiveFairCenter().getActiveUser() instanceof EventManager){
            importButton.setEnabled(true);
            exportButton.setEnabled(true);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statsButton = new javax.swing.JButton();
        importButton = new javax.swing.JButton();
        usersButton = new javax.swing.JButton();
        resourcesButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();
        productInfoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        logsButton = new javax.swing.JButton();
        moreLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        statsButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        statsButton.setForeground(new java.awt.Color(102, 102, 102));
        statsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/assets/stats.png"))); // NOI18N
        statsButton.setText("STATISTICS");
        statsButton.setToolTipText("Generate and view useful statistics");
        statsButton.setBorderPainted(false);
        statsButton.setContentAreaFilled(false);
        statsButton.setEnabled(false);
        statsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        statsButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        importButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        importButton.setForeground(new java.awt.Color(33, 113, 216));
        importButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/assets/import-online.png"))); // NOI18N
        importButton.setText("IMPORT DATABASE");
        importButton.setToolTipText("Reset current database and import a new one");
        importButton.setBorderPainted(false);
        importButton.setContentAreaFilled(false);
        importButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        importButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        importButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importButtonActionPerformed(evt);
            }
        });

        usersButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        usersButton.setForeground(new java.awt.Color(102, 102, 102));
        usersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/assets/users.png"))); // NOI18N
        usersButton.setText("MANAGE USERS");
        usersButton.setToolTipText("Manage system users and their permissions");
        usersButton.setBorderPainted(false);
        usersButton.setContentAreaFilled(false);
        usersButton.setEnabled(false);
        usersButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        usersButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        resourcesButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        resourcesButton.setForeground(new java.awt.Color(102, 102, 102));
        resourcesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/assets/resources.png"))); // NOI18N
        resourcesButton.setText("RESOURCES\n");
        resourcesButton.setToolTipText("Manage the center's resources for events and workshop demos");
        resourcesButton.setBorderPainted(false);
        resourcesButton.setContentAreaFilled(false);
        resourcesButton.setEnabled(false);
        resourcesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resourcesButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        exportButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        exportButton.setForeground(new java.awt.Color(33, 113, 216));
        exportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/assets/export-online.png"))); // NOI18N
        exportButton.setText("EXPORT DATABASE");
        exportButton.setToolTipText("Export current database to a binary file");
        exportButton.setBorderPainted(false);
        exportButton.setContentAreaFilled(false);
        exportButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exportButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });

        productInfoPanel.setBackground(new java.awt.Color(255, 255, 255));
        productInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        productInfoPanel.setForeground(new java.awt.Color(102, 102, 102));
        productInfoPanel.setToolTipText("About your EMS product");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Event Management System");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("version 0.2 [Alpha]");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("2017 © All rights reserved. Images by Icons8.");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Final Project - PPROG+ESOFT 2016/2017");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("LEI @ Instituto Superior de Engenharia do Porto");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Authors:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("João Borges, 1150475@isep.ipp.pt");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Joanna Macioch, 1161975@isep.ipp.pt");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Justyna Januszkiewicz, 1161976@isep.ipp.pt");

        javax.swing.GroupLayout productInfoPanelLayout = new javax.swing.GroupLayout(productInfoPanel);
        productInfoPanel.setLayout(productInfoPanelLayout);
        productInfoPanelLayout.setHorizontalGroup(
            productInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productInfoPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(productInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(productInfoPanelLayout.createSequentialGroup()
                        .addGroup(productInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(productInfoPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel6))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(productInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        productInfoPanelLayout.setVerticalGroup(
            productInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productInfoPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(productInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(productInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(productInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(20, 20, 20))
        );

        logsButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        logsButton.setForeground(new java.awt.Color(102, 102, 102));
        logsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/assets/logs.png"))); // NOI18N
        logsButton.setText("AUDIT LOGS");
        logsButton.setToolTipText("Access the internal logs for audit and management purposes");
        logsButton.setBorderPainted(false);
        logsButton.setContentAreaFilled(false);
        logsButton.setEnabled(false);
        logsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logsButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        moreLabel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        moreLabel.setForeground(new java.awt.Color(102, 102, 102));
        moreLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/assets/manual.png"))); // NOI18N
        moreLabel.setText(" Visit the software manual");
        moreLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moreLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moreLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resourcesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(importButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(exportButton)
                        .addGap(18, 18, 18)
                        .addComponent(logsButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(moreLabel)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(statsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(resourcesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(usersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(importButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(exportButton)
                    .addComponent(logsButton))
                .addGap(36, 36, 36)
                .addComponent(productInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(moreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void importButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importButtonActionPerformed
        String[] confirmAnswers = {"No", "Yes"};
        int confirmDialog = JOptionPane.showOptionDialog(null, "Do you wish to import and replace the current database?\nAll unsynced/unexported data will be lost.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, QUESTION_ICON, confirmAnswers, confirmAnswers[0]);
            if(confirmDialog == 1) {
                String[] importAnswers = {"Text-based file (.txt)", "Binary file (.bin)"};
                int importDialog = JOptionPane.showOptionDialog(null, "What type of file do you want to import?", "Setup Assistant", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, SETUP_ICON, importAnswers, importAnswers[0]);
                if(importDialog == 1){
                    JFileChooser fileChooser = new JFileChooser();
                    int result = fileChooser.showDialog(null, "Import");
                    switch (result) {
                        case JFileChooser.APPROVE_OPTION:
                            File selectedBinFile = fileChooser.getSelectedFile();
                    {
                        try {
                            ems.dispose();
                            servicesController.importAction(selectedBinFile);
                        } catch (IOException ex) {
                            Logger.getLogger(ServicesPanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                            JOptionPane.showMessageDialog(null, "Binary import successful!\nPlease restart the app to use new data.", "Setup Assistant", JOptionPane.ERROR_MESSAGE, SETUP_ICON);
                            System.exit(0);
                            break;
                        case JFileChooser.ERROR_OPTION:
                            JOptionPane.showMessageDialog(null, "Unable to import the selected .bin file.\nCheck file content and try again.", "Error", JOptionPane.ERROR_MESSAGE, ERROR_ICON);
                            break;
                    }
                } else if(importDialog == 0){
                    ems.dispose();
                    servicesController.resetDatabase();
                    JOptionPane.showMessageDialog(null, "Data erased successfully.\nPlease restart the app to import text-based file.", "Setup Assistant", JOptionPane.ERROR_MESSAGE, SETUP_ICON);
                    System.exit(0);
                }
        }
    }//GEN-LAST:event_importButtonActionPerformed

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Exported data will NOT be encrypted.\nStore binary file safely!", "Warning", JOptionPane.ERROR_MESSAGE, BINARY_ICON);
        JFileChooser dirChooser = new JFileChooser();
        int result = dirChooser.showSaveDialog(ems);
        switch (result) {
                    case JFileChooser.APPROVE_OPTION:
                        String selectedDir = dirChooser.getSelectedFile().toString() + ".bin";
                        File exportFile = new File(selectedDir); {
                            try {
                                servicesController.exportAction(exportFile);
                            } catch (IOException ex) {
                                Logger.getLogger(ServicesPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Export completed successfully.", "Notification", JOptionPane.ERROR_MESSAGE, CHECK_ICON);
                        break;
                    case JFileChooser.CANCEL_OPTION:
                        JOptionPane.showMessageDialog(null, "Export canceled per your request.", "Canceled", JOptionPane.ERROR_MESSAGE, ERROR_ICON);
                        break;
                    case JFileChooser.ERROR_OPTION:
                        JOptionPane.showMessageDialog(null, "Unable to export the selected file.\nCheck selected directory and try again.", "Error", JOptionPane.ERROR_MESSAGE, ERROR_ICON);
                        break;
        }
    }//GEN-LAST:event_exportButtonActionPerformed

    private void moreLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moreLabelMouseClicked
        String softwareManualURI = "http://tinyurl.com/k49cpbe";
        Desktop d = Desktop.getDesktop();
        try {
            try {
                d.browse(new URI(softwareManualURI));
            } catch (URISyntaxException ex) {
                JOptionPane.showMessageDialog(null, "Can't follow hyperlink.", "Error (URISyntaxException)", JOptionPane.ERROR_MESSAGE, ERROR_ICON);
                Logger.getLogger(ServicesPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Can't follow hyperlink.", "Error (IOException)", JOptionPane.ERROR_MESSAGE, ERROR_ICON);
            Logger.getLogger(ServicesPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_moreLabelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exportButton;
    private javax.swing.JButton importButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logsButton;
    private javax.swing.JLabel moreLabel;
    private javax.swing.JPanel productInfoPanel;
    private javax.swing.JButton resourcesButton;
    private javax.swing.JButton statsButton;
    private javax.swing.JButton usersButton;
    // End of variables declaration//GEN-END:variables
}