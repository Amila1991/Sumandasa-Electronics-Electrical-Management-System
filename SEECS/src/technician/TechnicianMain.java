/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TechnicianMain.java
 *
 * Created on Feb 11, 2012, 11:30:55 PM
 */

package technician;

import adminMain.AdminMain;
import componentControl.ThemesControl;
import dataFilesControl.ReadFile;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import login.LoginMain;
import model.SystemUser;
import transparentBackground.TransparentBackground;

/**
 *
 * @author Amila Karunathilaka
 */
public class TechnicianMain extends javax.swing.JFrame {
    AddCondition addCondition;
    NewServiceOrders newServiceOrders;
    MyJobDetail myJobDetail;
    AdminMain adminMain;
    /** Creates new form TechnicianMain */
    public TechnicianMain() {
        initComponents();
        setBackground();
        newServiceOrders=new NewServiceOrders(this, pan);
        pan.removeAll();
        newServiceOrders.setVisible(true);
        pan.add(newServiceOrders);
        pan.revalidate();
    }
    
    public TechnicianMain(SystemUser systemUser) {
        initComponents();
        setBackground();
        btBack.setVisible(false);
        newServiceOrders=new NewServiceOrders(this, pan);
        pan.removeAll();
        newServiceOrders.setVisible(true);
        pan.add(newServiceOrders);
        pan.revalidate();
    }
    public TechnicianMain(AdminMain adminMain) {
        initComponents();
        setBackground();
        this.adminMain=adminMain;
        btLogout.setVisible(false);
        btExit.setVisible(false);
        newServiceOrders=new NewServiceOrders(this, pan);
        pan.removeAll();
        newServiceOrders.setVisible(true);
        pan.add(newServiceOrders);
        pan.revalidate();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        pan = new javax.swing.JPanel();
        btMyJobsDetail = new javax.swing.JButton();
        btAddItemCondition = new javax.swing.JButton();
        btNewServiceOrders = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        btLogout = new javax.swing.JButton();
        btExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 690, 1350, new javax.swing.ImageIcon(getClass().getResource("/pictures/technician/TechnicianMain1.png")))); // NOI18N

        pan.setBackground(new java.awt.Color(255, 255, 255));
        pan.setOpaque(false);
        pan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                panFocusGained(evt);
            }
        });
        pan.setLayout(new java.awt.BorderLayout());
        pan.setBounds(20, 110, 1000, 570);
        jLayeredPane1.add(pan, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btMyJobsDetail.setText("My Jobs Detail");
        btMyJobsDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMyJobsDetailActionPerformed(evt);
            }
        });
        btMyJobsDetail.setBounds(1100, 410, 190, 23);
        jLayeredPane1.add(btMyJobsDetail, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btAddItemCondition.setText("Add Item Condition");
        btAddItemCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddItemConditionActionPerformed(evt);
            }
        });
        btAddItemCondition.setBounds(1100, 310, 190, 23);
        jLayeredPane1.add(btAddItemCondition, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btNewServiceOrders.setText("Check New Service Orders");
        btNewServiceOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewServiceOrdersActionPerformed(evt);
            }
        });
        btNewServiceOrders.setBounds(1100, 360, 190, 23);
        jLayeredPane1.add(btNewServiceOrders, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        btBack.setBounds(1150, 640, 130, 40);
        jLayeredPane1.add(btBack, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btLogout.setText("Logout");
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });
        btLogout.setBounds(1080, 640, 130, 40);
        jLayeredPane1.add(btLogout, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        btExit.setBounds(1220, 640, 110, 40);
        jLayeredPane1.add(btExit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddItemConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddItemConditionActionPerformed
        addCondition=new AddCondition();
        pan.removeAll();
        addCondition.setVisible(true);
        pan.add(addCondition);
        pan.revalidate();
}//GEN-LAST:event_btAddItemConditionActionPerformed

    private void btNewServiceOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewServiceOrdersActionPerformed
        newServiceOrders=new NewServiceOrders(this, pan);
        pan.removeAll();
        newServiceOrders.setVisible(true);
        pan.add(newServiceOrders);
        pan.revalidate();
}//GEN-LAST:event_btNewServiceOrdersActionPerformed

    private void btMyJobsDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMyJobsDetailActionPerformed
        myJobDetail=new MyJobDetail(this, pan);
        pan.removeAll();
        myJobDetail.setVisible(true);
        pan.add(myJobDetail);
        pan.revalidate();
    }//GEN-LAST:event_btMyJobsDetailActionPerformed

    private void panFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panFocusGained

    }//GEN-LAST:event_panFocusGained

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        this.dispose();
        adminMain.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "Do You want Logout ?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        if (res == JOptionPane.YES_OPTION) {
            if (adminMain != null) {
                adminMain.dispose();
            }
            this.dispose();
            new LoginMain().setVisible(true);
        }
    }//GEN-LAST:event_btLogoutActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "Do You want Exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        if (res == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int res = JOptionPane.showConfirmDialog(this, "Do You want Exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        if (res == JOptionPane.YES_OPTION) {
            if (adminMain == null) {
                System.exit(0);
            }else{
                this.dispose();
                adminMain.setVisible(true);
            }
        }
    }//GEN-LAST:event_formWindowClosing

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TechnicianMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddItemCondition;
    private javax.swing.JButton btBack;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btLogout;
    private javax.swing.JButton btMyJobsDetail;
    private javax.swing.JButton btNewServiceOrders;
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
