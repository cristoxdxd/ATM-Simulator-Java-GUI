package ATM_Simulator;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class GUI_ResumenTransferencia extends javax.swing.JFrame {
    
    final String FileRoute = "ClientsBinary.data";
    ArrayList<Clients> clients = FilesManager_bin.showListedFile(FileRoute);
    static int indexS,indexST;
    static double currentBalance, Transactionr, TransactionOA;
    
    public GUI_ResumenTransferencia(int index,double Transaction, int index2, double Transaction2) {
        indexS = index;
        indexST = index2;
        currentBalance = (clients.get(indexS)).getBalance();
        Transactionr = Transaction;
        TransactionOA = Transaction2;
        initComponents();
        setLocationRelativeTo(null);
        DecimalFormat showFormat = new DecimalFormat("#.00");
        String decodedAccount = FilesManager_bin.decoderString((clients.get(indexS)).getCardCode());
        NumberAccountLabel.setFont(new java.awt.Font("Roboto Medium", 1, 48));
        NumberAccountLabel.setText(decodedAccount);
        showLastBalance.setText(showFormat.format(currentBalance));
        showLastBalance.show(true);
        showCurrentBalance.setText(showFormat.format(Transactionr));
        showCurrentBalance.show(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PayBackButton = new javax.swing.JButton();
        PayExitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LastBalance = new javax.swing.JLabel();
        CurrentBalance = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showLastBalance = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        showCurrentBalance = new javax.swing.JTextArea();
        CorrectButton = new javax.swing.JButton();
        NumberAccountLabel = new javax.swing.JLabel();
        LastBalance1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 162, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PayBackButton.setBackground(new java.awt.Color(235, 162, 40));
        PayBackButton.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        PayBackButton.setForeground(new java.awt.Color(51, 51, 51));
        PayBackButton.setText("Confirmar y volver");
        PayBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayBackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PayBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, -1, -1));

        PayExitButton.setBackground(new java.awt.Color(235, 162, 40));
        PayExitButton.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        PayExitButton.setForeground(new java.awt.Color(51, 51, 51));
        PayExitButton.setText("Confirmar y salir");
        PayExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PayExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, 170, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Resumen de Transacción");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 600, 150));

        LastBalance.setFont(new java.awt.Font("Roboto Thin", 1, 24)); // NOI18N
        LastBalance.setForeground(new java.awt.Color(51, 51, 51));
        LastBalance.setText("Cuenta a transferir:");
        jPanel1.add(LastBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        CurrentBalance.setFont(new java.awt.Font("Roboto Thin", 1, 24)); // NOI18N
        CurrentBalance.setForeground(new java.awt.Color(51, 51, 51));
        CurrentBalance.setText("Saldo Actual:");
        jPanel1.add(CurrentBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 160, 30));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 280, 50));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 370, 50));

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

        NumberAccountLabel.setFont(new java.awt.Font("Roboto Thin", 2, 36)); // NOI18N
        NumberAccountLabel.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(NumberAccountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 260, -1));

        LastBalance1.setFont(new java.awt.Font("Roboto Thin", 1, 24)); // NOI18N
        LastBalance1.setForeground(new java.awt.Color(51, 51, 51));
        LastBalance1.setText("Saldo Anterior: ");
        jPanel1.add(LastBalance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PayBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayBackButtonActionPerformed
        (clients.get(indexS)).setBalance(Transactionr);
        (clients.get(indexST)).setBalance(TransactionOA);
        Object[] modifiedBalance = clients.toArray();
        FilesManager_bin.addRegisters(modifiedBalance, FileRoute);
        
        this.setVisible(false);
        GUI_Principal pPrincipal = new GUI_Principal(indexS);
        pPrincipal.setVisible(true);
    }//GEN-LAST:event_PayBackButtonActionPerformed

    private void PayExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayExitButtonActionPerformed
        (clients.get(indexS)).setBalance(Transactionr);
        (clients.get(indexST)).setBalance(TransactionOA);
        Object[] modifiedBalance = clients.toArray();
        FilesManager_bin.addRegisters(modifiedBalance, FileRoute);
        
        this.setVisible(false);
        GUI_Final pFinal = new GUI_Final();
        pFinal.setVisible(true);
    }//GEN-LAST:event_PayExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_ResumenTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_ResumenTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_ResumenTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_ResumenTransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_ResumenTransferencia(indexS,Transactionr,indexST,TransactionOA).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CorrectButton;
    private javax.swing.JLabel CurrentBalance;
    private javax.swing.JLabel LastBalance;
    private javax.swing.JLabel LastBalance1;
    private javax.swing.JLabel NumberAccountLabel;
    private javax.swing.JButton PayBackButton;
    private javax.swing.JButton PayExitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea showCurrentBalance;
    private javax.swing.JTextArea showLastBalance;
    // End of variables declaration//GEN-END:variables
}
