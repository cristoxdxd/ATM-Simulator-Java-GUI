package ATM_Simulator;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class GUI_Transferencias extends javax.swing.JFrame {
    
    static double RandomNumbert;

    public GUI_Transferencias(double RandomNumber) {
        RandomNumbert = RandomNumber;
        initComponents();
        setLocationRelativeTo(null);
        TransferenceAmount.setText(TransferenceAmount.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BanksLabel = new javax.swing.JLabel();
        BeneficiarioComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TransferenceAmount = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TransferenceAccount = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 177, 42));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setBackground(new java.awt.Color(235, 162, 40));
        BackButton.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(51, 51, 51));
        BackButton.setText("Regresar");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design_Images/1230408.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 500, 510));

        jPanel2.setBackground(new java.awt.Color(235, 162, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BanksLabel.setFont(new java.awt.Font("Roboto Slab", 2, 18)); // NOI18N
        BanksLabel.setForeground(new java.awt.Color(51, 51, 51));
        BanksLabel.setText("Escoga el beneficiario:");
        jPanel2.add(BanksLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 200, 30));

        BeneficiarioComboBox.setBackground(new java.awt.Color(235, 162, 40));
        BeneficiarioComboBox.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        BeneficiarioComboBox.setForeground(new java.awt.Color(51, 51, 51));
        BeneficiarioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banco Amigo", "Banco Vecino", "Banco Lejano", "Banco Viral" }));
        BeneficiarioComboBox.setSelectedItem(null);
        BeneficiarioComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BeneficiarioComboBoxItemStateChanged(evt);
            }
        });
        BeneficiarioComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeneficiarioComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(BeneficiarioComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 190, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Slab", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("*Una vez seleccionado el beneficiario");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Slab", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("se efectuará la transferencia.");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("$");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jScrollPane1.setForeground(new java.awt.Color(204, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TransferenceAmount.setBackground(new java.awt.Color(235, 162, 40));
        TransferenceAmount.setColumns(5);
        TransferenceAmount.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        TransferenceAmount.setForeground(new java.awt.Color(51, 51, 51));
        TransferenceAmount.setRows(1);
        TransferenceAmount.setToolTipText("");
        TransferenceAmount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TransferenceAmount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(TransferenceAmount);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 150, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Slab", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingrese el monto a transferir:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jScrollPane2.setForeground(new java.awt.Color(204, 255, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TransferenceAccount.setBackground(new java.awt.Color(235, 162, 40));
        TransferenceAccount.setColumns(5);
        TransferenceAccount.setFont(new java.awt.Font("Roboto Thin", 1, 24)); // NOI18N
        TransferenceAccount.setForeground(new java.awt.Color(51, 51, 51));
        TransferenceAccount.setRows(1);
        TransferenceAccount.setToolTipText("");
        TransferenceAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TransferenceAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(TransferenceAccount);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 230, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Slab", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Ingrese el número de cuenta:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Slab", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Verifique ingresar los 10 digitos");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        GUI_Principal pPrincipal = new GUI_Principal(RandomNumbert);
        pPrincipal.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void BeneficiarioComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BeneficiarioComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BeneficiarioComboBoxItemStateChanged

    private void BeneficiarioComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeneficiarioComboBoxActionPerformed
        String selectedBeneficiario = BeneficiarioComboBox.getSelectedItem().toString();
        switch(selectedBeneficiario){
            case "Banco Amigo": case "Banco Vecino": case "Banco Lejano": case "Banco Viral":
                try{
                    String validator = TransferenceAccount.getText();
                    boolean matchvalidator = validator.matches("(\\d{10})");
                    if(matchvalidator){
                        double TransferenceAmountd = Double.parseDouble(TransferenceAmount.getText());
                        if(TransferenceAmountd<RandomNumbert){
                            double Transaction = RandomNumbert - TransferenceAmountd;
                            this.setVisible(false);
                            GUI_Resumen pSummary = new GUI_Resumen(RandomNumbert, Transaction);
                            pSummary.setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(null,
                                "Not enough balance. Try again.",
                                "Error Message",
                                JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,
                            "Not valid account. Try again.",
                            "Error Message",
                            JOptionPane.ERROR_MESSAGE);
                    }
                }catch(HeadlessException e){
                    JOptionPane.showMessageDialog(null,
                        "Error. " + e.getMessage(),
                        "Error Message",
                        JOptionPane.ERROR_MESSAGE);
                }
            break;
        }
    }//GEN-LAST:event_BeneficiarioComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Transferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Transferencias(RandomNumbert).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BanksLabel;
    private javax.swing.JComboBox<String> BeneficiarioComboBox;
    private javax.swing.JTextArea TransferenceAccount;
    private javax.swing.JTextArea TransferenceAmount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
