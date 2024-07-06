package csi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class humanResourceOperation {

    Connection con;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    final private JTextField txtFirstName, txtLastName, txtEmail, txtContact, txtSalary;
    final private JTextArea txtAddress;
    final private JComboBox comboboxSex, comboboxDesignation, comboboxDepartment;
    final private JPasswordField txtPassword;

    public humanResourceOperation(JTextField txtFirstName, JTextField txtLastName, JTextField txtEmail, JTextField txtContact, JTextField txtSalary,
            JTextArea txtAddress, JComboBox comboboxSex, JComboBox comboboxDesignation, JComboBox comboboxDepartment, JPasswordField txtPassword) {
        this.txtFirstName = txtFirstName;
        this.txtLastName = txtLastName;
        this.txtEmail = txtEmail;
        this.txtContact = txtContact;
        this.txtAddress = txtAddress;
        this.comboboxSex = comboboxSex;
        this.comboboxDesignation = comboboxDesignation;
        this.comboboxDepartment = comboboxDepartment;
        this.txtPassword = txtPassword;
        this.txtSalary = txtSalary;
    }

    public boolean insertRecords() {

        try {

            if ((txtFirstName.getText().trim().isEmpty()
                    || txtLastName.getText().trim().isEmpty()
                    || txtEmail.getText().trim().isEmpty()
                    || txtPassword.getText().trim().isEmpty()
                    || txtContact.getText().trim().isEmpty()
                    || txtAddress.getText().trim().isEmpty()
                    || txtSalary.getText().trim().isEmpty()
                    || comboboxSex.getSelectedItem() == null
                    || comboboxDepartment.getSelectedItem() == null
                    || comboboxDesignation.getSelectedItem() == null)) {

                JOptionPane.showMessageDialog(null, "Please fill all the Required Details");

                return false;
            }

            String fName = txtFirstName.getText();
            String lName = txtLastName.getText();
            String email = txtEmail.getText();
            String password = String.valueOf(txtPassword.getText());
            String contact = String.valueOf(txtContact.getText());
            String address = String.valueOf(txtAddress.getText());
            String salary = String.valueOf(txtSalary.getText());
            String sex = (String) comboboxSex.getSelectedItem();
            if (comboboxSex.getSelectedIndex() == 0) {
                sex = "Male";
            } else if (comboboxSex.getSelectedIndex() == 1) {
                sex = "Female";
            } else if (comboboxSex.getSelectedIndex() == 2) {
                sex = "Prefer Unknown";
            }

            String department = (String) comboboxDepartment.getSelectedItem();

            if (comboboxDepartment.getSelectedIndex() == 0) {
                department = "Human Resource";
            } else if (comboboxDepartment.getSelectedIndex() == 1) {
                department = "Finance";
            } else if (comboboxDepartment.getSelectedIndex() == 2) {
                department = "Marketing";
            } else if (comboboxDepartment.getSelectedIndex() == 3) {
                department = "IT";
            }

            String designation = (String) comboboxDesignation.getSelectedItem();
            if (comboboxDesignation.getSelectedIndex() == 0) {
                designation = "Manager";
            } else if (comboboxDesignation.getSelectedIndex() == 1) {
                designation = "Executive";
            } else if (comboboxDesignation.getSelectedIndex() == 2) {
                designation = "Intern";
            }

            con = MyConnection.getConnection();
            String sql = "INSERT INTO `employees`( `firstname`, `lastname`, `email`, `password`, `address`, `contact`, `sex`, `designation`, `department`, `salary`) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)";
            preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, fName);
            preparedStatement.setString(2, lName);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5, contact);
            preparedStatement.setString(6, address);
            preparedStatement.setString(7, sex);
            preparedStatement.setString(8, designation);
            preparedStatement.setString(9, department);
            preparedStatement.setString(10, salary);

            preparedStatement.executeUpdate();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(humanResourceOperation.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "An Error Occured While Saving Data, Please Try Again");
        }

        return false;
    }
    public void resetForm(){
        
        txtFirstName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
        txtContact.setText("");
        txtAddress.setText("");
        comboboxSex.setSelectedItem(null);
        comboboxDesignation.setSelectedItem(null);
        comboboxDepartment.setSelectedItem(null);
        txtSalary.setText("");
        txtPassword.setText("");
        
    }

}
