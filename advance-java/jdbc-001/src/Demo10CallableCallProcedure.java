import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo10CallableCallProcedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(MysqlConstants.URL, MysqlConstants.USERNAME, MysqlConstants.PASSWORD);
        String query = "call bulk_appointments()";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();
        callableStatement.close();
        connection.close();
        System.out.println("procedure executed successfully");


    }

}
