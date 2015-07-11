/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import componentControl.ThemesControl;
import connection.DBConn;
import connection.DBHandle;
import dataFilesControl.FileUtil;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.SystemUser;
import protections.Protector;
import transparentBackground.*;

/**
 *
 * @author Amila
 */
public class LoginMain extends javax.swing.JFrame {
    // TransparentBackground transparentBackground=new TransparentBackground(this);

    /**
     * Creates new form LoginMain
     */
    public LoginMain() {

        initComponents();
        TransferenceThisWindow.tranceferantThis(this);
        setSize(600, 300);
        checkBt();
        setBackground();
        this.setLocationRelativeTo(null);

        /*
         * try { String user="Amila"; String pass=Protector.encrypt("viewsonic",
         * user, 5); String query="INSERT INTO SystemUser
         * VALUES('EOOO1','"+user+"','"+pass+"')"; int res
         * =DBHandle.setData(DBConn.getConnectionToDB(), query);
         * System.out.println(pass); user="Hasitha";
         * pass=Protector.encrypt("viewsonic", user, 5); query="INSERT INTO
         * SystemUser VALUES('EOOO2','"+user+"','"+pass+"')"; res
         * =DBHandle.setData(DBConn.getConnectionToDB(), query);
         * System.out.println(pass); user="Janath";
         * pass=Protector.encrypt("viewsonic", user, 5); query="INSERT INTO
         * SystemUser VALUES('EOOO3','"+user+"','"+pass+"')"; res
         * =DBHandle.setData(DBConn.getConnectionToDB(), query);
         * System.out.println(pass); } catch (Exception ex) {
         * Logger.getLogger(LoginMain.class.getName()).log(Level.SEVERE, null,
         * ex); }
         */

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLogName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        txtUserPassword = new javax.swing.JPasswordField();
        btLogin = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        lbLogName1 = new javax.swing.JLabel();

        lbLogName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/login/LoginMianName.png"))); // NOI18N
        lbLogName.getAccessibleContext().setAccessibleDescription("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 240));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 240, 600, new javax.swing.ImageIcon(getClass().getResource("/pictures/login/LoginMainFrame1.png")))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 240));

        txtUserPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserPasswordKeyReleased(evt);
            }
        });

        btLogin.setText("Login");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbLogName1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/login/LoginMianName.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogName1)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbLogName1)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        String userName = txtUserName.getText();
        logUserMain(userName);
    }//GEN-LAST:event_btLoginActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        int res = JOptionPane.showConfirmDialog(null, "Do You want to Exit ?", "Exit", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_btExitActionPerformed

    private void txtUserPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserPasswordKeyReleased
        checkBt();
    }//GEN-LAST:event_txtUserPasswordKeyReleased

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
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LoginMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JButton btLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbLogName;
    private javax.swing.JLabel lbLogName1;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPasswordField txtUserPassword;
    // End of variables declaration//GEN-END:variables

    private boolean checkUserName(String userName) {
        boolean returnValue = false;
        String[] developerAccount = new String[2];
        try {
            FileUtil fileUtil = new FileUtil();
            developerAccount = fileUtil.readDeveloperAccount();
        } catch (IOException ex) {
            Logger.getLogger(LoginMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(LoginMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (developerAccount[0].equals(userName)) {
            returnValue = true;
        } else {
            try {
                String query = "select * from SystemUser where User_Name='" + userName + "'";
                ResultSet rst = DBHandle.getData(DBConn.getConnectionToDB(), query);
                if (rst.next()) {
                    returnValue = true;
                } else {
                    returnValue = false;
                }
            } catch (Exception ex) {
                Logger.getLogger(LoginMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return returnValue;
    }

    private boolean checkPasswordwithUserName(String userName, String password) {
        boolean returnValue = false;
        String[] developerAccount = new String[2];
        try {
            FileUtil fileUtil = new FileUtil();
            developerAccount = fileUtil.readDeveloperAccount();
        } catch (IOException ex) {
            Logger.getLogger(LoginMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(LoginMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (developerAccount[0].equals(userName) && developerAccount[1].equals(password)) {
            returnValue = true;
        } else {
            try {
                String query = "select * from SystemUser where User_Name='" + userName + "'";
                ResultSet rst = DBHandle.getData(DBConn.getConnectionToDB(), query);
                if (rst.next()) {
                    String user = rst.getString("User_Name");
                    String pass = rst.getString("Password");
                    System.out.println(user + " " + pass);
                    String d = "";
                    d = Protector.decrypt(pass, user, 5);
                    System.out.println(d);
                    if (userName.equals(user) && password.equals(d)) {
                        returnValue = true;
                    } else {
                        returnValue = false;
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(LoginMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return returnValue;
    }

    private void logUserMain(String userName) {
        SystemUser systemUser = new SystemUser();
        systemUser.setUser_Name(userName);
        String[] developerAccount = new String[2];
        try {
            FileUtil fileUtil = new FileUtil();
            developerAccount = fileUtil.readDeveloperAccount();
        } catch (IOException ex) {
            Logger.getLogger(LoginMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(LoginMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (developerAccount[0].equals(userName)) {
            this.setVisible(false);
            new Loading(1, systemUser).setVisible(true);
        } else {
            try {
                String query = "select su.Employee_ID,e.Employee_Name,et.Employee_Type_ID,et.Employee_Type_Name from SystemUser su NATURAL JOIN Employee e NATURAL JOIN EmployeeType et where su.User_Name='" + userName + "'";
                ResultSet rst = DBHandle.getData(DBConn.getConnectionToDB(), query);
                if (rst.next()) {
                    String empTypeID = rst.getString("et.Employee_Type_ID");
                    if (empTypeID.equals("ET1")) {
                        this.setVisible(false);
                        new Loading(1, systemUser).setVisible(true);
                    } else if (empTypeID.equals("ET2")) {
                        this.setVisible(false);
                        new Loading(2, systemUser).setVisible(true);
                    } else if (empTypeID.equals("ET3")) {
                        this.setVisible(false);
                        new Loading(3, systemUser).setVisible(true);
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(LoginMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void checkBt() {
        String userName = txtUserName.getText();
        System.out.println(userName.toLowerCase());
        String password = new String(txtUserPassword.getPassword());
        if (!checkUserName(userName)) {
            btLogin.setEnabled(false);
        } else if (checkPasswordwithUserName(txtUserName.getText(), password)) {
            btLogin.setEnabled(true);
        } else {
            btLogin.setEnabled(false);
        }
    }

    private void setBackground() {
        ThemesControl.setTheme(this, 1);
        final String title = "SUMANADASA ELECTRONIC & ELECTRICAL MANAGEMENT SYSTEM";
        setIconImage(new ImageIcon(getClass().getResource("/pictures/Neotech.png")).getImage());
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
}
