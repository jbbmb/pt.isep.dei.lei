package ems.gui;
// STATUS: DONE
// ISSUES: NONE

/**
 * Panel with conflict options.
 * @author 1DK_1150475_1161975_1161976
 */
public class ConflictsPanel extends javax.swing.JPanel {

    // Class variables
    private final EMS ems;
    
    /**
     * Creates a new conflictsPanel.
     * @param ems
     */
    public ConflictsPanel(EMS ems) {
        this.ems = ems;
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

        setTypeConflictButton = new javax.swing.JButton();
        updateConlictsButton = new javax.swing.JButton();
        conflictsPanel = new javax.swing.JPanel();
        cloudSyncElement = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        setTypeConflictButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        setTypeConflictButton.setForeground(new java.awt.Color(102, 102, 102));
        setTypeConflictButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/assets/edit-property.png"))); // NOI18N
        setTypeConflictButton.setText("DEFINE TYPES");
        setTypeConflictButton.setToolTipText("Manage the types of conflict that the EMS should look for");
        setTypeConflictButton.setBorderPainted(false);
        setTypeConflictButton.setContentAreaFilled(false);
        setTypeConflictButton.setEnabled(false);
        setTypeConflictButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setTypeConflictButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        updateConlictsButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        updateConlictsButton.setForeground(new java.awt.Color(102, 102, 102));
        updateConlictsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/assets/update.png"))); // NOI18N
        updateConlictsButton.setText("UPDATE LIST");
        updateConlictsButton.setToolTipText("Update conflicts and resolve issues for real-time detection");
        updateConlictsButton.setBorderPainted(false);
        updateConlictsButton.setContentAreaFilled(false);
        updateConlictsButton.setEnabled(false);
        updateConlictsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateConlictsButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        conflictsPanel.setBackground(new java.awt.Color(255, 255, 255));
        conflictsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pending actions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        conflictsPanel.setToolTipText("Problems detected by the real-time engine");

        cloudSyncElement.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cloudSyncElement.setForeground(new java.awt.Color(102, 102, 102));
        cloudSyncElement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/assets/okay.png"))); // NOI18N
        cloudSyncElement.setText(" No problems detected.");
        cloudSyncElement.setEnabled(false);

        javax.swing.GroupLayout conflictsPanelLayout = new javax.swing.GroupLayout(conflictsPanel);
        conflictsPanel.setLayout(conflictsPanelLayout);
        conflictsPanelLayout.setHorizontalGroup(
            conflictsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conflictsPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(cloudSyncElement)
                .addContainerGap(380, Short.MAX_VALUE))
        );
        conflictsPanelLayout.setVerticalGroup(
            conflictsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conflictsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(cloudSyncElement)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conflictsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateConlictsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(setTypeConflictButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setTypeConflictButton)
                    .addComponent(updateConlictsButton))
                .addGap(28, 28, 28)
                .addComponent(conflictsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cloudSyncElement;
    private javax.swing.JPanel conflictsPanel;
    private javax.swing.JButton setTypeConflictButton;
    private javax.swing.JButton updateConlictsButton;
    // End of variables declaration//GEN-END:variables
}