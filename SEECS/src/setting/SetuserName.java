/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package setting;

/**
 *
 * @author Amila
 */
public class SetuserName extends javax.swing.JPanel {

    /**
     * Creates new form SetuserName
     */
    public SetuserName() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jSeparator1 = new javax.swing.JSeparator();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jPasswordField1 = new javax.swing.JPasswordField();

        jSeparator1.setBounds(0, 272, 740, 10);
        jLayeredPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("jLabel1");
        jLabel1.setBounds(310, 40, 34, 14);
        jLayeredPane2.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("jButton1");
        jButton1.setBounds(610, 220, 73, 23);
        jLayeredPane2.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBounds(560, 60, 56, 20);
        jLayeredPane2.add(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBounds(530, 130, 111, 20);
        jLayeredPane2.add(jPasswordField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBounds(10, 10, 730, 250);
        jLayeredPane1.add(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}