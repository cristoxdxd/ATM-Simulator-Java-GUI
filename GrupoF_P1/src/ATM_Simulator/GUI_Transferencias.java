package ATM_Simulator;

import java.awt.Color;

public class GUI_Transferencias extends javax.swing.JFrame {

    public GUI_Transferencias() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        BanksLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TransferenceAmount = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BeneficiarioComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 162, 40));
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
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        BanksLabel.setFont(new java.awt.Font("Roboto Slab", 2, 14)); // NOI18N
        BanksLabel.setForeground(new java.awt.Color(51, 51, 51));
        BanksLabel.setText("Escoga el beneficiario:");
        jPanel1.add(BanksLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("$");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 150, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Slab", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingrese el monto a transferir:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design_Images/1230408.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 500, 510));

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
        jPanel1.add(BeneficiarioComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 190, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        GUI_Principal pPrincipal = new GUI_Principal();
        pPrincipal.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void BeneficiarioComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BeneficiarioComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BeneficiarioComboBoxItemStateChanged

    private void BeneficiarioComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeneficiarioComboBoxActionPerformed
        String selectedBeneficiario = BeneficiarioComboBox.getSelectedItem().toString();
        switch(selectedBeneficiario){
            case "Banco Amigo": case "Banco Vecino": case "Banco Lejano": case "Banco Viral":
                this.setVisible(false);
                GUI_Resumen pSummary = new GUI_Resumen();
                pSummary.setVisible(true);
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
                new GUI_Transferencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BanksLabel;
    private javax.swing.JComboBox<String> BeneficiarioComboBox;
    private javax.swing.JTextArea TransferenceAmount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
