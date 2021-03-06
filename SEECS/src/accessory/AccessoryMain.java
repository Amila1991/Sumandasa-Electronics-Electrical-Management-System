/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accessory;

import componentControl.ThemesControl;
import dataFilesControl.ReadFile;
//import dataFilesControl.ReadFile;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Amila
 */
public class AccessoryMain extends javax.swing.JDialog {
    AddAccessory addAccessory;
    UpdateAccessoryDetail updateAccessoryDetail;
    JFrame parent;
    /**
     * Creates new form AccessoryMain
     */
    public AccessoryMain(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent=(JFrame) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        pan = new javax.swing.JPanel();
        btCheckServiceOrderwithSupervisor = new javax.swing.JButton();
        btAddAccessory = new javax.swing.JButton();
        btCheckServiceOrder1 = new javax.swing.JButton();
        btBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 690, 1350, new javax.swing.ImageIcon(getClass().getResource("/pictures/accessory/AccessoryMainWindows.png")))); // NOI18N

        pan.setOpaque(false);
        pan.setLayout(new java.awt.BorderLayout());
        pan.setBounds(30, 100, 1000, 570);
        jLayeredPane1.add(pan, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btCheckServiceOrderwithSupervisor.setText("Check Service Order Supervisor");
        btCheckServiceOrderwithSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCheckServiceOrderwithSupervisorActionPerformed(evt);
            }
        });
        btCheckServiceOrderwithSupervisor.setBounds(1070, 310, 240, 30);
        jLayeredPane1.add(btCheckServiceOrderwithSupervisor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btAddAccessory.setText("Add Accessory");
        btAddAccessory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddAccessoryActionPerformed(evt);
            }
        });
        btAddAccessory.setBounds(1070, 150, 240, 30);
        jLayeredPane1.add(btAddAccessory, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btCheckServiceOrder1.setText("Update Accessories Detail");
        btCheckServiceOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCheckServiceOrder1ActionPerformed(evt);
            }
        });
        btCheckServiceOrder1.setBounds(1070, 230, 240, 30);
        jLayeredPane1.add(btCheckServiceOrder1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        btBack.setBounds(1150, 630, 130, 40);
        jLayeredPane1.add(btBack, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCheckServiceOrderwithSupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCheckServiceOrderwithSupervisorActionPerformed
       // allJobsFinishedServiceOrders = new AllJobsFinishedServiceOrders(this, pan);
        pan.removeAll();
       // allJobsFinishedServiceOrders.setVisible(true);
       // pan.add(allJobsFinishedServiceOrders);
        pan.revalidate();
    }//GEN-LAST:event_btCheckServiceOrderwithSupervisorActionPerformed

    private void btAddAccessoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddAccessoryActionPerformed
        addAccessory= new AddAccessory(this, pan);
        pan.removeAll();
        addAccessory.setVisible(true);
        pan.add(addAccessory);
        pan.revalidate();
    }//GEN-LAST:event_btAddAccessoryActionPerformed

    private void btCheckServiceOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCheckServiceOrder1ActionPerformed
        updateAccessoryDetail= new UpdateAccessoryDetail(this, pan);
        pan.removeAll();
        updateAccessoryDetail.setVisible(true);
        pan.add(updateAccessoryDetail);
        pan.revalidate();
    }//GEN-LAST:event_btCheckServiceOrder1ActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        this.dispose();
        parent.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        parent.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AccessoryMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccessoryMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccessoryMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccessoryMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AccessoryMain dialog = new AccessoryMain(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddAccessory;
    private javax.swing.JButton btBack;
    private javax.swing.JButton btCheckServiceOrder1;
    private javax.swing.JButton btCheckServiceOrderwithSupervisor;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel pan;
    // End of variables declaration//GEN-END:variables

    private void setBackground(){
        ThemesControl.setTheme(this,ReadFile.getThemespathinFile());
        setLocationRelativeTo(null);
        final String title="SUMANADASA ELECTRONIC & ELECTRICAL MANAGEMENT SYSTEM";
        setIconImage(new ImageIcon(getClass().getResource("/pictures/Neotech.png")).getImage());
        new Thread(){
            public void run(){
                boolean check=true;
                while (true) {                    
                    for (int i = 0; i < title.length()+1; i++) {
                        setTitle(title.substring(0, i));
                        try {   
                            Thread.sleep(150); 
                        } catch (Exception e) {
                        }
                    }
                    try {   
                        Thread.sleep(800); 
                    } catch (Exception e) {
                    }
                }
           }
        }.start();
    }
}
