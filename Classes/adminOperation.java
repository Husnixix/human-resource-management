package csi;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class adminOperation {

    Connection con;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    private JTextField txtFirstName, txtLastName, txtEmail;
    private JPasswordField txtPassword;
    private JComboBox comboboxUsertype;
    private JTable jTable1;

    public adminOperation(JTextField txtFirstName, JTextField txtLastName, JTextField txtEmail, JPasswordField txtPassword, JComboBox comboboxUsertype, JTable jTable1) {

        this.txtFirstName = txtFirstName;
        this.txtLastName = txtLastName;
        this.txtEmail = txtEmail;
        this.txtPassword = txtPassword;
        this.comboboxUsertype = comboboxUsertype;
        this.jTable1 = jTable1;

    }

    public boolean insertRecords() {

        try {
            if ((txtFirstName.getText().trim().isEmpty()
                    || txtLastName.getText().trim().isEmpty()
                    || txtEmail.getText().trim().isEmpty()
                    || txtEmail.getText().trim().isEmpty()
                    || txtPassword.getText().trim().isEmpty()
                    || comboboxUsertype.getSelectedItem() == null)) {
                JOptionPane.showMessageDialog(null, "Please fill all the feilds");
                return false;
            }

            String fName = txtFirstName.getText();
            String lName = txtLastName.getText();
            String email = txtEmail.getText();
            String password = String.valueOf(txtPassword.getText());

            String userType = (String) comboboxUsertype.getSelectedItem();
            if (comboboxUsertype.getSelectedIndex() == 0) {
                userType = "Admin";
            } else if (comboboxUsertype.getSelectedIndex() == 1) {
                userType = "Human Resource";

            }

            con = MyConnection.getConnection(); // get connections

            String query = "INSERT INTO 'admin'(`firstname`, `lastname`, `email`, `password`, `usertype`) VALUES (?,?,?,?,?)";

            preparedStatement = con.prepareStatement(query);

            preparedStatement.setString(1, fName);
            preparedStatement.setString(2, lName);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5, userType);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(adminOperation.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error while inserting: " + ex.getMessage());
        }

        return true;

    }

    public void resetForm() {

        txtFirstName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        comboboxUsertype.setSelectedItem(null);
    }

    public void updateTable(Integer userId) {  // Changed int to Integer to handle null values
        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            con = MyConnection.getConnection();

            if (userId == null) {  // if no ID provided, fetch all
                preparedStatement = con.prepareStatement("SELECT id, firstname, lastname, email, usertype FROM `admin`");
            } else {  // fetch based on provided ID
                preparedStatement = con.prepareStatement("SELECT id, firstname, lastname,email, usertype FROM `admin` WHERE id = ?");
                preparedStatement.setInt(1, userId);
            }

            resultSet = preparedStatement.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            // Clear previous data
            model.setRowCount(0);

            while (resultSet.next()) {
                Object[] row = new Object[5];
                row[0] = resultSet.getInt("id");
                row[1] = resultSet.getString("firstname");
                row[2] = resultSet.getString("lastname");
                row[3] = resultSet.getString("email");
                row[4] = resultSet.getString("usertype");

                model.addRow(row);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();  // or you can show a user-friendly error message
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

}
