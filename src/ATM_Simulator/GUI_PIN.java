package ATM_Simulator;

import java.awt.HeadlessException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUI_PIN extends javax.swing.JFrame {
    
    final String FileRoute = "ClientsBinary.data";
    ArrayList<Clients> clients = FilesManager_bin.showListedFile(FileRoute);
    static double currentBalance;
    static int indexPIN;

    public GUI_PIN(int index) {
        indexPIN = index;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ChangeExitPasswordButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        newPasswordField2 = new javax.swing.JPasswordField();
        oldPasswordField = new javax.swing.JPasswordField();
        newPasswordField = new javax.swing.JPasswordField();
        ChangeBackPasswordButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setBackground(new java.awt.Color(235, 162, 40));
        BackButton.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(51, 51, 51));
        BackButton.setText("Regresar");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 183, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChangeExitPasswordButton.setBackground(new java.awt.Color(235, 162, 40));
        ChangeExitPasswordButton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        ChangeExitPasswordButton.setForeground(new java.awt.Color(51, 51, 51));
        ChangeExitPasswordButton.setText("Confirmar y salir");
        ChangeExitPasswordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChangeExitPasswordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeExitPasswordButtonMouseClicked(evt);
            }
        });
        ChangeExitPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeExitPasswordButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ChangeExitPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 240, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Slab", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Confirme su nuevo PIN:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Resumen de Transacción");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 600, 150));

        jLabel3.setFont(new java.awt.Font("Roboto Slab", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Ingrese su PIN actual:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Slab", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ingrese su nuevo PIN:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        newPasswordField2.setBackground(new java.awt.Color(51, 51, 51));
        newPasswordField2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        newPasswordField2.setForeground(new java.awt.Color(204, 255, 255));
        newPasswordField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordField2ActionPerformed(evt);
            }
        });
        jPanel1.add(newPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 90, -1));

        oldPasswordField.setBackground(new java.awt.Color(51, 51, 51));
        oldPasswordField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        oldPasswordField.setForeground(new java.awt.Color(204, 255, 255));
        oldPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        oldPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(oldPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 90, -1));

        newPasswordField.setBackground(new java.awt.Color(51, 51, 51));
        newPasswordField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        newPasswordField.setForeground(new java.awt.Color(204, 255, 255));
        newPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(newPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 90, -1));

        ChangeBackPasswordButton.setBackground(new java.awt.Color(235, 162, 40));
        ChangeBackPasswordButton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        ChangeBackPasswordButton.setForeground(new java.awt.Color(51, 51, 51));
        ChangeBackPasswordButton.setText("Confirmar y volver");
        ChangeBackPasswordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChangeBackPasswordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeBackPasswordButtonMouseClicked(evt);
            }
        });
        ChangeBackPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeBackPasswordButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ChangeBackPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 240, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChangeExitPasswordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeExitPasswordButtonMouseClicked

    }//GEN-LAST:event_ChangeExitPasswordButtonMouseClicked

    private void ChangeExitPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeExitPasswordButtonActionPerformed
        String validator = "";
        char[] password = oldPasswordField.getPassword();
        for(int i = 0; i < password.length; i++){
            validator += password[i];
        }
        boolean matchvalidator2 = validator.matches("(\\d{4})");
        Clients thisClient = new Clients();
        thisClient = clients.get(indexPIN);
        String ClientPassword = thisClient.getPassword();
        String realPassword = FilesManager_bin.decoderString(ClientPassword);
        try{
            if (matchvalidator2){
                if(!validator.equals(realPassword)){
                    this.setVisible(false);
                    GUI_Error pError = new GUI_Error("Incorrect old password.", 0);
                    pError.setVisible(true);
                } else {
                    String Pw1 = newPasswordField.getText();
                    String Pw2 = newPasswordField2.getText();
                    if (Pw1.equals(Pw2)){ 
                        try {
                            (clients.get(indexPIN)).setPassword(Pw2);
                            Object[] modifiedPIN = clients.toArray();
                            FilesManager_bin.addRegisters(modifiedPIN, FileRoute);
                            this.setVisible(false);
                            GUI_Final pFinal = new GUI_Final();
                            pFinal.setVisible(true);
                        } catch (HeadlessException ex) {
                            this.setVisible(false);
                            GUI_Error pError = new GUI_Error("Not possible to update.", 0);
                            pError.setVisible(true);
                        } catch (NoSuchAlgorithmException ex) {
                            Logger.getLogger(GUI_PIN.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        this.setVisible(false);
                        GUI_Error pError = new GUI_Error("The new password doesn't match.", 0);
                        pError.setVisible(true);
                    }
                }
            }else{
                this.setVisible(false);
                GUI_Error pError = new GUI_Error("Incorrect old password.", 0);
                pError.setVisible(true);
            }
        }catch(HeadlessException e2){
            this.setVisible(false);
            GUI_Error pError = new GUI_Error(0,e2);
            pError.setVisible(true);
        }
    }//GEN-LAST:event_ChangeExitPasswordButtonActionPerformed

    private void newPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordField2ActionPerformed
    }//GEN-LAST:event_newPasswordField2ActionPerformed

    private void oldPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldPasswordFieldActionPerformed

    private void newPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPasswordFieldActionPerformed

    private void ChangeBackPasswordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeBackPasswordButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangeBackPasswordButtonMouseClicked

    private void ChangeBackPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeBackPasswordButtonActionPerformed
        String validator = "";
        char[] password = oldPasswordField.getPassword();
        for(int i = 0; i < password.length; i++){
            validator += password[i];
        }
        boolean matchvalidator2 = validator.matches("(\\d{4})");
        Clients thisClient = new Clients();
        thisClient = clients.get(indexPIN);
        String ClientPassword = thisClient.getPassword();
        String realPassword = FilesManager_bin.decoderString(ClientPassword);
        try{
            if (matchvalidator2){
                if(!validator.equals(realPassword)){
                    this.setVisible(false);
                    GUI_Error pError = new GUI_Error("Incorrect old password.", 0);
                    pError.setVisible(true);
                } else {
                    String Pw1 = newPasswordField.getText();
                    String Pw2 = newPasswordField2.getText();
                    if (Pw1.equals(Pw2)){ 
                        try {
                            (clients.get(indexPIN)).setPassword(Pw2);
                            Object[] modifiedPIN = clients.toArray();
                            FilesManager_bin.addRegisters(modifiedPIN, FileRoute);
                            this.setVisible(false);
                            GUI_Principal pPrincipal = new GUI_Principal(indexPIN);
                            pPrincipal.setVisible(true);
                        } catch (HeadlessException ex) {
                            this.setVisible(false);
                            GUI_Error pError = new GUI_Error("Not possible to update.", 0);
                            pError.setVisible(true);
                        } catch (NoSuchAlgorithmException ex) {
                            Logger.getLogger(GUI_PIN.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        this.setVisible(false);
                        GUI_Error pError = new GUI_Error("The new password doesn't match.", 0);
                        pError.setVisible(true);
                    }
                }
            }else{
                this.setVisible(false);
                GUI_Error pError = new GUI_Error("Incorrect old password.", 0);
                pError.setVisible(true);
            }
        }catch(HeadlessException e2){
            this.setVisible(false);
            GUI_Error pError = new GUI_Error(0,e2);
            pError.setVisible(true);
        }
    }//GEN-LAST:event_ChangeBackPasswordButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        GUI_Principal pPrincipal = new GUI_Principal(indexPIN);
        pPrincipal.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_PIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_PIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_PIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_PIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_PIN(indexPIN).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ChangeBackPasswordButton;
    private javax.swing.JButton ChangeExitPasswordButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JPasswordField newPasswordField2;
    private javax.swing.JPasswordField oldPasswordField;
    // End of variables declaration//GEN-END:variables
}
