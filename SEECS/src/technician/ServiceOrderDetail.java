/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ServiceOrderDetail.java
 *
 * Created on Feb 18, 2012, 3:44:47 PM
 */

package technician;

import control.ServiceOrderControl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import model.Condition;
import model.Customer;
import model.ServiceItem;
import model.ServiceOrder;

/**
 *
 * @author Amila Karunathilaka
 */
public class ServiceOrderDetail extends javax.swing.JDialog {
    Map<String, Object> modelList;
    ServiceOrder serviceOrder;
    java.awt.Frame parent;
    /** Creates new form ServiceOrderDetail */
    public ServiceOrderDetail(java.awt.Frame parent, boolean modal,ServiceOrder serviceOrder) {
        super(parent, modal);
        initComponents();
        this.serviceOrder=serviceOrder;
        this.parent=parent;
        viewServiceOrder();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        lbCustName = new javax.swing.JLabel();
        lbCustAddress = new javax.swing.JLabel();
        lbContactNo = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtCustAddress = new javax.swing.JTextField();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        lbItemCondition = new javax.swing.JLabel();
        txtItemDescription = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listItemCondition = new javax.swing.JList();
        lbItemDescrription = new javax.swing.JLabel();
        txtSerialNo = new javax.swing.JTextField();
        lbItemModelNo = new javax.swing.JLabel();
        lbItemSerialNo = new javax.swing.JLabel();
        lbItemBrandName = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        txtModelNo = new javax.swing.JTextField();
        btAddNewJob = new javax.swing.JButton();
        lbServiceOrderID1 = new javax.swing.JLabel();
        txtServiceOrderID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 1, 14))); // NOI18N

        lbCustName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCustName.setText("Customer Name");
        lbCustName.setBounds(20, 40, 140, 15);
        jLayeredPane3.add(lbCustName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbCustAddress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCustAddress.setText("Customer Address");
        lbCustAddress.setBounds(20, 80, 140, 15);
        jLayeredPane3.add(lbCustAddress, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbContactNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbContactNo.setText("Contact No.");
        lbContactNo.setBounds(570, 40, 100, 15);
        jLayeredPane3.add(lbContactNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtCustName.setEditable(false);
        txtCustName.setBounds(190, 40, 340, 25);
        jLayeredPane3.add(txtCustName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtContactNo.setEditable(false);
        txtContactNo.setBounds(690, 40, 210, 25);
        jLayeredPane3.add(txtContactNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtCustAddress.setEditable(false);
        txtCustAddress.setBounds(190, 80, 490, 25);
        jLayeredPane3.add(txtCustAddress, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBounds(40, 140, 920, 130);
        jLayeredPane2.add(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 1, 14))); // NOI18N

        lbItemCondition.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbItemCondition.setText("Item Condition");
        lbItemCondition.setBounds(20, 110, 140, 15);
        jLayeredPane4.add(lbItemCondition, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtItemDescription.setEditable(false);
        txtItemDescription.setBounds(190, 70, 290, 25);
        jLayeredPane4.add(txtItemDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);

        listItemCondition.setEnabled(false);
        jScrollPane1.setViewportView(listItemCondition);

        jScrollPane1.setBounds(190, 110, 410, 120);
        jLayeredPane4.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbItemDescrription.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbItemDescrription.setText("Item Descrription");
        lbItemDescrription.setBounds(20, 70, 150, 15);
        jLayeredPane4.add(lbItemDescrription, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtSerialNo.setEditable(false);
        txtSerialNo.setBounds(690, 30, 210, 25);
        jLayeredPane4.add(txtSerialNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbItemModelNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbItemModelNo.setText("Model No ");
        lbItemModelNo.setBounds(20, 40, 110, 15);
        jLayeredPane4.add(lbItemModelNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbItemSerialNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbItemSerialNo.setText("Serial No");
        lbItemSerialNo.setBounds(570, 30, 80, 15);
        jLayeredPane4.add(lbItemSerialNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbItemBrandName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbItemBrandName.setText("Item Brand Name");
        lbItemBrandName.setBounds(570, 70, 120, 15);
        jLayeredPane4.add(lbItemBrandName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtBrandName.setEditable(false);
        txtBrandName.setBounds(690, 70, 210, 25);
        jLayeredPane4.add(txtBrandName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtModelNo.setEditable(false);
        txtModelNo.setBounds(190, 30, 190, 25);
        jLayeredPane4.add(txtModelNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane4.setBounds(40, 270, 920, 250);
        jLayeredPane2.add(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btAddNewJob.setText("Add New Job");
        btAddNewJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddNewJobActionPerformed(evt);
            }
        });
        btAddNewJob.setBounds(840, 533, 150, 30);
        jLayeredPane2.add(btAddNewJob, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbServiceOrderID1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbServiceOrderID1.setText("Service Order ID");
        lbServiceOrderID1.setBounds(20, 100, 110, 20);
        jLayeredPane2.add(lbServiceOrderID1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtServiceOrderID.setEditable(false);
        txtServiceOrderID.setBounds(150, 100, 160, 25);
        jLayeredPane2.add(txtServiceOrderID, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddNewJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddNewJobActionPerformed
        new AddJodDetail(parent, true, serviceOrder,this).setVisible(true);
    }//GEN-LAST:event_btAddNewJobActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ServiceOrderDetail dialog = new ServiceOrderDetail(new javax.swing.JFrame(), true,new ServiceOrder());
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddNewJob;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbContactNo;
    private javax.swing.JLabel lbCustAddress;
    private javax.swing.JLabel lbCustName;
    private javax.swing.JLabel lbItemBrandName;
    private javax.swing.JLabel lbItemCondition;
    private javax.swing.JLabel lbItemDescrription;
    private javax.swing.JLabel lbItemModelNo;
    private javax.swing.JLabel lbItemSerialNo;
    private javax.swing.JLabel lbServiceOrderID1;
    private javax.swing.JList listItemCondition;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtCustAddress;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtItemDescription;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtSerialNo;
    private javax.swing.JTextField txtServiceOrderID;
    // End of variables declaration//GEN-END:variables
    private void viewServiceOrder(){
        try {
            modelList = ServiceOrderControl.viewServiceOrder(serviceOrder);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServiceOrderDetail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceOrderDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
        serviceOrder=(ServiceOrder)modelList.get("ServiceOrder");
        Customer customer=(Customer)modelList.get("Customer");
        ServiceItem item=(ServiceItem)modelList.get("Item");
        ArrayList<Condition> conditionList=(ArrayList<Condition>)modelList.get("ConditionList");
        txtServiceOrderID.setText(serviceOrder.getService_Order_ID());
        txtCustName.setText(customer.getCustName());
        txtCustAddress.setText(customer.getCustAddress());
        txtContactNo.setText(customer.getContactNo());
        txtModelNo.setText(item.getModel_No());
        txtSerialNo.setText(item.getSerial_No());
        txtBrandName.setText(item.getItem_Brand_Name());
        txtItemDescription.setText(item.getDescription());
        DefaultListModel<String> dlm=new DefaultListModel<String>();
        for (Condition condition : conditionList) {
            dlm.addElement(condition.getCondition_Description());
        }
        listItemCondition.setModel(dlm);
       
    }
}
