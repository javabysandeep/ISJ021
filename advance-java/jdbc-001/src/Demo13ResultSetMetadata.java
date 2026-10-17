import java.sql.*;

public class Demo13ResultSetMetadata {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(MysqlConstants.URL, MysqlConstants.USERNAME, MysqlConstants.PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM appointments");

        ResultSetMetaData metaData = resultSet.getMetaData();
        System.out.println("Column count = "+metaData.getColumnCount());
        System.out.println("Column name = " + metaData.getColumnName(1));
        System.out.println("Column type = " + metaData.getColumnType(1));
        System.out.println("Table Name : "+metaData.getTableName(1));


        connection.close();

    }
}
