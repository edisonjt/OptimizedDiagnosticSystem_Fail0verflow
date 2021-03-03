/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnoticsystem.GUI;

/**
 *
 * @author Fail0verflow
 */
public class FrmMenuClinicHistory extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuClinicHistory
     */
    public FrmMenuClinicHistory() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuImCreate = new javax.swing.JMenuItem();
        mnuImRead = new javax.swing.JMenuItem();
        mnuImUpdate = new javax.swing.JMenuItem();
        mnuImDelete = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Clinical History Menu");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jMenu1.setText("Actions");

        mnuImCreate.setText("Create a new");
        mnuImCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuImCreateActionPerformed(evt);
            }
        });
        jMenu1.add(mnuImCreate);

        mnuImRead.setText("Read");
        mnuImRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuImReadActionPerformed(evt);
            }
        });
        jMenu1.add(mnuImRead);

        mnuImUpdate.setText("Update");
        mnuImUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuImUpdateActionPerformed(evt);
            }
        });
        jMenu1.add(mnuImUpdate);

        mnuImDelete.setText("Delete");
        mnuImDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuImDeleteActionPerformed(evt);
            }
        });
        jMenu1.add(mnuImDelete);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBack)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuImReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuImReadActionPerformed
        this.setVisible(false);
        FrmReadClinicHistory frmReadClinicHistory = new FrmReadClinicHistory();
        frmReadClinicHistory.setVisible(true);
    }//GEN-LAST:event_mnuImReadActionPerformed

    private void mnuImCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuImCreateActionPerformed
        this.setVisible(false);
        FrmNewClinicHistory frmNewClinicHistory = new FrmNewClinicHistory();
        frmNewClinicHistory.setVisible(true);
    }//GEN-LAST:event_mnuImCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        FrmMenu frmMenu = new FrmMenu();
        frmMenu.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void mnuImUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuImUpdateActionPerformed
        this.setVisible(false);
        FrmUpdateClinicHistory frmUpdateClinicHistory = new FrmUpdateClinicHistory();
        frmUpdateClinicHistory.setVisible(true);
    }//GEN-LAST:event_mnuImUpdateActionPerformed

    private void mnuImDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuImDeleteActionPerformed
        this.setVisible(false);
        FrmDeleteClinicHistory frmDeleteClinicHistory = new FrmDeleteClinicHistory();
        frmDeleteClinicHistory.setVisible(true);
    }//GEN-LAST:event_mnuImDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuClinicHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuClinicHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuClinicHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuClinicHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuClinicHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuImCreate;
    private javax.swing.JMenuItem mnuImDelete;
    private javax.swing.JMenuItem mnuImRead;
    private javax.swing.JMenuItem mnuImUpdate;
    // End of variables declaration//GEN-END:variables
}
