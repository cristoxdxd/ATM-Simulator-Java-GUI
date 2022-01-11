package ATM_Simulator;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class GUI_RecargaMovil extends javax.swing.JFrame{
    
    static double RandomNumberRM;

    public GUI_RecargaMovil(double RandomNumber){
        RandomNumberRM = RandomNumber;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RechargeValue = new javax.swing.JTextField();
        PhoneNumber = new javax.swing.JTextField();
        RechargeButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 183, 51));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(235, 162, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design_Images/Celular.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 141, 180, 185));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Moviles");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 224, 124));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Recargas ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 293, 124));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 580, 480));

        jPanel3.setBackground(new java.awt.Color(235, 177, 42));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ingrese el valor de la recarga");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 333, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Ingrese el numero de celular ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 313, -1));

        RechargeValue.setBackground(new java.awt.Color(235, 177, 42));
        RechargeValue.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        RechargeValue.setForeground(new java.awt.Color(51, 51, 51));
        RechargeValue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RechargeValueMousePressed(evt);
            }
        });
        RechargeValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeValueActionPerformed(evt);
            }
        });
        RechargeValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RechargeValueKeyTyped(evt);
            }
        });
        jPanel3.add(RechargeValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 237, 39));

        PhoneNumber.setBackground(new java.awt.Color(235, 177, 42));
        PhoneNumber.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        PhoneNumber.setForeground(new java.awt.Color(51, 51, 51));
        PhoneNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PhoneNumberMousePressed(evt);
            }
        });
        PhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberActionPerformed(evt);
            }
        });
        PhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhoneNumberKeyTyped(evt);
            }
        });
        jPanel3.add(PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 237, 39));

        RechargeButton.setBackground(new java.awt.Color(235, 162, 40));
        RechargeButton.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        RechargeButton.setForeground(new java.awt.Color(51, 51, 51));
        RechargeButton.setText("Recargar");
        RechargeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RechargeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RechargeButtonMouseClicked(evt);
            }
        });
        RechargeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechargeButtonActionPerformed(evt);
            }
        });
        jPanel3.add(RechargeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 190, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Slab", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Solo números nacionales (09********)");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 340, 480));

        BackButton.setBackground(new java.awt.Color(235, 162, 40));
        BackButton.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(51, 51, 51));
        BackButton.setText("Regresar");
        BackButton.setToolTipText("");
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RechargeValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeValueActionPerformed
    }//GEN-LAST:event_RechargeValueActionPerformed
    private void PhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberActionPerformed
    }//GEN-LAST:event_PhoneNumberActionPerformed
    private void PhoneNumberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhoneNumberMousePressed
    }//GEN-LAST:event_PhoneNumberMousePressed
    private void RechargeValueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RechargeValueMousePressed
    }//GEN-LAST:event_RechargeValueMousePressed
    private void RechargeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RechargeButtonMouseClicked
    }//GEN-LAST:event_RechargeButtonMouseClicked
    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
    }//GEN-LAST:event_BackButtonMouseClicked

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        GUI_Principal pPrincipal = new GUI_Principal(RandomNumberRM);
        pPrincipal.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void PhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneNumberKeyTyped
    }//GEN-LAST:event_PhoneNumberKeyTyped

    private void RechargeValueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RechargeValueKeyTyped
    }//GEN-LAST:event_RechargeValueKeyTyped

    private void RechargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechargeButtonActionPerformed
        String validator = PhoneNumber.getText();
        boolean matchPhonevalidator = validator.matches("(09\\d{8})");
        if (matchPhonevalidator){
            try{
                double TransferenceAmountd = Double.parseDouble(RechargeValue.getText());
                if(TransferenceAmountd < RandomNumberRM){
                    double Transaction = RandomNumberRM - TransferenceAmountd;
                    this.setVisible(false);
                    GUI_Resumen pSummary = new GUI_Resumen(RandomNumberRM, Transaction);
                    pSummary.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,
                        "Not enough balance. Try again.",
                        "Error Message",
                        JOptionPane.ERROR_MESSAGE);
                }
            }catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,
                    "Error. " + e.getMessage(),
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,
                "Invalid data. Try again.",
                "Error Message",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RechargeButtonActionPerformed

        public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_RecargaMovil(RandomNumberRM).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JButton RechargeButton;
    private javax.swing.JTextField RechargeValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
