package csi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class employeeOperation {

    Connection con;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    final private String userEmail;
    final private JLabel labelFirstName, labelLastName, labelEmail, labelContact, labelSex, labelDesignation, labelDepartment, labelId, labelSalary;

    public employeeOperation(String userEmail, JLabel labelFirstName, JLabel labelLastName, JLabel labelEmail, JLabel labelContact,
            JLabel labelSex, JLabel labelDesignation, JLabel labelDepartment, JLabel labelId, JLabel labelSalary) {
        this.userEmail = userEmail;
        this.labelFirstName = labelFirstName;
        this.labelLastName = labelLastName;
        this.labelEmail = labelEmail;
        this.labelContact = labelContact;
        this.labelSex = labelSex;
        this.labelDesignation = labelDesignation;
        this.labelDepartment = labelDepartment;
        this.labelId = labelId;
        this.labelSalary = labelSalary;

    }

    public void updateprofie() {

        try {

            Connection con = MyConnection.getConnection();
            String query = "SELECT * FROM `employees`  WHERE email=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, userEmail);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                labelId.setText(rs.getString("id"));
                labelFirstName.setText(rs.getString("firstname"));
                labelLastName.setText(rs.getString("lastname"));
                labelEmail.setText(rs.getString("email"));
                labelContact.setText(rs.getString("contact"));
                labelSex.setText(rs.getString("sex"));
                labelDesignation.setText(rs.getString("designation"));
                labelDepartment.setText(rs.getString("department"));
                labelSalary.setText(rs.getString("salary"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(employeeOperation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
