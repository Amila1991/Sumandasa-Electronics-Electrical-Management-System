/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import componentControl.AutoGenerate;
import componentControl.FillComboBox;
import componentControl.ValidationValues;
import control.EmployeeControl;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Employee;
import model.EmployeeType;

/**
 *
 * @author Amila
 */
public class AddNewEmployee extends javax.swing.JPanel {
    EmployeeMain employeeMain;
    JPanel pan;
    /**
     * Creates new form AddNewEmployee
     */
    public AddNewEmployee(EmployeeMain employeeMain,JPanel pan) {
        initComponents();
        setDefault();
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
        lbEmlpoyeeID1 = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        lbEmployeeName1 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        lbEmployeeType1 = new javax.swing.JLabel();
        cmbEmployeeType = new javax.swing.JComboBox();
        lbEmployeeAddress1 = new javax.swing.JLabel();
        lbEmployeeContact1 = new javax.swing.JLabel();
        txtEmployeeContact = new javax.swing.JTextField();
        txtEmployeeNIC = new javax.swing.JTextField();
        lbEmployeeNIC1 = new javax.swing.JLabel();
        lbWarning = new javax.swing.JLabel();
        txtEmployeeAddress = new javax.swing.JTextField();
        btNewEmployee = new javax.swing.JButton();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        lbEmployeeID = new javax.swing.JLabel();
        cmbEmployeeID = new javax.swing.JComboBox();
        lbEmployeeName = new javax.swing.JLabel();
        cmbEmployeeName = new javax.swing.JComboBox();
        lbEmployeeDesignation = new javax.swing.JLabel();
        cmbEmployeeDesignation = new javax.swing.JComboBox();
        txtUserName = new javax.swing.JTextField();
        lbEmployeeName2 = new javax.swing.JLabel();
        lbEmployeeName3 = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        btCreateAccount = new javax.swing.JButton();

        setOpaque(false);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("New Employee Detail"));
        jLayeredPane3.setToolTipText("");

        lbEmlpoyeeID1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmlpoyeeID1.setText("New Employee ID");
        lbEmlpoyeeID1.setBounds(30, 40, 120, 15);
        jLayeredPane3.add(lbEmlpoyeeID1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtEmployeeID.setEditable(false);
        txtEmployeeID.setOpaque(false);
        txtEmployeeID.setBounds(180, 40, 160, 25);
        jLayeredPane3.add(txtEmployeeID, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeName1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeName1.setText("New Employee Name");
        lbEmployeeName1.setBounds(30, 90, 140, 15);
        jLayeredPane3.add(lbEmployeeName1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtEmployeeName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmployeeNameFocusGained(evt);
            }
        });
        txtEmployeeName.setBounds(180, 90, 480, 25);
        jLayeredPane3.add(txtEmployeeName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeType1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeType1.setText("Employee Designation");
        lbEmployeeType1.setBounds(30, 140, 140, 15);
        jLayeredPane3.add(lbEmployeeType1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbEmployeeType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Technician", "Cashier", "Assistant Technician" }));
        cmbEmployeeType.setBounds(180, 140, 180, 25);
        jLayeredPane3.add(cmbEmployeeType, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeAddress1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeAddress1.setText("Employee Address");
        lbEmployeeAddress1.setBounds(30, 190, 120, 15);
        jLayeredPane3.add(lbEmployeeAddress1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeContact1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeContact1.setText("Employee Contact");
        lbEmployeeContact1.setBounds(30, 240, 120, 15);
        jLayeredPane3.add(lbEmployeeContact1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtEmployeeContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmployeeContactKeyReleased(evt);
            }
        });
        txtEmployeeContact.setBounds(180, 240, 290, 25);
        jLayeredPane3.add(txtEmployeeContact, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtEmployeeNIC.setBounds(180, 290, 290, 25);
        jLayeredPane3.add(txtEmployeeNIC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeNIC1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeNIC1.setText("Employee NIC");
        lbEmployeeNIC1.setBounds(30, 290, 120, 15);
        jLayeredPane3.add(lbEmployeeNIC1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbWarning.setForeground(new java.awt.Color(255, 0, 0));
        lbWarning.setBounds(530, 310, 160, 20);
        jLayeredPane3.add(lbWarning, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtEmployeeAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmployeeAddressFocusGained(evt);
            }
        });
        txtEmployeeAddress.setBounds(180, 190, 710, 25);
        jLayeredPane3.add(txtEmployeeAddress, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btNewEmployee.setText("Create New Employee");
        btNewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewEmployeeActionPerformed(evt);
            }
        });
        btNewEmployee.setBounds(830, 320, 150, 30);
        jLayeredPane3.add(btNewEmployee, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBounds(30, 60, 1020, 360);
        jLayeredPane1.add(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 60, 400, new javax.swing.ImageIcon(getClass().getResource("/pictures/employee/Create New Employee.png")))); // NOI18N
        jLayeredPane5.setBounds(0, 0, 290, 60);
        jLayeredPane1.add(jLayeredPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Create User Name"));

        lbEmployeeID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeID.setText("Employee ID");
        lbEmployeeID.setBounds(20, 70, 90, 20);
        jLayeredPane2.add(lbEmployeeID, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbEmployeeID.setEditable(true);
        cmbEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeIDActionPerformed(evt);
            }
        });
        cmbEmployeeID.setBounds(190, 70, 160, 30);
        jLayeredPane2.add(cmbEmployeeID, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeName.setText("Employee Name");
        lbEmployeeName.setBounds(400, 70, 120, 20);
        jLayeredPane2.add(lbEmployeeName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbEmployeeName.setEditable(true);
        cmbEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeNameActionPerformed(evt);
            }
        });
        cmbEmployeeName.setBounds(540, 70, 400, 30);
        jLayeredPane2.add(cmbEmployeeName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeDesignation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeDesignation.setText("Employee Designation");
        lbEmployeeDesignation.setBounds(20, 20, 150, 20);
        jLayeredPane2.add(lbEmployeeDesignation, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbEmployeeDesignation.setEditable(true);
        cmbEmployeeDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeDesignationActionPerformed(evt);
            }
        });
        cmbEmployeeDesignation.setBounds(190, 20, 190, 30);
        jLayeredPane2.add(cmbEmployeeDesignation, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
        });
        txtUserName.setBounds(190, 120, 210, 25);
        jLayeredPane2.add(txtUserName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeName2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeName2.setText("Confirm Password");
        lbEmployeeName2.setBounds(30, 200, 140, 15);
        jLayeredPane2.add(lbEmployeeName2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbEmployeeName3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmployeeName3.setText("User Name");
        lbEmployeeName3.setBounds(30, 120, 140, 15);
        jLayeredPane2.add(lbEmployeeName3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPassword.setText("Password");
        lbPassword.setBounds(30, 160, 140, 15);
        jLayeredPane2.add(lbPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtConfirmPassword.setBounds(190, 200, 210, 20);
        jLayeredPane2.add(txtConfirmPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtPassword.setBounds(190, 160, 210, 20);
        jLayeredPane2.add(txtPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btCreateAccount.setText("Create Account");
        btCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateAccountActionPerformed(evt);
            }
        });
        btCreateAccount.setBounds(820, 200, 130, 30);
        jLayeredPane2.add(btCreateAccount, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBounds(30, 430, 1020, 240);
        jLayeredPane1.add(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployeeNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmployeeNameFocusGained
       txtEmployeeName.selectAll();
    }//GEN-LAST:event_txtEmployeeNameFocusGained

    private void txtEmployeeContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeContactKeyReleased
        ValidationValues.ValidateTP(txtEmployeeContact, lbWarning);
    }//GEN-LAST:event_txtEmployeeContactKeyReleased

    private void btNewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewEmployeeActionPerformed
        String employeeType=cmbEmployeeType.getSelectedItem()+"";
        if (employeeType.equals("Admin")) {
            new EmployeeConfirm(null, true, 1, this).setVisible(true);
        }else{
            addEmployee();
        }
    }//GEN-LAST:event_btNewEmployeeActionPerformed

    private void txtEmployeeAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmployeeAddressFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeAddressFocusGained

    private void cmbEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeIDActionPerformed
        FillComboBox.fillComboComboDatabaseNextCombo(cmbEmployeeID, "Employee", "Employee_ID", "Employee_Name", cmbEmployeeName);
    }//GEN-LAST:event_cmbEmployeeIDActionPerformed

    private void cmbEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeNameActionPerformed
        FillComboBox.fillComboComboDatabaseNextCombo(cmbEmployeeName, "Employee", "Employee_Name", "Employee_ID", cmbEmployeeID);
    }//GEN-LAST:event_cmbEmployeeNameActionPerformed

    private void cmbEmployeeDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeDesignationActionPerformed
        if (cmbEmployeeDesignation.getSelectedItem().equals("All Designation")) {
            FillComboBox.fillComboDatabase(cmbEmployeeID, "Employee", "Employee_ID");
            FillComboBox.fillComboDatabase(cmbEmployeeName, "Employee", "Employee_Name");
        } else {
            FillComboBox.fillComboComboDatabaseFillter(cmbEmployeeID, "Employee", "EmployeeType", "Employee_ID", "Employee_Type_Name", cmbEmployeeDesignation);
            FillComboBox.fillComboComboDatabaseFillter(cmbEmployeeName, "Employee", "EmployeeType", "Employee_Name", "Employee_Type_Name", cmbEmployeeDesignation);
        }
    }//GEN-LAST:event_cmbEmployeeDesignationActionPerformed

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameFocusGained

    private void btCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCreateAccountActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreateAccount;
    private javax.swing.JButton btNewEmployee;
    private javax.swing.JComboBox cmbEmployeeDesignation;
    private javax.swing.JComboBox cmbEmployeeID;
    private javax.swing.JComboBox cmbEmployeeName;
    private javax.swing.JComboBox cmbEmployeeType;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLabel lbEmlpoyeeID1;
    private javax.swing.JLabel lbEmployeeAddress1;
    private javax.swing.JLabel lbEmployeeContact1;
    private javax.swing.JLabel lbEmployeeDesignation;
    private javax.swing.JLabel lbEmployeeID;
    private javax.swing.JLabel lbEmployeeNIC1;
    private javax.swing.JLabel lbEmployeeName;
    private javax.swing.JLabel lbEmployeeName1;
    private javax.swing.JLabel lbEmployeeName2;
    private javax.swing.JLabel lbEmployeeName3;
    private javax.swing.JLabel lbEmployeeType1;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbWarning;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmployeeAddress;
    private javax.swing.JTextField txtEmployeeContact;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtEmployeeNIC;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
    private void setDefault(){
        txtEmployeeID.setText(AutoGenerate.getNextID("Employee", "Employee_ID", "E"));
    }
    public void addEmployee(){
        try {
            EmployeeType employeeType=new EmployeeType("", cmbEmployeeType.getSelectedItem()+"", "");
            employeeType=EmployeeControl.SearchEmployeeTypewithName(employeeType);
            Employee employee=new Employee(txtEmployeeID.getText(), txtEmployeeName.getText(), txtEmployeeAddress.getText(), txtEmployeeContact.getText(), txtEmployeeNIC.getText(),employeeType.getEmployee_Type_ID());
            int res=EmployeeControl.addEmployee(employee);
            if(res==1){
               JOptionPane.showMessageDialog(pan, "Employee Create OK...", "Success", JOptionPane.INFORMATION_MESSAGE);
           }else{
               JOptionPane.showMessageDialog(pan, "Employee Create Fail", "Fail", JOptionPane.ERROR_MESSAGE);
           }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNewEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddNewEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
