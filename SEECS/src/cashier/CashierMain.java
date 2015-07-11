/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashier;

import adminMain.AdminMain;
import componentControl.AutoGenerate;
import componentControl.ThemesControl;
import dataFilesControl.ReadFile;
import grn.GRN;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import login.LoginMain;
import model.SystemUser;
import report.DailyReport;
import transparentBackground.TransferenceThisWindow;

/**
 *
 * @author Amila
 */
public class CashierMain extends javax.swing.JFrame {

    private HashMap<KeyStroke, Action> actionMap = new HashMap<KeyStroke, Action>();
    public ArrayList<InternalFrame> billInternalFrameList = new ArrayList<InternalFrame>();
    AddServiceOrder addServiceOrder;
    CheckServiceOrder checkServiceOrder;
    //InvoiceView invoice;
    DailyReport dailyReport;
    AdminMain adminMain;
    GRN gRN;
    AddStock addStock;
    SystemUser systemUser;

    /**
     * Creates new form Cashier
     */
    public CashierMain() {
        initComponents();
        setBackground();
        btBack.setVisible(false);
        InternalFrame internalFrame = new InternalFrame(this, panelPane, "Bill");
        billInternalFrameList.add(internalFrame);
        internalFrame.setVisible(true);
        panelPane.add(internalFrame);
        servicePane.setVisible(false);
        internalFrame.setClosable(false);
        shopPane.setVisible(true);
        setup();
        AutoGenerate.getNextID("SalesOrderPayment", "OrderPayment_ID", "PI");
        TransferenceThisWindow.tranceferantThis(panelPane);
        systemUser = new SystemUser(null, "amila", "amila");
    }

    public CashierMain(AdminMain adminMain, SystemUser systemUser) {
        initComponents();
        setBackground();
        btLogout.setVisible(false);
        btExit1.setVisible(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.adminMain = adminMain;
        this.systemUser = systemUser;
        InternalFrame internalFrame = new InternalFrame(this, panelPane, "Bill");
        billInternalFrameList.add(internalFrame);
        internalFrame.setVisible(true);
        internalFrame.setClosable(false);
        panelPane.add(internalFrame);
        servicePane.setVisible(false);
        shopPane.setVisible(true);
        setup();
        lbUserName.setText(systemUser.getUser_Name());
        TransferenceThisWindow.tranceferantThis(panelPane);
    }

    public CashierMain(SystemUser systemUser) {
        initComponents();
        setBackground();
        btBack.setVisible(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.systemUser = systemUser;
        InternalFrame internalFrame = new InternalFrame(this, panelPane, "Bill");
        billInternalFrameList.add(internalFrame);
        internalFrame.setVisible(true);
        internalFrame.setClosable(false);
        panelPane.add(internalFrame);
        servicePane.setVisible(false);
        shopPane.setVisible(true);
        setup();
        lbUserName.setText(systemUser.getUser_Name());
        TransferenceThisWindow.tranceferantThis(panelPane);
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
        btExit1 = new javax.swing.JButton();
        btLogout = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        lbTime = new javax.swing.JLabel();
        loader2 = new bir.loader();
        loader3 = new bir.loader();
        jLabel1 = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        shopPane = new javax.swing.JLayeredPane();
        btShopBill2 = new javax.swing.JButton();
        btGRN = new javax.swing.JButton();
        btInvoice1 = new javax.swing.JButton();
        btShopBill = new javax.swing.JButton();
        panelPane = new javax.swing.JDesktopPane();
        servicePane = new javax.swing.JLayeredPane();
        btReceiveServiceOrder = new javax.swing.JButton();
        btCheckServiceOrder = new javax.swing.JButton();
        btInvoice = new javax.swing.JButton();
        btminmized = new bir.loader();
        btlogout = new bir.loader();
        btexit = new bir.loader();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jLayeredPane1.setBackground(new java.awt.Color(240, 240, 240));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1024, 1280, new javax.swing.ImageIcon(getClass().getResource("/pictures/cashier/Cashier1280,1024.png")))); // NOI18N
        jLayeredPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLayeredPane1KeyReleased(evt);
            }
        });

        btExit1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExit1.setText("Exit");
        btExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExit1ActionPerformed(evt);
            }
        });
        btExit1.setBounds(1130, 970, 120, 40);
        jLayeredPane1.add(btExit1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btLogout.setText("Logout");
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });
        btLogout.setBounds(1000, 970, 120, 40);
        jLayeredPane1.add(btLogout, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        btBack.setBounds(1060, 970, 130, 40);
        jLayeredPane1.add(btBack, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbTime.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbTime.setBounds(1110, 100, 160, 40);
        jLayeredPane1.add(lbTime, javax.swing.JLayeredPane.DEFAULT_LAYER);

        loader2.setForeground(new java.awt.Color(0, 0, 0));
        loader2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/cashier/electrical goods.png"))); // NOI18N
        loader2.setText("Shop    F1");
        loader2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loader2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loader2ActionPerformed(evt);
            }
        });
        loader2.setBounds(1140, 530, 112, 120);
        jLayeredPane1.add(loader2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        loader3.setForeground(new java.awt.Color(0, 0, 0));
        loader3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/cashier/electrical goods.png"))); // NOI18N
        loader3.setText("Service    F2");
        loader3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loader3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loader3ActionPerformed(evt);
            }
        });
        loader3.setBounds(1150, 680, 114, 120);
        jLayeredPane1.add(loader3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel1.setText("User Name");
        jLabel1.setBounds(10, 100, 100, 20);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbUserName.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        lbUserName.setBounds(110, 100, 210, 30);
        jLayeredPane1.add(lbUserName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btShopBill2.setFont(new java.awt.Font("Andalus", 1, 16)); // NOI18N
        btShopBill2.setText("Pay Installment");
        btShopBill2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShopBill2ActionPerformed(evt);
            }
        });
        btShopBill2.setBounds(450, 10, 210, 40);
        shopPane.add(btShopBill2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btGRN.setFont(new java.awt.Font("Andalus", 1, 16)); // NOI18N
        btGRN.setText("Goods Receive");
        btGRN.setToolTipText("");
        btGRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGRNActionPerformed(evt);
            }
        });
        btGRN.setBounds(240, 10, 190, 40);
        shopPane.add(btGRN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btInvoice1.setFont(new java.awt.Font("Andalus", 1, 16)); // NOI18N
        btInvoice1.setText("Daily Report");
        btInvoice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInvoice1ActionPerformed(evt);
            }
        });
        btInvoice1.setBounds(20, 70, 150, 40);
        shopPane.add(btInvoice1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btShopBill.setFont(new java.awt.Font("Andalus", 1, 16)); // NOI18N
        btShopBill.setText("Goods Issue");
        btShopBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShopBillActionPerformed(evt);
            }
        });
        btShopBill.setBounds(10, 10, 210, 40);
        shopPane.add(btShopBill, javax.swing.JLayeredPane.DEFAULT_LAYER);

        shopPane.setBounds(50, 850, 790, 130);
        jLayeredPane1.add(shopPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        panelPane.setOpaque(false);
        panelPane.setBounds(20, 150, 1120, 700);
        jLayeredPane1.add(panelPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btReceiveServiceOrder.setFont(new java.awt.Font("Andalus", 1, 16)); // NOI18N
        btReceiveServiceOrder.setText("Receive Service Order");
        btReceiveServiceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReceiveServiceOrderActionPerformed(evt);
            }
        });
        btReceiveServiceOrder.setBounds(30, 10, 210, 40);
        servicePane.add(btReceiveServiceOrder, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btCheckServiceOrder.setFont(new java.awt.Font("Andalus", 1, 16)); // NOI18N
        btCheckServiceOrder.setText("Check Service Order");
        btCheckServiceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCheckServiceOrderActionPerformed(evt);
            }
        });
        btCheckServiceOrder.setBounds(260, 10, 190, 40);
        servicePane.add(btCheckServiceOrder, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btInvoice.setFont(new java.awt.Font("Andalus", 1, 16)); // NOI18N
        btInvoice.setText("Daily Report");
        btInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInvoiceActionPerformed(evt);
            }
        });
        btInvoice.setBounds(470, 10, 150, 40);
        servicePane.add(btInvoice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        servicePane.setBounds(170, 960, 850, 70);
        jLayeredPane1.add(servicePane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btminmized.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/button/Minimized 30.png"))); // NOI18N
        btminmized.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/button/Minimized active 30.png"))); // NOI18N
        btminmized.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btminmizedMouseEntered(evt);
            }
        });
        btminmized.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btminmizedActionPerformed(evt);
            }
        });
        btminmized.setBounds(1150, 10, 40, 50);
        jLayeredPane1.add(btminmized, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/button/ Logout 30.png"))); // NOI18N
        btlogout.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/button/Logout active 30.png"))); // NOI18N
        btlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlogoutActionPerformed(evt);
            }
        });
        btlogout.setBounds(1190, 10, 40, 50);
        jLayeredPane1.add(btlogout, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/button/exit 30.png"))); // NOI18N
        btexit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/button/exit active 30.png"))); // NOI18N
        btexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexitActionPerformed(evt);
            }
        });
        btexit.setBounds(1230, 10, 40, 50);
        jLayeredPane1.add(btexit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExit1ActionPerformed
        int res = JOptionPane.showConfirmDialog(this, "Do You want Exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        if (res == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btExit1ActionPerformed

    private void loader2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loader2ActionPerformed
        servicePane.setVisible(false);
        shopPane.setVisible(true);
    }//GEN-LAST:event_loader2ActionPerformed

    private void jLayeredPane1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLayeredPane1KeyReleased
    }//GEN-LAST:event_jLayeredPane1KeyReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            servicePane.setVisible(true);
        }
    }//GEN-LAST:event_formKeyReleased

    private void btReceiveServiceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReceiveServiceOrderActionPerformed
//        addServiceOrder = new AddServiceOrder(this, pan);
//        pan.removeAll();
//        addServiceOrder.setVisible(true);
//        pan.add(addServiceOrder);
//        pan.revalidate();
        setIconfied();
        InternalFrame internalFrame = new InternalFrame(this, panelPane, "AddServiceOrder");
        billInternalFrameList.add(internalFrame);
        internalFrame.setVisible(true);
        panelPane.add(internalFrame);
    }//GEN-LAST:event_btReceiveServiceOrderActionPerformed

    private void btCheckServiceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCheckServiceOrderActionPerformed
//        checkServiceOrder = new CheckServiceOrder(this, pan);
//        pan.removeAll();
//        checkServiceOrder.setVisible(true);
//        pan.add(checkServiceOrder);
//        pan.revalidate();
    }//GEN-LAST:event_btCheckServiceOrderActionPerformed

    private void btInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInvoiceActionPerformed
//        dailyReport = new DailyReport(this, pan);
//        pan.removeAll();
//        dailyReport.setVisible(true);
//        pan.add(dailyReport);
//        pan.revalidate();
//        repaint();
    }//GEN-LAST:event_btInvoiceActionPerformed

    private void btShopBill2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShopBill2ActionPerformed
        setIconfied();
        InternalFrame internalFrame = new InternalFrame(this, panelPane, "cancel");
        billInternalFrameList.add(internalFrame);
        internalFrame.setVisible(true);
        panelPane.add(internalFrame);
    }//GEN-LAST:event_btShopBill2ActionPerformed

    private void btGRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGRNActionPerformed
//        addStock = new AddStock(this, pan);
//        pan.removeAll();
//        addStock .setVisible(true);
//        pan.add(addStock);
//        pan.revalidate();


        this.setVisible(false);
        gRN = new GRN(this, true, this, systemUser);
        gRN.setVisible(true);

    }//GEN-LAST:event_btGRNActionPerformed

    private void btInvoice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInvoice1ActionPerformed
//        dailyReport = new DailyReport(this, pan);
//        pan.removeAll();
//        dailyReport.setVisible(true);
//        pan.add(dailyReport);
//        pan.revalidate();
//        repaint();
    }//GEN-LAST:event_btInvoice1ActionPerformed

    private void loader3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loader3ActionPerformed
        shopPane.setVisible(false);
        servicePane.setVisible(true);
    }//GEN-LAST:event_loader3ActionPerformed

    private void btShopBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShopBillActionPerformed
        //bill = new Bill(this, pan);
//        pan.removeAll();
//        bill.setVisible(true);
//        pan.add(bill);
//        pan.revalidate();
        setIconfied();
        InternalFrame internalFrame = new InternalFrame(this, panelPane, "Bill");
        billInternalFrameList.add(internalFrame);
        internalFrame.setVisible(true);
        panelPane.add(internalFrame);
    }//GEN-LAST:event_btShopBillActionPerformed

    private void btminmizedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btminmizedActionPerformed
        CashierMain.this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btminmizedActionPerformed

    private void btminmizedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btminmizedMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btminmizedMouseEntered

    private void btexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexitActionPerformed
        ImageIcon image = new ImageIcon("src\\pictures\\button\\exit active 30.png");
        int res = JOptionPane.showConfirmDialog(this, "Do You want Exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, image);
        if (res == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btexitActionPerformed

    private void btlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlogoutActionPerformed
        ImageIcon image = new ImageIcon("src\\pictures\\button\\Logout active 30.png");
        int res = JOptionPane.showConfirmDialog(this, "Do You want Logout ?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, image);
        if (res == JOptionPane.YES_OPTION) {
            if (adminMain != null) {
                adminMain.dispose();
            }
            this.dispose();
            new LoginMain().setVisible(true);
        }
    }//GEN-LAST:event_btlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(CashierMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CashierMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btCheckServiceOrder;
    private javax.swing.JButton btExit1;
    private javax.swing.JButton btGRN;
    private javax.swing.JButton btInvoice;
    private javax.swing.JButton btInvoice1;
    private javax.swing.JButton btLogout;
    private javax.swing.JButton btReceiveServiceOrder;
    private javax.swing.JButton btShopBill;
    private javax.swing.JButton btShopBill2;
    private bir.loader btexit;
    private bir.loader btlogout;
    private bir.loader btminmized;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lbUserName;
    private bir.loader loader2;
    private bir.loader loader3;
    public javax.swing.JDesktopPane panelPane;
    private javax.swing.JLayeredPane servicePane;
    private javax.swing.JLayeredPane shopPane;
    // End of variables declaration//GEN-END:variables

    private void setClock() {
        Timer timer = new Timer(500, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("hh : mm : ss aa");
                String time = sdf1.format(d);
                lbTime.setText(time);
            }
        });
        timer.start();
    }

    private void setBackground() {
        ThemesControl.setTheme(this, ReadFile.getThemespathinFile());
        setLocationRelativeTo(null);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
        final String title = "SUMANADASA ELECTRONIC & ELECTRICAL MANAGEMENT SYSTEM";
        setIconImage(new ImageIcon(getClass().getResource("/pictures/Neotech.png")).getImage());
        setClock();
        new Thread() {

            public void run() {
                boolean check = true;
                while (true) {
                    for (int i = 0; i < title.length() + 1; i++) {
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

    private void setup() {
        KeyStroke key1 = KeyStroke.getKeyStroke(KeyEvent.getKeyText(KeyEvent.VK_F1));
        actionMap.put(key1, new AbstractAction("action1") {

            @Override
            public void actionPerformed(ActionEvent e) {
                // System.out.println("Ctrl-A pressed: " + e+"   "+KeyEvent.getKeyText(KeyEvent.VK_F1));
                servicePane.setVisible(false);
                shopPane.setVisible(true);
            }
        });
        key1 = KeyStroke.getKeyStroke(KeyEvent.getKeyText(KeyEvent.VK_F2));
        actionMap.put(key1, new AbstractAction("action2") {

            @Override
            public void actionPerformed(ActionEvent e) {
                // System.out.println("Ctrl-A pressed: " + e+"   "+KeyEvent.getKeyText(KeyEvent.VK_F1));
                shopPane.setVisible(false);
                servicePane.setVisible(true);
            }
        });
        key1 = KeyStroke.getKeyStroke(KeyEvent.getKeyText(KeyEvent.VK_F5));
        actionMap.put(key1, new AbstractAction("action3") {

            @Override
            public void actionPerformed(ActionEvent e) {
                btShopBillActionPerformed(e);
               //  System.out.println("Ctrl-A pressed: " + e+"   "+KeyEvent.getKeyText(KeyEvent.VK_F1));
//                bill = new Bill(CashierMain.this, pan);
//                pan.removeAll();
//                bill.setVisible(true);
//                pan.add(bill);
//                pan.revalidate();
            }
        });
        key1 = KeyStroke.getKeyStroke("ctrl pressed A");
        actionMap.put(key1, new AbstractAction("action4") {

            @Override
            public void actionPerformed(ActionEvent e) {
                btShopBill2ActionPerformed(e);
                 System.out.println("Ctrl-A pressed: " + e+"   "+KeyEvent.getKeyText(KeyEvent.VK_F1));
//                bill = new Bill(CashierMain.this, pan);
//                pan.removeAll();
//                bill.setVisible(true);
//                pan.add(bill);
//                pan.revalidate();
            }
        });
        
        
        // add more actions..

        KeyboardFocusManager kfm = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        kfm.addKeyEventDispatcher(new KeyEventDispatcher() {

            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                KeyStroke keyStroke = KeyStroke.getKeyStrokeForEvent(e);
                if (actionMap.containsKey(keyStroke)) {
                    final Action a = actionMap.get(keyStroke);
                    final ActionEvent ae = new ActionEvent(e.getSource(), e.getID(), null);
                    SwingUtilities.invokeLater(new Runnable() {

                        @Override
                        public void run() {
                            a.actionPerformed(ae);
                        }
                    });
                    return true;
                }
                return false;
            }
        });
    }

    public String getUserName() {
        return lbUserName.getText();
    }

    public void setIconfied() {
        for (InternalFrame internalFrame : billInternalFrameList) {
            try {
                if (!internalFrame.isIcon()) {
                    internalFrame.setIcon(true);
                }
            } catch (PropertyVetoException ex) {
                Logger.getLogger(CashierMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}