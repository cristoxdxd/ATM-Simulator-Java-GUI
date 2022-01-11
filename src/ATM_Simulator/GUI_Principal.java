package ATM_Simulator;

public class GUI_Principal extends javax.swing.JFrame {
    
    static double RandomNumberP;
    
    public GUI_Principal(double RandomNumber) {
        RandomNumberP = RandomNumber;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        bankName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DollarSign = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TransferenciasButton = new javax.swing.JButton();
        RetirosButton = new javax.swing.JButton();
        RecargasButton = new javax.swing.JButton();
        ConsultarButton = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 177, 42));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bankName.setFont(new java.awt.Font("Roboto Slab", 1, 45)); // NOI18N
        bankName.setForeground(new java.awt.Color(51, 51, 51));
        bankName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bankName.setText("Banco");
        jPanel1.add(bankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 160, 60));

        jLabel1.setFont(new java.awt.Font("Roboto Slab", 1, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Amigo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        DollarSign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design_Images/aad07dccd1fa918b297fad8815f1389e-signo-de-icono-de-signo-de-dolar-de-dinero.png"))); // NOI18N
        jPanel1.add(DollarSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 20, 420, 340));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("¡Hola!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Thin", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Bienvenido a tu");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Thin", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Cajero Automático");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        jPanel3.setBackground(new java.awt.Color(235, 162, 40));
        jPanel3.setForeground(new java.awt.Color(235, 177, 42));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 340, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 420));

        jPanel2.setBackground(new java.awt.Color(255, 183, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransferenciasButton.setBackground(new java.awt.Color(235, 162, 40));
        TransferenciasButton.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        TransferenciasButton.setForeground(new java.awt.Color(51, 51, 51));
        TransferenciasButton.setText("Transferencias");
        TransferenciasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferenciasButtonActionPerformed(evt);
            }
        });
        jPanel2.add(TransferenciasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 170, 50));

        RetirosButton.setBackground(new java.awt.Color(235, 162, 40));
        RetirosButton.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        RetirosButton.setForeground(new java.awt.Color(51, 51, 51));
        RetirosButton.setText("Retiros");
        RetirosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirosButtonActionPerformed(evt);
            }
        });
        jPanel2.add(RetirosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, 50));

        RecargasButton.setBackground(new java.awt.Color(235, 162, 40));
        RecargasButton.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        RecargasButton.setForeground(new java.awt.Color(51, 51, 51));
        RecargasButton.setText("Recargas Mov.");
        RecargasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecargasButtonActionPerformed(evt);
            }
        });
        jPanel2.add(RecargasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 170, 50));

        ConsultarButton.setBackground(new java.awt.Color(235, 162, 40));
        ConsultarButton.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        ConsultarButton.setForeground(new java.awt.Color(51, 51, 51));
        ConsultarButton.setText("Consultar");
        ConsultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ConsultarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 900, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RecargasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecargasButtonActionPerformed
        this.setVisible(false);
        GUI_RecargaMovil pRecarga = new GUI_RecargaMovil(RandomNumberP);
        pRecarga.setVisible(true);
    }//GEN-LAST:event_RecargasButtonActionPerformed

    private void RetirosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirosButtonActionPerformed
        this.setVisible(false);
        GUI_Retiros pRetiros = new GUI_Retiros(RandomNumberP);
        pRetiros.setVisible(true);
    }//GEN-LAST:event_RetirosButtonActionPerformed

    private void TransferenciasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferenciasButtonActionPerformed
        this.setVisible(false);
        GUI_Transferencias pTransferencia = new GUI_Transferencias(RandomNumberP);
        pTransferencia.setVisible(true);
    }//GEN-LAST:event_TransferenciasButtonActionPerformed

    private void ConsultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarButtonActionPerformed
        this.setVisible(false);
        GUI_Consultar pConsultar = new GUI_Consultar(RandomNumberP);
        pConsultar.setVisible(true);
    }//GEN-LAST:event_ConsultarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Principal(RandomNumberP).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarButton;
    private javax.swing.JLabel DollarSign;
    private javax.swing.JButton RecargasButton;
    private javax.swing.JButton RetirosButton;
    private javax.swing.JButton TransferenciasButton;
    private javax.swing.JLabel bankName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
