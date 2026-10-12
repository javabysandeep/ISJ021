import java.sql.*;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // step 01 : load and register the Driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        // step 02. get the connection from DriverManager by providing url, username, password
        String url = "jdbc:mysql://localhost:3306/hr";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //step 03 : to execute query we need method, method is present in Statement type. so create the Object
        Statement statement = connection.createStatement();

        //step 04: execute the query
        ResultSet resultSet = statement.executeQuery("select * from employees");

        //Step 05 : use the resultset
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            System.out.println("ID: " + id + "\tName: " + name);
        }

        //step 06 : close the connection
        connection.close();
    }
}
