package wheelsgrandprize.Frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import wheelsgrandprize.Backend.LocalData;

/**
 * Main GUI class.
 * @author João Borges <1150475@isep.ipp.pt>
 */
public class Console extends javax.swing.JFrame {
    
    private final Controller ctrl;
    private static final String MAIN_MENU = "Welcome!\nPlease, select an option:\n\n[1] Import participants\n[2] List all participants\n[3] Change participant information\n[4] Import race data\n[5] Import time results\n[6] Calculate race assigned prizes\n[7] Backup current state\n[8] Remove participant\n[9] Insert new participant\n[10] Review participant statistics\n[11] Review race statistics\n[12] Calculate total value of assigned prizes\n[13] Export GrandPrize.txt sum file\n\n[Q] Exit discarding changes";
    
    /**
     * Starts a new console session.
     */
    public Console(LocalData localMemory) {
        this.ctrl = new Controller(this, localMemory);
        setLookAndFeel();
        initComponents();
        resetView();
    }
    
    /**
     * Set overall look and feel.
     */
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
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

        topLabel = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        inputTextField = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Console");
        setResizable(false);

        topLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        topLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wheelsgrandprize/Frontend/logoAsset.png"))); // NOI18N
        topLabel.setText("Wheels Grand Prize");
        topLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        topLabel.setFocusable(false);
        topLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        topLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        versionLabel.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        versionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        versionLabel.setText("v0.1a_1150475_aprog017_isep");
        versionLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        versionLabel.setEnabled(false);

        outputTextArea.setEditable(false);
        outputTextArea.setColumns(20);
        outputTextArea.setRows(5);
        outputTextArea.setText("Loading...");
        outputTextArea.setToolTipText("Output");
        outputTextArea.setFocusable(false);
        jScrollPane1.setViewportView(outputTextArea);

        inputTextField.setToolTipText("Input");

        enterButton.setText("ENTER");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        menuButton.setText("Menu");
        menuButton.setToolTipText("Cancel and go back");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuButton)))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(versionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(versionLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterButton)
                    .addComponent(menuButton))
                .addGap(26, 26, 26))
        );

        getAccessibleContext().setAccessibleDescription("Console");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Resets console to main menu.
     */
    public void resetView(){
        cleanInput();
        inputTextField.requestFocus();
        setOutput(MAIN_MENU);
        menuButton.setEnabled(false);
        getRootPane().setDefaultButton(enterButton);
    }
    
    /**
     * Resets console to main menu.
     * @param message String to display
     */
    public void resetView(String message){
        cleanInput();
        inputTextField.requestFocus();
        setOutput(MAIN_MENU);
        menuButton.setEnabled(false);
        getRootPane().setDefaultButton(enterButton);
    }
    
    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        try {
            ctrl.tower();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enterButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        resetView();
    }//GEN-LAST:event_menuButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enterButton;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menuButton;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JLabel topLabel;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Prints a new output on the console.
     * @param output print result
     */
    public void setOutput(String output){
        outputTextArea.setText(output);
    }
    
    /**
     * Gets the current content of the output field.
     * @return string with output
     */
    public String getOutput(){
        return outputTextArea.getText();
    }
    
    /**
     * Cleans input field.
     */
    public void cleanInput() {
        inputTextField.setText("");
    }
    
    /**
     * Gets the current state of the input field.
     * @return string with input
     */
    public String getInput() {
        return inputTextField.getText();
    }

    /**
     * Returns menu button and status.
     * @return JButton, is enabled() for menu output status
     */
    public JButton getMenuButton() {
        return menuButton;
    }
    
    /**
     * Returns enter button and status.
     * @return JButton
     */
    public JButton getEnterButton() {
        return enterButton;
    }
    
}