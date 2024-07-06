package csi;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class loginForm extends javax.swing.JFrame {

    private String role; // declare the role
    Connection con;

    public loginForm(String role) { //when the user type button is clicked to remember the user type pass through a constructor
        initComponents();
        this.role = role;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnSIgnIn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/login.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 13, -1, -1));

        jButton1.setBackground(new java.awt.Color(66, 133, 244));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Go Back");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/008-gmail.png"))); // NOI18N
        jLabel1.setText("Email ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 71, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/014-reset-password.png"))); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 141, -1, -1));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 98, 200, 30));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 168, 200, 30));

        btnSIgnIn.setBackground(new java.awt.Color(66, 133, 244));
        btnSIgnIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSIgnIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSIgnIn.setText("SIGN IN");
        btnSIgnIn.setBorderPainted(false);
        btnSIgnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSIgnInActionPerformed(evt);
            }
        });
        jPanel2.add(btnSIgnIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 200, 33));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("LOG IN");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 13, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(416, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSIgnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSIgnInActionPerformed

        // Constants for roles
        final String roleAdmin = "Admin";
        final String roleHumanResource = "Human Resource";
        final String roleEmployee = "Employee";

        try {
            con = MyConnection.getConnection();
            String username = txtUsername.getText().trim();
            String password = String.valueOf(txtPassword.getText().trim());

            // Validate if the fields are empty
            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Email & Password");
                return;  // exit 
            }

            String query;
            if (roleAdmin.equals(role) || roleHumanResource.equals(role)) {
                query = "SELECT * FROM `admin` WHERE email=? AND password=?";
            } else if (roleEmployee.equals(role)) {
                query = "SELECT * FROM `employees` WHERE email=? AND password=?";
            } else {
                JOptionPane.showMessageDialog(null, "Access Denied");
                //clear feilds
                txtUsername.setText("");
                txtPassword.setText("");
                return;
            }

            // Use try-with-resources to auto-close PreparedStatement and ResultSet
            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setString(1, username);
                ps.setString(2, password);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        if (roleAdmin.equals(role) || roleHumanResource.equals(role)) {
                            String actualRole = rs.getString("usertype"); // validate if usertype is correctly accessing
                            if (!role.equals(actualRole)) {
                                JOptionPane.showMessageDialog(null, "Credentials valid but role does not match.");
                                //clear feilds
                                txtUsername.setText("");
                                txtPassword.setText("");
                                return;
                            }
                        }

                        // Since employees don't have usertype, we directly check their credentials.
                        switch (role) {
                            case roleAdmin:
                            case roleHumanResource:
                                this.dispose();
                                if (roleAdmin.equals(role)) {
                                    new adminDashboard().setVisible(true);
                                } else {
                                    new humanResourceDashboard().setVisible(true);
                                }
                                break;

                            case roleEmployee:
                                String logInEmail = rs.getString("email"); // get the login email to display the employee profile
                                this.dispose();
                                new employeeDashboard(logInEmail).setVisible(true); // pass and update in dashboard init to accept a constructor
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Invalid Credentials, Please try again");
                                //clear feilds
                                txtUsername.setText("");
                                txtPassword.setText("");
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Credentials, Please try again");
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSIgnInActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new userLogin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSIgnIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
