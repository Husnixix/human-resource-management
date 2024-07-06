package csi;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import javax.swing.JOptionPane;

public class adminDashboard extends javax.swing.JFrame {

    public adminDashboard() {
        initComponents();
        adminOperation adminoperation = new adminOperation(txtFirstName, txtLastName, txtEmail, txtPassword, comboboxUsertype, jTable1);
        adminoperation.updateTable(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        parent = new javax.swing.JLayeredPane();
        home = new javax.swing.JPanel();
        signUpForm = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        comboboxUsertype = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JPasswordField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        update = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtSearchId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(66, 133, 244));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("User Management");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, -1));

        jButton3.setBackground(new java.awt.Color(66, 133, 244));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Log Out");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 160, -1));

        btnUpdate.setBackground(new java.awt.Color(66, 133, 244));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Manage");
        btnUpdate.setBorderPainted(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 160, -1));

        parent.setLayout(new java.awt.CardLayout());

        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        parent.add(home, "card2");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("First Name");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 99, -1, -1));

        jLabel3.setText("Email");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 159, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Password");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 215, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("User Type");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 294, -1, -1));

        txtFirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel4.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, 125, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel4.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 182, 220, -1));

        comboboxUsertype.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboboxUsertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Human Resource" }));
        comboboxUsertype.setSelectedIndex(-1);
        comboboxUsertype.setToolTipText("");
        jPanel4.add(comboboxUsertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 291, 147, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel4.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 242, 220, -1));

        btnSave.setBackground(new java.awt.Color(66, 133, 244));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorderPainted(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel4.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 87, -1));

        btnCancel.setBackground(new java.awt.Color(66, 133, 244));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setBorderPainted(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 94, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Last Name");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 99, -1, -1));

        txtLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel4.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 125, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("SIGN UP");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 13, -1, -1));

        jButton2.setBackground(new java.awt.Color(66, 133, 244));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Go Back");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        javax.swing.GroupLayout signUpFormLayout = new javax.swing.GroupLayout(signUpForm);
        signUpForm.setLayout(signUpFormLayout);
        signUpFormLayout.setHorizontalGroup(
            signUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );
        signUpFormLayout.setVerticalGroup(
            signUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        parent.add(signUpForm, "card3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Email", "User Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton4.setBackground(new java.awt.Color(66, 133, 244));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Remove");
        jButton4.setBorderPainted(false);

        jButton5.setBackground(new java.awt.Color(66, 133, 244));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Update");
        jButton5.setBorderPainted(false);

        txtSearchId.setForeground(new java.awt.Color(153, 153, 153));
        txtSearchId.setText("Enter ID");
        txtSearchId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchIdFocusLost(evt);
            }
        });
        txtSearchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchIdActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(66, 133, 244));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setBorderPainted(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/loading-arrow.png"))); // NOI18N
        btnRefresh.setBorderPainted(false);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh))
                    .addGroup(updateLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE))))
                .addContainerGap())
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefresh)
                    .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(35, 35, 35))
        );

        parent.add(update, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parent))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(parent)
        );

        setSize(new java.awt.Dimension(766, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        parent.removeAll();
        parent.add(signUpForm);
        parent.repaint();
        parent.revalidate();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        try {
            adminOperation adminoperation = new adminOperation(txtFirstName, txtLastName, txtEmail, txtPassword, comboboxUsertype, jTable1);

            boolean isSucess = adminoperation.insertRecords();

            if (isSucess) {
                JOptionPane.showMessageDialog(null, "Record inserted successfully!");
                adminoperation.resetForm();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An Error Occured,Please Try again");
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        parent.removeAll();
        parent.add(home);
        parent.repaint();
        parent.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int response = JOptionPane.showConfirmDialog(this, "Are you to Log Out");

        if (response == JOptionPane.YES_OPTION) {
            this.dispose();
            new userLogin().setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        adminOperation adminoperation = new adminOperation(txtFirstName, txtLastName, txtEmail, txtPassword, comboboxUsertype, jTable1);

        int response = JOptionPane.showConfirmDialog(this, "Are you sure to cancel? current information will be deleted");
        if (response == JOptionPane.YES_OPTION) {

            adminoperation.resetForm();

        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        parent.removeAll();
        parent.add(update);
        parent.repaint();
        parent.revalidate();

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSearchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchIdActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSearchIdActionPerformed

    private void txtSearchIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchIdFocusGained
        // TODO add your handling code here:\
        if (txtSearchId.getText().equals("Enter ID")) {
            txtSearchId.setText("");
        }

    }//GEN-LAST:event_txtSearchIdFocusGained

    private void txtSearchIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchIdFocusLost
        // TODO add your handling code here:
        if (txtSearchId.getText().equals("")) {
            txtSearchId.setText("Enter ID");
        }
    }//GEN-LAST:event_txtSearchIdFocusLost

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        Integer userId = null;  // use Integer to allow for null values

        try {
            if (!txtSearchId.getText().isEmpty()) {  // only parse if text field is not empty
                userId = Integer.parseInt(txtSearchId.getText());
            }
            adminOperation adminoperation = new adminOperation(txtFirstName, txtLastName, txtEmail, txtPassword, comboboxUsertype, jTable1);
            adminoperation.updateTable(userId);
        } catch (NumberFormatException ex) {
            // Handle the case where the entered text is not a valid integer
            JOptionPane.showMessageDialog(null, "Please enter a valid ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        adminOperation adminoperation = new adminOperation(txtFirstName, txtLastName, txtEmail, txtPassword, comboboxUsertype, jTable1);
        adminoperation.updateTable(null);
    }//GEN-LAST:event_btnRefreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboboxUsertype;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLayeredPane parent;
    private javax.swing.JPanel signUpForm;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSearchId;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
