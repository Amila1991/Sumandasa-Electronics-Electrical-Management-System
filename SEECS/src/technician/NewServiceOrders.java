/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJobs.java
 *
 * Created on Feb 16, 2012, 10:43:48 PM
 */

package technician;

import control.JobDetailControl;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.ServiceItem;
import model.ServiceOrder;

/**
 *
 * @author Amila Karunathilaka
 */
public class NewServiceOrders extends javax.swing.JPanel {
    TechnicianMain technicianMain;
    JPanel pan;
    Map<String, Object> newJobList;
    DefaultTableModel dtm;
    /** Creates new form NewJobs */
    public NewServiceOrders(TechnicianMain technicianMain,JPanel pan) {
        initComponents();
        this.technicianMain=technicianMain;
        this.pan=pan;
        dtm=(DefaultTableModel)tbNewServiceOrderDetails.getModel();
        setJobTable();
        tbNewServiceOrderDetails.requestFocus();
        checkButton();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNewServiceOrderDetails = new javax.swing.JTable();
        btCheckSelectServiceOrder = new javax.swing.JButton();

        tbNewServiceOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service Order ID", "Model No", "Brand Name", "Item Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbNewServiceOrderDetails.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tbNewServiceOrderDetailsMouseDragged(evt);
            }
        });
        tbNewServiceOrderDetails.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbNewServiceOrderDetailsKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbNewServiceOrderDetails);

        jScrollPane1.setBounds(30, 80, 930, 390);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btCheckSelectServiceOrder.setText("Check Select Service Order");
        btCheckSelectServiceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCheckSelectServiceOrderActionPerformed(evt);
            }
        });
        btCheckSelectServiceOrder.setBounds(773, 513, 210, 40);
        jLayeredPane1.add(btCheckSelectServiceOrder, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private void tbNewServiceOrderDetailsMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNewServiceOrderDetailsMouseDragged

    }//GEN-LAST:event_tbNewServiceOrderDetailsMouseDragged

    private void btCheckSelectServiceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCheckSelectServiceOrderActionPerformed
        ServiceOrder serviceOrder=new ServiceOrder(dtm.getValueAt(tbNewServiceOrderDetails.getSelectedRow(), 0)+"", null, null, null, 0.0, null);
        new ServiceOrderDetail(technicianMain, true, serviceOrder).setVisible(true);
    }//GEN-LAST:event_btCheckSelectServiceOrderActionPerformed

    private void tbNewServiceOrderDetailsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbNewServiceOrderDetailsKeyReleased
        if (evt.getKeyCode()==KeyEvent.VK_ENTER&&!(tbNewServiceOrderDetails.getRowCount()==0)) {
            ServiceOrder serviceOrder=new ServiceOrder(dtm.getValueAt(tbNewServiceOrderDetails.getSelectedRow(), 0)+"", null, null, null, 0.0, null);
            new ServiceOrderDetail(technicianMain, true, serviceOrder).setVisible(true);
        }
    }//GEN-LAST:event_tbNewServiceOrderDetailsKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCheckSelectServiceOrder;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbNewServiceOrderDetails;
    // End of variables declaration//GEN-END:variables

    private void setJobTable(){
        try {
            newJobList = JobDetailControl.checkNewJobs();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewServiceOrders.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewServiceOrders.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<ServiceItem> itemList=(ArrayList<ServiceItem>) newJobList.get("ItemList");
        ArrayList<ServiceOrder> serviceOrderList=(ArrayList<ServiceOrder>) newJobList.get("ServiceOrderList");
        for (int i = 0; i < itemList.size(); i++) {
            Object[] row={serviceOrderList.get(i).getService_Order_ID(),itemList.get(i).getModel_No(),itemList.get(i).getItem_Brand_Name(),itemList.get(i).getDescription()};
            dtm.addRow(row);
        }
    }
    
    private void checkButton(){
        if (tbNewServiceOrderDetails.getRowCount()==0) {
            btCheckSelectServiceOrder.setEnabled(false);
        }else{
            btCheckSelectServiceOrder.setEnabled(true);
        }
    }
}
