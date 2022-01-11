package ATM_Simulator;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class GUI_Retiros extends javax.swing.JFrame {
    
    static double RandomNumberR;

    public GUI_Retiros(double RandomNumber) {
        RandomNumberR = RandomNumber;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        WithdrawButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WithdrawAmount = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 162, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design_Images/2486980.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, -30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(235, 177, 42));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WithdrawButton.setBackground(new java.awt.Color(235, 162, 40));
        WithdrawButton.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        WithdrawButton.setForeground(new java.awt.Color(51, 51, 51));
        WithdrawButton.setText("Retirar");
        WithdrawButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        WithdrawButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WithdrawButtonMouseClicked(evt);
            }
        });
        WithdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawButtonActionPerformed(evt);
            }
        });
        jPanel2.add(WithdrawButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 160, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("$");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        WithdrawAmount.setBackground(new java.awt.Color(235, 177, 42));
        WithdrawAmount.setColumns(5);
        WithdrawAmount.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        WithdrawAmount.setRows(1);
        jScrollPane1.setViewportView(WithdrawAmount);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 250, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 480));

        jPanel3.setBackground(new java.awt.Color(255, 183, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setBackground(new java.awt.Color(235, 162, 40));
        BackButton.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(51, 51, 51));
        BackButton.setText("Regresar");
        jPanel3.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 900, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WithdrawButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WithdrawButtonMouseClicked

    }//GEN-LAST:event_WithdrawButtonMouseClicked

    private void WithdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawButtonActionPerformed
         try{
            double TransferenceAmounti = Integer.parseInt(WithdrawAmount.getText());
            if(TransferenceAmounti < 500){
                double Transaction = RandomNumberR - TransferenceAmounti;
                this.setVisible(false);
                GUI_Resumen pSummary = new GUI_Resumen(RandomNumberR, Transaction);
                pSummary.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,
                    "Not allowed withdraw over $500. Try again.",
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
            } 
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,
                    "Error. Only allowed integer values.\n" + e.getMessage(),
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
        }    
    }//GEN-LAST:event_WithdrawButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Retiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Retiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Retiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Retiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Retiros(RandomNumberR).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextArea WithdrawAmount;
    private javax.swing.JButton WithdrawButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
