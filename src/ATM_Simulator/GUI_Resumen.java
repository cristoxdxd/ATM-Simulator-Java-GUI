package ATM_Simulator;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class GUI_Resumen extends javax.swing.JFrame {
    
    final String FileRoute = "ClientsBinary.data";
    ArrayList<Clients> clients = FilesManager_bin.showListedFile(FileRoute);
    static int indexS;
    static double currentBalance, Transactionr;
    
    public GUI_Resumen(int index,double Transaction) {
        indexS = index;
        currentBalance = (clients.get(indexS)).getBalance();
        Transactionr = Transaction;
        initComponents();
        setLocationRelativeTo(null);
        DecimalFormat showFormat = new DecimalFormat("#.00");
        showLastBalance.setText(showFormat.format(currentBalance));
        showLastBalance.show(true);
        showCurrentBalance.setText(showFormat.format(Transactionr));
        showCurrentBalance.show(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LastBalance = new javax.swing.JLabel();
        CurrentBalance = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showLastBalance = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        showCurrentBalance = new javax.swing.JTextArea();
        CorrectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 162, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(235, 162, 40));
        jButton1.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Confirmar y volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, -1, -1));

        jButton2.setBackground(new java.awt.Color(235, 162, 40));
        jButton2.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Confirmar y salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, 170, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Resumen de Transacción");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 600, 150));

        LastBalance.setFont(new java.awt.Font("Roboto Thin", 1, 24)); // NOI18N
        LastBalance.setForeground(new java.awt.Color(51, 51, 51));
        LastBalance.setText("Saldo Anterior: ");
        jPanel1.add(LastBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        CurrentBalance.setFont(new java.awt.Font("Roboto Thin", 1, 24)); // NOI18N
        CurrentBalance.setForeground(new java.awt.Color(51, 51, 51));
        CurrentBalance.setText("Saldo Actual:");
        jPanel1.add(CurrentBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 160, 30));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        showLastBalance.setEditable(false);
        showLastBalance.setBackground(new java.awt.Color(235, 162, 40));
        showLastBalance.setColumns(20);
        showLastBalance.setFont(new java.awt.Font("Roboto Thin", 2, 36)); // NOI18N
        showLastBalance.setForeground(new java.awt.Color(51, 51, 51));
        showLastBalance.setRows(5);
        jScrollPane1.setViewportView(showLastBalance);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 280, 50));

        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(54, 51, 51));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        showCurrentBalance.setEditable(false);
        showCurrentBalance.setBackground(new java.awt.Color(235, 162, 40));
        showCurrentBalance.setColumns(20);
        showCurrentBalance.setFont(new java.awt.Font("Roboto Light", 2, 36)); // NOI18N
        showCurrentBalance.setForeground(new java.awt.Color(51, 51, 51));
        showCurrentBalance.setRows(5);
        jScrollPane2.setViewportView(showCurrentBalance);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 370, 50));

        CorrectButton.setBackground(new java.awt.Color(235, 162, 40));
        CorrectButton.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        CorrectButton.setForeground(new java.awt.Color(51, 51, 51));
        CorrectButton.setText("Corregir");
        CorrectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrectButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CorrectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        (clients.get(indexS)).setBalance(Transactionr);
        Object[] modifiedBalance = clients.toArray();
        FilesManager_bin.addRegisters(modifiedBalance, FileRoute);
        
        this.setVisible(false);
        GUI_Principal pPrincipal = new GUI_Principal(indexS);
        pPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        (clients.get(indexS)).setBalance(Transactionr);
        Object[] modifiedBalance = clients.toArray();
        FilesManager_bin.addRegisters(modifiedBalance, FileRoute);
        
        this.setVisible(false);
        GUI_Final pFinal = new GUI_Final();
        pFinal.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CorrectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrectButtonActionPerformed
        this.setVisible(false);
        GUI_Principal pPrincipal = new GUI_Principal(indexS);
        pPrincipal.setVisible(true);
    }//GEN-LAST:event_CorrectButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Resumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Resumen(indexS,Transactionr).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CorrectButton;
    private javax.swing.JLabel CurrentBalance;
    private javax.swing.JLabel LastBalance;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea showCurrentBalance;
    private javax.swing.JTextArea showLastBalance;
    // End of variables declaration//GEN-END:variables
}
