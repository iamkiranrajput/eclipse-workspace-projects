// EmployeeDao.java
package employeemanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import employeemanagement.entity.Employee;


public class EmployeeDao {
    public int registerEmployee(Employee employee) throws ClassNotFoundException {
        String query = "INSERT INTO employee" +
            "  (first_name, last_name, username, password, address, contact) VALUES " +
            " (?, ?, ?, ?,?,?);";

        int result = 0;

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JSPProject","root","8888");

            PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        	preparedStatement.setString(1, employee.getFirstName());
        	preparedStatement.setString(2, employee.getLastName());
        	preparedStatement.setString(3, employee.getUsername());
        	preparedStatement.setString(4, employee.getPassword());
        	preparedStatement.setString(5, employee.getAddress());
        	preparedStatement.setString(6, employee.getContact());


            System.out.println(preparedStatement);

            
            result = preparedStatement.executeUpdate();
//            HttpServletRequest request = null;
            if(result>0) {
//            	RequestDispatcher rd=request.getRequestDispatcher("/employeedetails.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
