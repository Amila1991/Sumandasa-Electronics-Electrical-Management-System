/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendor;

import componentControl.FillComboBox;
import componentControl.TextControl;
import componentControl.ValidationValues;
import control.EmployeeControl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;
import model.EmployeeType;

/**
 *
 * @author Amila
 */
public class ChangeEmployee extends javax.swing.JPanel {

    /**
     * Creates new form ChangeEmployee
     */
    public ChangeEmployee() {
        initComponents();
        FillComboBox.fillComboDatabase(cmbEmployeeID, "Employee", "Employee_ID");
        FillComboBox.fillComboDatabase(cmbEmployeeName, "Employee", "Employee_Name");
        FillComboBox.fillComboComboDatabaseWithSomeItem(cmbEmployeeDesignation, "EmployeeType", "Employee_Type_Name","All Designation");
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
        jLayeredPane3 = new javax.swing.JLayeredPane();
        lbEmlpoyeeIDView = new javax.swing.JLabel();
        lbEmployeeNameView = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        lbEmployeeType1 = new javax.swing.JLabel();
        lbEmployeeAddress1 = new javax.swing.JLabel();
        lbEmployeeContact1 = new javax.swing.JLabel();
        txtEmployeeContact = new javax.swing.JTextField();
        txtEmployeeNIC = new javax.swing.JTextField();
        lbEmployeeNIC1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEmployeeAddress = new javax.swing.JTextArea();
        lbWarning = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        cmbEmployeeDesignationchange = new javax.swing.JComboBox();
        lbEmployeeDesignation = new javax.swing.JLabel();
        cmbEmployeeDesignation = new javax.swing.JComboBox();
        cmbEmployeeID = new javax.swing.JComboBox();
        lbEmployeeID = new javax.swing.JLabel();
        lbEmployeeName = new javax.swing.JLabel();
        cmbEmployeeName = new javax.swing.JComboBox();
        btChangeEmployeeDetail = new javax.swing.JButton();
        btSearch = new javax.swing.JButton();
        jLayeredPane5 = new javax.swing.JLayeredPane();

        setOpaque(false);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee Detail"));

        lbEmlpoyeeIDView.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmlpoyeeIDView.setText("Employee ID");
        lbEmlpoyeeIDView.setBounds(30, 30, 120, 15);
        jLayeredPane3.add(lbEmlpoyeeIDView, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeNameView.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeNameView.setText("Employee Name");
        lbEmployeeNameView.setBounds(30, 70, 140, 15);
        jLayeredPane3.add(lbEmployeeNameView, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtEmployeeName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmployeeNameFocusGained(evt);
            }
        });
        txtEmployeeName.setBounds(180, 70, 590, 25);
        jLayeredPane3.add(txtEmployeeName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeType1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeType1.setText("Employee Designation");
        lbEmployeeType1.setBounds(30, 110, 140, 15);
        jLayeredPane3.add(lbEmployeeType1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeAddress1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeAddress1.setText("Employee Address");
        lbEmployeeAddress1.setBounds(30, 160, 120, 15);
        jLayeredPane3.add(lbEmployeeAddress1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeContact1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeContact1.setText("Employee Contact");
        lbEmployeeContact1.setBounds(30, 280, 120, 15);
        jLayeredPane3.add(lbEmployeeContact1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtEmployeeContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmployeeContactKeyReleased(evt);
            }
        });
        txtEmployeeContact.setBounds(180, 280, 240, 25);
        jLayeredPane3.add(txtEmployeeContact, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtEmployeeNIC.setBounds(180, 320, 240, 25);
        jLayeredPane3.add(txtEmployeeNIC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeNIC1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeNIC1.setText("Employee NIC");
        lbEmployeeNIC1.setBounds(30, 320, 120, 15);
        jLayeredPane3.add(lbEmployeeNIC1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtEmployeeAddress.setColumns(20);
        txtEmployeeAddress.setRows(5);
        jScrollPane1.setViewportView(txtEmployeeAddress);

        jScrollPane1.setBounds(180, 160, 470, 100);
        jLayeredPane3.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbWarning.setForeground(new java.awt.Color(255, 0, 0));
        lbWarning.setBounds(500, 280, 180, 20);
        jLayeredPane3.add(lbWarning, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtEmployeeID.setEditable(false);
        txtEmployeeID.setOpaque(false);
        txtEmployeeID.setBounds(180, 30, 160, 25);
        jLayeredPane3.add(txtEmployeeID, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbEmployeeDesignationchange.setEditable(true);
        cmbEmployeeDesignationchange.setBounds(180, 110, 190, 30);
        jLayeredPane3.add(cmbEmployeeDesignationchange, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBounds(40, 150, 940, 360);
        jLayeredPane1.add(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeDesignation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeDesignation.setText("Employee Designation");
        lbEmployeeDesignation.setBounds(20, 60, 150, 20);
        jLayeredPane1.add(lbEmployeeDesignation, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbEmployeeDesignation.setEditable(true);
        cmbEmployeeDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeDesignationActionPerformed(evt);
            }
        });
        cmbEmployeeDesignation.setBounds(190, 60, 190, 30);
        jLayeredPane1.add(cmbEmployeeDesignation, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbEmployeeID.setEditable(true);
        cmbEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeIDActionPerformed(evt);
            }
        });
        cmbEmployeeID.setBounds(190, 110, 160, 30);
        jLayeredPane1.add(cmbEmployeeID, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeID.setText("Employee ID");
        lbEmployeeID.setBounds(20, 110, 90, 20);
        jLayeredPane1.add(lbEmployeeID, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeName.setText("Employee Name");
        lbEmployeeName.setBounds(400, 110, 120, 20);
        jLayeredPane1.add(lbEmployeeName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbEmployeeName.setEditable(true);
        cmbEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeNameActionPerformed(evt);
            }
        });
        cmbEmployeeName.setBounds(540, 110, 400, 30);
        jLayeredPane1.add(cmbEmployeeName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btChangeEmployeeDetail.setText("Change Employee Detail");
        btChangeEmployeeDetail.setBounds(820, 520, 160, 40);
        jLayeredPane1.add(btChangeEmployeeDetail, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btSearch.setText("View");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });
        btSearch.setBounds(430, 60, 110, 30);
        jLayeredPane1.add(btSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 60, 400, new javax.swing.ImageIcon(getClass().getResource("/pictures/employee/Change Employee.png")))); // NOI18N
        jLayeredPane5.setBounds(0, 0, 350, 60);
        jLayeredPane1.add(jLayeredPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployeeNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmployeeNameFocusGained
        txtEmployeeName.selectAll();
    }//GEN-LAST:event_txtEmployeeNameFocusGained

    private void txtEmployeeContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeContactKeyReleased
        ValidationValues.ValidateTP(txtEmployeeContact, lbWarning);
    }//GEN-LAST:event_txtEmployeeContactKeyReleased

    private void cmbEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeIDActionPerformed
        FillComboBox.fillComboComboDatabaseNextCombo(cmbEmployeeID, "Employee", "Employee_ID", "Employee_Name", cmbEmployeeName);
    }//GEN-LAST:event_cmbEmployeeIDActionPerformed

    private void cmbEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeNameActionPerformed
        FillComboBox.fillComboComboDatabaseNextCombo(cmbEmployeeName, "Employee", "Employee_Name", "Employee_ID", cmbEmployeeID);
    }//GEN-LAST:event_cmbEmployeeNameActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        clear();
        viewEmployeeDetail();
    }//GEN-LAST:event_btSearchActionPerformed

    private void cmbEmployeeDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeDesignationActionPerformed
        if (cmbEmployeeDesignation.getSelectedItem().equals("All Designation")) {
            FillComboBox.fillComboDatabase(cmbEmployeeID, "Employee", "Employee_ID");
            FillComboBox.fillComboDatabase(cmbEmployeeName, "Employee", "Employee_Name");
        }else{
            FillComboBox.fillComboComboDatabaseFillter(cmbEmployeeID, "Employee", "EmployeeType", "Employee_ID", "Employee_Type_Name", cmbEmployeeDesignation);
            FillComboBox.fillComboComboDatabaseFillter(cmbEmployeeName, "Employee", "EmployeeType", "Employee_Name", "Employee_Type_Name", cmbEmployeeDesignation);
        }
    }//GEN-LAST:event_cmbEmployeeDesignationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChangeEmployeeDetail;
    private javax.swing.JButton btSearch;
    private javax.swing.JComboBox cmbEmployeeDesignation;
    private javax.swing.JComboBox cmbEmployeeDesignationchange;
    private javax.swing.JComboBox cmbEmployeeID;
    private javax.swing.JComboBox cmbEmployeeName;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEmlpoyeeIDView;
    private javax.swing.JLabel lbEmployeeAddress1;
    private javax.swing.JLabel lbEmployeeContact1;
    private javax.swing.JLabel lbEmployeeDesignation;
    private javax.swing.JLabel lbEmployeeID;
    private javax.swing.JLabel lbEmployeeNIC1;
    private javax.swing.JLabel lbEmployeeName;
    private javax.swing.JLabel lbEmployeeNameView;
    private javax.swing.JLabel lbEmployeeType1;
    private javax.swing.JLabel lbWarning;
    private javax.swing.JTextArea txtEmployeeAddress;
    private javax.swing.JTextField txtEmployeeContact;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtEmployeeNIC;
    private javax.swing.JTextField txtEmployeeName;
    // End of variables declaration//GEN-END:variables
   private void viewEmployeeDetail(){
       Employee employee=new Employee();
       EmployeeType employeeType=new EmployeeType();
       employee.setEmployee_ID(cmbEmployeeID.getSelectedItem()+"");
        try {
            employee=EmployeeControl.SearchEmployee(employee);
            employeeType.setEmployee_Type_ID(employee.getEmployee_Type_ID());
            employeeType=EmployeeControl.SearchEmployeeTypewithID(employeeType);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ChangeEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ChangeEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtEmployeeID.setText(employee.getEmployee_ID());
        txtEmployeeName.setText(employee.getEmployee_Name());
        TextControl.getaddressTextArea(employee.getEmployee_Address(),txtEmployeeAddress);
        txtEmployeeContact.setText(employee.getEmployee_Contact());
        txtEmployeeNIC.setText(employee.getEmployee_NIC());
        FillComboBox.fillComboDatabase(cmbEmployeeDesignationchange, "EmployeeType", "Employee_Type_Name");
        System.out.println(employeeType.getEmployee_Type_Name());
        cmbEmployeeDesignationchange.setSelectedItem(employeeType.getEmployee_Type_Name());
   }
   private void clear(){
       txtEmployeeID.setText("");
       txtEmployeeName.setText("");
       txtEmployeeAddress.setText("");
       txtEmployeeContact.setText("");
       txtEmployeeNIC.setText("");
       cmbEmployeeDesignationchange.removeAllItems();
   }
}
