import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo12DatabaseMetadata {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(MysqlConstants.URL, MysqlConstants.USERNAME, MysqlConstants.PASSWORD);
        DatabaseMetaData metaData = connection.getMetaData();

        System.out.println("Driver name: " + metaData.getDriverName());
        System.out.println("Driver version: " + metaData.getDriverVersion());
        System.out.println("Driver url: " + metaData.getURL());
        System.out.println("Driver username: " + metaData.getUserName());
        System.out.println("Database Version: " + metaData.getDatabaseMajorVersion());

        connection.close();

    }
}
