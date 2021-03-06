/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grn;

import cashier.AddStock;
import cashier.CashierMain;
import componentControl.AutoGenerate;
import componentControl.FillComboBox;
import control.SalesItemControl;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.SalesItem;
import model.SalesItemType;

/**
 *
 * @author Amila
 */
public class AddNewItem extends javax.swing.JPanel {

    ArrayList<SalesItemType> salesItemTypeList = new ArrayList<SalesItemType>();
    ArrayList<SalesItem> addsalesItemList = new ArrayList<SalesItem>();
    DefaultTableModel dtm;
    GRN grn;
    AddGRN addGRN;
    JPanel pan;
    CashierMain cashierMain;
    AddStock addStock;

    /**
     * Creates new form AddNewItem
     */
    public AddNewItem(GRN grn, JPanel pan) {
        initComponents();
        this.grn = grn;
        this.pan = pan;
        dtm = (DefaultTableModel) tbSalesItem.getModel();
    }

    public AddNewItem(GRN grn, JPanel pan, AddGRN addGRN) {
        initComponents();
        this.grn = grn;
        this.pan = pan;
        this.addGRN = addGRN;
        dtm = (DefaultTableModel) tbSalesItem.getModel();
        clear();
    }
    public AddNewItem(CashierMain cashierMain, JPanel pan, AddStock addStock) {
        initComponents();
        this.cashierMain=cashierMain;
        this.pan = pan;
        this.addStock=addStock;
        dtm = (DefaultTableModel) tbSalesItem.getModel();
        clear();
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
        jLayeredPane4 = new javax.swing.JLayeredPane();
        lbItemType = new javax.swing.JLabel();
        lbModelNo = new javax.swing.JLabel();
        lbUnitPurchasePrice = new javax.swing.JLabel();
        txtModelNo = new javax.swing.JTextField();
        lbWarrenty = new javax.swing.JLabel();
        txtWarranty = new javax.swing.JTextField();
        lbUnitIssuePrice = new javax.swing.JLabel();
        txtUnitCreditIssuePrice = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        lbDescription = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        cmbItemType = new javax.swing.JComboBox();
        txtUnitPurchasePrice = new javax.swing.JTextField();
        cmbItemBrandName = new javax.swing.JComboBox();
        lbItemType1 = new javax.swing.JLabel();
        lbUnitIssuePrice1 = new javax.swing.JLabel();
        txtUnitCashIssuePrice = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSalesItem = new javax.swing.JTable();
        btaddSalesItemtoDB = new javax.swing.JButton();
        btRemove = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setOpaque(false);

        jLayeredPane3.setBounds(30, 280, 0, 0);
        jLayeredPane1.add(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbItemType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbItemType.setText("Item Type");
        lbItemType.setBounds(20, 20, 150, 15);
        jLayeredPane4.add(lbItemType, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbModelNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbModelNo.setText("Model No");
        lbModelNo.setBounds(20, 70, 170, 15);
        jLayeredPane4.add(lbModelNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbUnitPurchasePrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbUnitPurchasePrice.setText("Unit Purchase Price");
        lbUnitPurchasePrice.setBounds(20, 140, 130, 15);
        jLayeredPane4.add(lbUnitPurchasePrice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtModelNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtModelNo.setBounds(40, 90, 220, 30);
        jLayeredPane4.add(txtModelNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbWarrenty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbWarrenty.setText("Warranty");
        lbWarrenty.setBounds(370, 140, 100, 15);
        jLayeredPane4.add(lbWarrenty, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtWarranty.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtWarranty.setBounds(520, 130, 180, 30);
        jLayeredPane4.add(txtWarranty, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbUnitIssuePrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbUnitIssuePrice.setText("Unit Credit Issue Price");
        lbUnitIssuePrice.setBounds(20, 180, 150, 15);
        jLayeredPane4.add(lbUnitIssuePrice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtUnitCreditIssuePrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUnitCreditIssuePrice.setBounds(170, 170, 180, 30);
        jLayeredPane4.add(txtUnitCreditIssuePrice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btAdd.setText("Add Table");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        btAdd.setBounds(880, 170, 110, 30);
        jLayeredPane4.add(btAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbDescription.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDescription.setText("Description");
        lbDescription.setBounds(310, 70, 110, 15);
        jLayeredPane4.add(lbDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });
        txtDescription.setBounds(330, 90, 490, 30);
        jLayeredPane4.add(txtDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbItemType.setEditable(true);
        cmbItemType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbItemTypeItemStateChanged(evt);
            }
        });
        cmbItemType.setBounds(40, 40, 220, 30);
        jLayeredPane4.add(cmbItemType, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtUnitPurchasePrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUnitPurchasePrice.setBounds(170, 130, 180, 30);
        jLayeredPane4.add(txtUnitPurchasePrice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbItemBrandName.setEditable(true);
        cmbItemBrandName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbItemBrandNameItemStateChanged(evt);
            }
        });
        cmbItemBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbItemBrandNameActionPerformed(evt);
            }
        });
        cmbItemBrandName.setBounds(330, 40, 220, 30);
        jLayeredPane4.add(cmbItemBrandName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbItemType1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbItemType1.setText("Item Brand Name");
        lbItemType1.setBounds(290, 20, 150, 15);
        jLayeredPane4.add(lbItemType1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbUnitIssuePrice1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbUnitIssuePrice1.setText("Unit Cash Issue Price");
        lbUnitIssuePrice1.setBounds(370, 180, 140, 15);
        jLayeredPane4.add(lbUnitIssuePrice1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtUnitCashIssuePrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUnitCashIssuePrice.setBounds(520, 170, 180, 30);
        jLayeredPane4.add(txtUnitCashIssuePrice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane4.setBounds(10, 60, 1080, 210);
        jLayeredPane1.add(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setMinimumSize(new java.awt.Dimension(960, 400));
        jLayeredPane2.setPreferredSize(new java.awt.Dimension(960, 500));

        tbSalesItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model No", "Brand Name", "Description", "Unit Purchase Price", "Unit Cash Issue Price", "Unit Credit Issue Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbSalesItem);
        tbSalesItem.getColumnModel().getColumn(0).setPreferredWidth(150);
        tbSalesItem.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbSalesItem.getColumnModel().getColumn(2).setPreferredWidth(300);
        tbSalesItem.getColumnModel().getColumn(3).setPreferredWidth(150);
        tbSalesItem.getColumnModel().getColumn(4).setPreferredWidth(150);
        tbSalesItem.getColumnModel().getColumn(5).setPreferredWidth(150);

        jScrollPane1.setBounds(20, 10, 1040, 200);
        jLayeredPane2.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btaddSalesItemtoDB.setText("Submit");
        btaddSalesItemtoDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddSalesItemtoDBActionPerformed(evt);
            }
        });
        btaddSalesItemtoDB.setBounds(950, 290, 120, 40);
        jLayeredPane2.add(btaddSalesItemtoDB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btRemove.setText("Remove");
        btRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveActionPerformed(evt);
            }
        });
        btRemove.setBounds(910, 220, 110, 30);
        jLayeredPane2.add(btRemove, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        btBack.setBounds(820, 290, 110, 40);
        jLayeredPane2.add(btBack, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBounds(10, 290, 1080, 350);
        jLayeredPane1.add(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 32)); // NOI18N
        jLabel3.setText("Add New Item");
        jLabel3.setBounds(30, 0, 250, 50);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        addTable();
    }//GEN-LAST:event_btAddActionPerformed

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void cmbItemTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbItemTypeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbItemTypeItemStateChanged

    private void btaddSalesItemtoDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddSalesItemtoDBActionPerformed
        addDB();
        allclear();
    }//GEN-LAST:event_btaddSalesItemtoDBActionPerformed

    private void cmbItemBrandNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbItemBrandNameItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbItemBrandNameItemStateChanged

    private void cmbItemBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbItemBrandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbItemBrandNameActionPerformed

    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRemoveActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        this.setVisible(false);
        pan.removeAll();
        addStock.setVisible(true);
        pan.add(addStock);
        pan.revalidate();
    }//GEN-LAST:event_btBackActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btBack;
    private javax.swing.JButton btRemove;
    private javax.swing.JButton btaddSalesItemtoDB;
    private javax.swing.JComboBox cmbItemBrandName;
    private javax.swing.JComboBox cmbItemType;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbItemType;
    private javax.swing.JLabel lbItemType1;
    private javax.swing.JLabel lbModelNo;
    private javax.swing.JLabel lbUnitIssuePrice;
    private javax.swing.JLabel lbUnitIssuePrice1;
    private javax.swing.JLabel lbUnitPurchasePrice;
    private javax.swing.JLabel lbWarrenty;
    private javax.swing.JTable tbSalesItem;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtUnitCashIssuePrice;
    private javax.swing.JTextField txtUnitCreditIssuePrice;
    private javax.swing.JTextField txtUnitPurchasePrice;
    private javax.swing.JTextField txtWarranty;
    // End of variables declaration//GEN-END:variables

    private void addDB() {
        try {
            for (SalesItemType salesItemType : salesItemTypeList) {
                SalesItemControl.addItemType(salesItemType);
            }
            for (SalesItem salesItem : addsalesItemList) {
                SalesItemControl.addSalesItem(salesItem);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNewItem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddNewItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        salesItemTypeList = new ArrayList<SalesItemType>();
        addsalesItemList = new ArrayList<SalesItem>();
    }

    private void addTable() {
        try {
            String modelNo = txtModelNo.getText();
            String description = txtDescription.getText();
            String barndName = cmbItemBrandName.getSelectedItem() + "";
            double purchsePrice = Double.parseDouble(txtUnitPurchasePrice.getText());
            double cashIssuePrice = Double.parseDouble(txtUnitCashIssuePrice.getText());
            double creditIssuePrice = Double.parseDouble(txtUnitCreditIssuePrice.getText());
            String warrenty = txtWarranty.getText();
            String itemTypeCode = SalesItemControl.getSalesTypeItem(cmbItemType.getSelectedItem() + "").getItemType_Code();

            if (SalesItemControl.getSalesTypeItem(cmbItemType.getSelectedItem() + "").getItemType_Code() == null) {
                System.out.println("aaaaa");
                itemTypeCode = AutoGenerate.getNextIDLoop("SalesItemType", "ItemType_Code", "SIT",salesItemTypeList.size());
                SalesItemType salesItemType = new SalesItemType(itemTypeCode, cmbItemType.getSelectedItem() + "", null);
                salesItemTypeList.add(salesItemType);
            } else {
                System.out.println("bbbbbbb");
                itemTypeCode = SalesItemControl.getSalesTypeItem(cmbItemType.getSelectedItem() + "").getItemType_Code();
            }

            SalesItem salesItem = new SalesItem(modelNo, description, barndName, purchsePrice, cashIssuePrice,creditIssuePrice, 0, warrenty, itemTypeCode);
            addsalesItemList.add(salesItem);
            Object[] ob = {modelNo, barndName, description, purchsePrice, cashIssuePrice,creditIssuePrice};
            dtm.addRow(ob);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNewItem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddNewItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        clear();
    }

    private void comboControl() {
        JTextField txt = (JTextField) cmbItemType.getEditor().getEditorComponent();
        txt.addKeyListener(new KeyAdapter() {

            public void keyReleased(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_RIGHT || evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cmbItemBrandName.requestFocus();
                    //checkEmpty();
                } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
                    //txtSerialNo.requestFocus();
                    //checkEmpty();
                }
            }
        });

    }
    private void clear(){
        FillComboBox.fillComboDatabase(cmbItemType, "SalesItemType", "ItemType_Name");
        FillComboBox.fillComboDatabase(cmbItemBrandName, "SalesItem GROUP BY Item_Brand_Name", "Item_Brand_Name");
        txtModelNo.setText("");
        txtDescription.setText("");
        txtUnitPurchasePrice.setText("");
        txtUnitCreditIssuePrice.setText("");
        txtWarranty.setText("");

    }
    private void allclear(){
        FillComboBox.fillComboDatabase(cmbItemType, "SalesItemType", "ItemType_Name");
        FillComboBox.fillComboDatabase(cmbItemBrandName, "SalesItem GROUP BY Item_Brand_Name", "Item_Brand_Name");
        txtModelNo.setText("");
        txtDescription.setText("");
        txtUnitPurchasePrice.setText("");
        txtUnitCreditIssuePrice.setText("");
        txtWarranty.setText("");
        int rowconut=tbSalesItem.getRowCount();
        for (int i = 0; i < rowconut; i++) {
            dtm.removeRow(0);
        }
        
    }
}
