/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accessory;

import componentControl.ValidationValues;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amila
 */
public class UpdateAccessoryDetail extends javax.swing.JPanel {
    double unitgetprice;
    DefaultTableModel dtm;
    AccessoryMain accessoryMain;
    JPanel pan;
    /**
     * Creates new form UpdateAccessoryDetail
     */
    public UpdateAccessoryDetail(AccessoryMain accessoryMain,JPanel pan) {
        initComponents();
        this.accessoryMain=accessoryMain;
        this.pan=pan;
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
        btUpdateitemaddDB = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        cmdUpdateitemcode = new javax.swing.JComboBox();
        cmbUpdateitemname = new javax.swing.JComboBox();
        lbSearchAccessoryDescription = new javax.swing.JLabel();
        lbSearchAccessoryCategoryName = new javax.swing.JLabel();
        cmbAccessoriesCategoryNameSearch = new javax.swing.JComboBox();
        lbSearchAccessoryCode = new javax.swing.JLabel();
        btadditemtable1 = new javax.swing.JButton();
        btAdditemRemoverow = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        txtqtyonhand = new javax.swing.JTextField();
        txtAccessoryDescription = new javax.swing.JTextField();
        txtUnitPurchasinhPrice = new javax.swing.JTextField();
        txtUnitIssuePrice = new javax.swing.JTextField();
        lbAccessoryCode = new javax.swing.JLabel();
        lbUnitPurchasingPrice = new javax.swing.JLabel();
        lbUnitIssuePrice = new javax.swing.JLabel();
        lbAccessoriesDescription = new javax.swing.JLabel();
        lbAccessoriesQtyOnHand = new javax.swing.JLabel();
        lbAccessoriesCategoryName = new javax.swing.JLabel();
        lbAccessorycode = new javax.swing.JLabel();
        cmbAccessoriesCategoryName = new javax.swing.JComboBox();
        btadditemtable = new javax.swing.JButton();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAccessory = new javax.swing.JTable();
        jLayeredPane6 = new javax.swing.JLayeredPane();

        setOpaque(false);

        btUpdateitemaddDB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btUpdateitemaddDB.setText("Update DB");
        btUpdateitemaddDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateitemaddDBActionPerformed(evt);
            }
        });
        btUpdateitemaddDB.setBounds(40, 520, 150, 40);
        jLayeredPane1.add(btUpdateitemaddDB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setBounds(0, 10, 0, 0);
        jLayeredPane1.add(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmdUpdateitemcode.setEditable(true);
        cmdUpdateitemcode.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmdUpdateitemcode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmdUpdateitemcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateitemcodeActionPerformed(evt);
            }
        });
        cmdUpdateitemcode.setBounds(30, 80, 160, 25);
        jLayeredPane3.add(cmdUpdateitemcode, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbUpdateitemname.setEditable(true);
        cmbUpdateitemname.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmbUpdateitemname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbUpdateitemname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUpdateitemnameActionPerformed(evt);
            }
        });
        cmbUpdateitemname.setBounds(240, 80, 310, 25);
        jLayeredPane3.add(cmbUpdateitemname, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbSearchAccessoryDescription.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbSearchAccessoryDescription.setText("Accessory Description");
        lbSearchAccessoryDescription.setBounds(220, 50, 150, 20);
        jLayeredPane3.add(lbSearchAccessoryDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbSearchAccessoryCategoryName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbSearchAccessoryCategoryName.setText("Accessory Category Name");
        lbSearchAccessoryCategoryName.setBounds(10, 10, 190, 20);
        jLayeredPane3.add(lbSearchAccessoryCategoryName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbAccessoriesCategoryNameSearch.setEditable(true);
        cmbAccessoriesCategoryNameSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbAccessoriesCategoryNameSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbAccessoriesCategoryNameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAccessoriesCategoryNameSearchActionPerformed(evt);
            }
        });
        cmbAccessoriesCategoryNameSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbAccessoriesCategoryNameSearchKeyReleased(evt);
            }
        });
        cmbAccessoriesCategoryNameSearch.setBounds(240, 10, 310, 25);
        jLayeredPane3.add(cmbAccessoriesCategoryNameSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbSearchAccessoryCode.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbSearchAccessoryCode.setText("Accessory Code");
        lbSearchAccessoryCode.setBounds(10, 50, 130, 20);
        jLayeredPane3.add(lbSearchAccessoryCode, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btadditemtable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btadditemtable1.setText("Search");
        btadditemtable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadditemtable1ActionPerformed(evt);
            }
        });
        btadditemtable1.setBounds(580, 80, 120, 30);
        jLayeredPane3.add(btadditemtable1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBounds(20, 60, 960, 110);
        jLayeredPane1.add(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btAdditemRemoverow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAdditemRemoverow.setText("Remove");
        btAdditemRemoverow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdditemRemoverowActionPerformed(evt);
            }
        });
        btAdditemRemoverow.setBounds(830, 500, 130, 30);
        jLayeredPane1.add(btAdditemRemoverow, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder("Accessory Detail"));

        txtqtyonhand.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtqtyonhand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtqtyonhand.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtqtyonhandFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtqtyonhandFocusLost(evt);
            }
        });
        txtqtyonhand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtqtyonhandKeyReleased(evt);
            }
        });
        txtqtyonhand.setBounds(780, 150, 110, 25);
        jLayeredPane4.add(txtqtyonhand, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtAccessoryDescription.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAccessoryDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAccessoryDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccessoryDescriptionActionPerformed(evt);
            }
        });
        txtAccessoryDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAccessoryDescriptionKeyReleased(evt);
            }
        });
        txtAccessoryDescription.setBounds(230, 110, 500, 25);
        jLayeredPane4.add(txtAccessoryDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtUnitPurchasinhPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUnitPurchasinhPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUnitPurchasinhPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPurchasinhPriceActionPerformed(evt);
            }
        });
        txtUnitPurchasinhPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUnitPurchasinhPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUnitPurchasinhPriceFocusLost(evt);
            }
        });
        txtUnitPurchasinhPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUnitPurchasinhPriceKeyReleased(evt);
            }
        });
        txtUnitPurchasinhPrice.setBounds(230, 150, 110, 25);
        jLayeredPane4.add(txtUnitPurchasinhPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtUnitIssuePrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUnitIssuePrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUnitIssuePrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUnitIssuePriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUnitIssuePriceFocusLost(evt);
            }
        });
        txtUnitIssuePrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUnitIssuePriceKeyReleased(evt);
            }
        });
        txtUnitIssuePrice.setBounds(520, 150, 110, 25);
        jLayeredPane4.add(txtUnitIssuePrice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbAccessoryCode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAccessoryCode.setText("Accessory Code");
        lbAccessoryCode.setBounds(40, 70, 130, 20);
        jLayeredPane4.add(lbAccessoryCode, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbUnitPurchasingPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbUnitPurchasingPrice.setText("Unit Purchasing Price");
        lbUnitPurchasingPrice.setBounds(40, 150, 150, 20);
        jLayeredPane4.add(lbUnitPurchasingPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbUnitIssuePrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbUnitIssuePrice.setText("Unit Issue Price");
        lbUnitIssuePrice.setBounds(380, 150, 130, 20);
        jLayeredPane4.add(lbUnitIssuePrice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbAccessoriesDescription.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAccessoriesDescription.setText("Accessories Description");
        lbAccessoriesDescription.setBounds(40, 110, 170, 20);
        jLayeredPane4.add(lbAccessoriesDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbAccessoriesQtyOnHand.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAccessoriesQtyOnHand.setText("Qty On Hand");
        lbAccessoriesQtyOnHand.setBounds(670, 150, 100, 20);
        jLayeredPane4.add(lbAccessoriesQtyOnHand, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbAccessoriesCategoryName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAccessoriesCategoryName.setText("Accessories Category Name");
        lbAccessoriesCategoryName.setBounds(40, 30, 190, 20);
        jLayeredPane4.add(lbAccessoriesCategoryName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbAccessorycode.setBackground(new java.awt.Color(255, 255, 255));
        lbAccessorycode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAccessorycode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbAccessorycode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbAccessorycodeKeyReleased(evt);
            }
        });
        lbAccessorycode.setBounds(230, 70, 160, 25);
        jLayeredPane4.add(lbAccessorycode, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbAccessoriesCategoryName.setEditable(true);
        cmbAccessoriesCategoryName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbAccessoriesCategoryName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbAccessoriesCategoryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAccessoriesCategoryNameActionPerformed(evt);
            }
        });
        cmbAccessoriesCategoryName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbAccessoriesCategoryNameKeyReleased(evt);
            }
        });
        cmbAccessoriesCategoryName.setBounds(230, 30, 310, 25);
        jLayeredPane4.add(cmbAccessoriesCategoryName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btadditemtable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btadditemtable.setText("Add Table");
        btadditemtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadditemtableActionPerformed(evt);
            }
        });
        btadditemtable.setBounds(820, 30, 120, 30);
        jLayeredPane4.add(btadditemtable, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane4.setBounds(20, 180, 960, 190);
        jLayeredPane1.add(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tbAccessory.setBackground(new java.awt.Color(0, 204, 255));
        tbAccessory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 1, true));
        tbAccessory.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tbAccessory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Accessory Code", "Accessory Name", "Description", "Unit Purchasing Price", "Unit Selling Price", "Qty On Hand", "Accessories Category Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAccessory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbAccessoryMouseReleased(evt);
            }
        });
        tbAccessory.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tbAccessoryMouseDragged(evt);
            }
        });
        tbAccessory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbAccessoryKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbAccessory);

        jScrollPane1.setBounds(0, 0, 960, 110);
        jLayeredPane5.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane5.setBounds(20, 380, 960, 110);
        jLayeredPane1.add(jLayeredPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 60, 400, new javax.swing.ImageIcon(getClass().getResource("/pictures/accessory/Update Accessories.png")))); // NOI18N
        jLayeredPane6.setBounds(0, 0, 290, 60);
        jLayeredPane1.add(jLayeredPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btUpdateitemaddDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateitemaddDBActionPerformed
       
    }//GEN-LAST:event_btUpdateitemaddDBActionPerformed

    private void cmdUpdateitemcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateitemcodeActionPerformed

    }//GEN-LAST:event_cmdUpdateitemcodeActionPerformed

    private void cmbUpdateitemnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUpdateitemnameActionPerformed

    }//GEN-LAST:event_cmbUpdateitemnameActionPerformed

    private void btAdditemRemoverowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdditemRemoverowActionPerformed
       // int rowid[] = itemUpdatetable.getSelectedRows();
      //  for (int i = 0; i < rowid.length; i++) {
        ///    Updateitemtable.removeRow(rowid[0]);
        //    itemUpdatetable.requestFocus();

        //}
    }//GEN-LAST:event_btAdditemRemoverowActionPerformed

    private void txtqtyonhandFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtqtyonhandFocusGained
        txtqtyonhand.selectAll();
    }//GEN-LAST:event_txtqtyonhandFocusGained

    private void txtqtyonhandFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtqtyonhandFocusLost
        String s = txtqtyonhand.getText();
        if (s.trim().isEmpty()) {
            txtqtyonhand.setText("0");
        }
    }//GEN-LAST:event_txtqtyonhandFocusLost

    private void txtqtyonhandKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqtyonhandKeyReleased
        ValidationValues.ValidateIntValue(txtqtyonhand);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_RIGHT) {
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            cmbAccessoriesCategoryName.requestFocus();
        }
    }//GEN-LAST:event_txtqtyonhandKeyReleased

    private void cmbAccessoriesCategoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAccessoriesCategoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAccessoriesCategoryNameActionPerformed

    private void cmbAccessoriesCategoryNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbAccessoriesCategoryNameKeyReleased

   }//GEN-LAST:event_cmbAccessoriesCategoryNameKeyReleased

    private void txtAccessoryDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccessoryDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccessoryDescriptionActionPerformed

    private void txtAccessoryDescriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccessoryDescriptionKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtUnitPurchasinhPrice.requestFocus();
        }
    }//GEN-LAST:event_txtAccessoryDescriptionKeyReleased

    private void txtUnitPurchasinhPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPurchasinhPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPurchasinhPriceActionPerformed

    private void txtUnitPurchasinhPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnitPurchasinhPriceFocusGained
        txtUnitPurchasinhPrice.selectAll();
    }//GEN-LAST:event_txtUnitPurchasinhPriceFocusGained

    private void txtUnitPurchasinhPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnitPurchasinhPriceFocusLost
        String s = txtUnitPurchasinhPrice.getText();
        if (s.trim().isEmpty()) {
            txtUnitPurchasinhPrice.setText("0.00");
        } else {
            s.trim();
            // s = ValidateValues.chooceDigits(s, 10, 1, 2, 2);
            txtUnitPurchasinhPrice.setText(s);
        }
    }//GEN-LAST:event_txtUnitPurchasinhPriceFocusLost

    private void txtUnitPurchasinhPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnitPurchasinhPriceKeyReleased
        ValidationValues.ValidateCurrency(txtUnitPurchasinhPrice);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            double unitget = Double.parseDouble(txtUnitPurchasinhPrice.getText());
            unitgetprice = unitget;
            txtUnitIssuePrice.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            txtAccessoryDescription.requestFocus();
        }
    }//GEN-LAST:event_txtUnitPurchasinhPriceKeyReleased

    private void txtUnitIssuePriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnitIssuePriceFocusGained
        txtUnitIssuePrice.selectAll();
    }//GEN-LAST:event_txtUnitIssuePriceFocusGained

    private void txtUnitIssuePriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnitIssuePriceFocusLost
        String s = txtUnitIssuePrice.getText();
        if (s.trim().isEmpty()) {
            txtUnitIssuePrice.setText("0.00");
        } else {
            s.trim();
            // s = ValidateValues.chooceDigits(s, 10, 1, 2, 2);
            txtUnitIssuePrice.setText(s);
        }
    }//GEN-LAST:event_txtUnitIssuePriceFocusLost

    private void txtUnitIssuePriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnitIssuePriceKeyReleased
        ValidationValues.ValidateCurrency(txtUnitIssuePrice);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER | evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            double unitsell = Double.parseDouble(txtUnitIssuePrice.getText());
            if (unitsell < unitgetprice) {
                JOptionPane.showMessageDialog(this, "Please Check Selling Price");
                txtUnitIssuePrice.requestFocus();
            } else {
                cmbAccessoriesCategoryName.requestFocus();
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            txtUnitPurchasinhPrice.requestFocus();
        }
    }//GEN-LAST:event_txtUnitIssuePriceKeyReleased

    private void lbAccessorycodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbAccessorycodeKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cmbAccessoriesCategoryName.requestFocus();
        }
    }//GEN-LAST:event_lbAccessorycodeKeyReleased

    private void btadditemtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadditemtableActionPerformed
        int showConfirmDialog = JOptionPane.showConfirmDialog(this, "Are You want to Update?", "Update Table", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (showConfirmDialog == 0) {
         //   Addtable();
        }
    }//GEN-LAST:event_btadditemtableActionPerformed

    private void tbAccessoryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAccessoryMouseReleased

   }//GEN-LAST:event_tbAccessoryMouseReleased

    private void tbAccessoryMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAccessoryMouseDragged
        //AddAccessorytableUpdate();
    }//GEN-LAST:event_tbAccessoryMouseDragged

    private void tbAccessoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbAccessoryKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAccessoryDescription.requestFocus();
        }
    }//GEN-LAST:event_tbAccessoryKeyReleased

    private void cmbAccessoriesCategoryNameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAccessoriesCategoryNameSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAccessoriesCategoryNameSearchActionPerformed

    private void cmbAccessoriesCategoryNameSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbAccessoriesCategoryNameSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAccessoriesCategoryNameSearchKeyReleased

    private void btadditemtable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadditemtable1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btadditemtable1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdditemRemoverow;
    private javax.swing.JButton btUpdateitemaddDB;
    private javax.swing.JButton btadditemtable;
    private javax.swing.JButton btadditemtable1;
    private javax.swing.JComboBox cmbAccessoriesCategoryName;
    private javax.swing.JComboBox cmbAccessoriesCategoryNameSearch;
    private javax.swing.JComboBox cmbUpdateitemname;
    private javax.swing.JComboBox cmdUpdateitemcode;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAccessoriesCategoryName;
    private javax.swing.JLabel lbAccessoriesDescription;
    private javax.swing.JLabel lbAccessoriesQtyOnHand;
    private javax.swing.JLabel lbAccessoryCode;
    private javax.swing.JLabel lbAccessorycode;
    private javax.swing.JLabel lbSearchAccessoryCategoryName;
    private javax.swing.JLabel lbSearchAccessoryCode;
    private javax.swing.JLabel lbSearchAccessoryDescription;
    private javax.swing.JLabel lbUnitIssuePrice;
    private javax.swing.JLabel lbUnitPurchasingPrice;
    private javax.swing.JTable tbAccessory;
    private javax.swing.JTextField txtAccessoryDescription;
    private javax.swing.JTextField txtUnitIssuePrice;
    private javax.swing.JTextField txtUnitPurchasinhPrice;
    private javax.swing.JTextField txtqtyonhand;
    // End of variables declaration//GEN-END:variables
}