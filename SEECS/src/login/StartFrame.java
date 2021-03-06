/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import componentControl.ThemesControl;
import connection.DBConn;
import dataFilesControl.FileUtil;
import dataFilesControl.ReadFile;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import setting.ConfigurationMain;
import transparentBackground.TransferenceThisWindow;
import transparentBackground.TransparentBackground;

/**
 *
 * @author Amila
 */
public class StartFrame extends javax.swing.JFrame {
    int v=0;
    javax.swing.Timer t;
    FileUtil fileUtil;
    String[] database;
   // TransparentBackground transparentBackground=new TransparentBackground(this);
    /**
     * Creates new form StartFrame
     */
    public StartFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setBackground();
        TransferenceThisWindow.tranceferantThis(this);
        try {
            fileUtil=new FileUtil();
            database=fileUtil.getDatabase();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StartFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StartFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //this.add("North",transparentBackground);
        //this.add("Center",transparentBackground);
        this.setSize(700, 106);
        t=new javax.swing.Timer(70,new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            progressBar.setValue(v);
                v+=1;
                if(v==10){
                    System.out.println(database[0]);
                    if(!database[0].trim().isEmpty()){
                        lbLoading.setText("     Database Connection File Found ...");
                    }else{
                        t.stop();
                        lbLoading.setText("     Database Connection File not Found ...");
                        new ConfigurationMain(StartFrame.this, true,fileUtil,true,t).setVisible(true);
                    }
                }else if(v==20){
                    if(ReadFile.checkFileExists("DefualtDBConnection.txt")){
                        lbLoading.setText("     Defualt Database Connection File Found ...");
                    }else{
                        
                    }
                }else if(v==30){
                    if(ReadFile.checkFileExists("Themes.txt")){
                        lbLoading.setText("     Themes File Found ...");
                    }else{
                        
                    }
                }else if(v==40){
                    Connection conn=null;
                    try {
                        conn=DBConn.getConnectionToDB();
                    } catch (Exception ex) {
                        conn=null;
                    }
                    if(conn!=null){
                        lbLoading.setText("     Database connect to System ...");
                    }else{
                        t.stop();
                        new ConfigurationMain(StartFrame.this, true,fileUtil,true,t).setVisible(true);
                    }
                }else if(v==100){
                    StartFrame.this.setVisible(false);
                    new LoginMain().setVisible(true);
                }
            }
        });
        t.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbImage = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        lbLoading = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/login/Login Name.png"))); // NOI18N
        lbImage.setFocusable(false);
        getContentPane().add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 91, 700, -1));

        lbLoading.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbLoading.setText("     Loading  .....");
        getContentPane().add(lbLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 700, 21));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new StartFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbLoading;
    private javax.swing.JProgressBar progressBar;
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
