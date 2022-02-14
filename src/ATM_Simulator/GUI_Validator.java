package ATM_Simulator;

import java.awt.HeadlessException;
import java.util.ArrayList;

public class GUI_Validator extends javax.swing.JFrame {

    final String FileRoute = "ClientsBinary.data";
    ArrayList<Clients> clients = FilesManager_bin.showListedFile(FileRoute);
    static int index = -1;
    
    public GUI_Validator() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CardCodePasswordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 177, 42));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingrese su PIN:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));

        PasswordField.setBackground(new java.awt.Color(51, 51, 51));
        PasswordField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(204, 255, 255));
        PasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 90, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design_Images/2424651.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 520, 530));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("XXXX-XXXX-XX");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        CardCodePasswordField.setBackground(new java.awt.Color(235, 177, 42));
        CardCodePasswordField.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        CardCodePasswordField.setForeground(new java.awt.Color(204, 255, 255));
        CardCodePasswordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CardCodePasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardCodePasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(CardCodePasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 80, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("de su tarjeta:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Ingrese los 6 últimos dígitos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        String search = "";
        char[] cardCode = CardCodePasswordField.getPassword();
        for(int i = 0; i < cardCode.length; i++){
            search += cardCode[i];
        }
        boolean matchvalidator = search.matches("(\\d{6})");
        String encodedsearch = FilesManager_bin.encoderString(search);
        try{
            if (matchvalidator){
                index = FilesManager_bin.getIndex(encodedsearch, FileRoute);
                //System.out.println(index);
                if(index == -1){
                    this.setVisible(false);
                    GUI_Error pError = new GUI_Error("This card code doesn't exit.", 0);
                    pError.setVisible(true);
                }
            }else{
                this.setVisible(false);
                GUI_Error pError = new GUI_Error("This card code doesn't exit.", 0);
                pError.setVisible(true);
            }
        }catch(HeadlessException e){
            this.setVisible(false);
            GUI_Error pError = new GUI_Error(0,e);
            pError.setVisible(true);
        }    
        
        String validator = "";
        char[] password = PasswordField.getPassword();
        for(int i = 0; i < password.length; i++){
            validator += password[i];
        }
        boolean matchvalidator2 = validator.matches("(\\d{4})");
        Clients thisClient = new Clients();
        thisClient = clients.get(index);
        String ClientPassword = thisClient.getPassword();
        String realPassword = FilesManager_bin.decoderString(ClientPassword);
        try{
            if (matchvalidator2){
                if(!validator.equals(realPassword)){
                    this.setVisible(false);
                    GUI_Error pError = new GUI_Error("Incorrect password.", 0);
                    pError.setVisible(true);
                } else {
                    this.setVisible(false);
                    GUI_Principal pPrincipal = new GUI_Principal(index);
                    pPrincipal.setVisible(true);
                }
            }else{
                this.setVisible(false);
                GUI_Error pError = new GUI_Error("Incorrect password.", 0);
                pError.setVisible(true);
            }
        }catch(HeadlessException e2){
            this.setVisible(false);
            GUI_Error pError = new GUI_Error(0,e2);
            pError.setVisible(true);
        }
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void CardCodePasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardCodePasswordFieldActionPerformed
    }//GEN-LAST:event_CardCodePasswordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Validator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Validator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Validator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Validator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Validator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CardCodePasswordField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
