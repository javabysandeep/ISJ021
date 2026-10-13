import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo04InsertInto {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // step 01 : Load and register the Driver class provided by Mysql with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 02 : get the connection from DriverManager by providing url, username, password
        Connection connection =
                DriverManager.getConnection(MysqlConstants.URL, MysqlConstants.USERNAME, MysqlConstants.PASSWORD);


        // Step 03 : Get Statement Type Object using connection reference
        Statement statement = connection.createStatement();


        //Step 04 : Execute the query
        /*
            - executeQuery() ---> DQL [select, SHOW]
            - execute() ----> DDL [CREATE, ALTER, DROP,Truncate]
            - executeUpdate ---> DML [Insert, delete, update]
        */
        String query = "insert into appointments(name, meeting_time) values('samrat','2026-10-13-11:00')";
        statement.executeUpdate(query);

        System.out.println("record inserted");

        //Step 05 : Close the Connection


    }
}
