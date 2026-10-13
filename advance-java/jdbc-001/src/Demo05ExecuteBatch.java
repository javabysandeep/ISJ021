import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo05ExecuteBatch {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(MysqlConstants.URL, MysqlConstants.USERNAME, MysqlConstants.PASSWORD);
        Statement statement = connection.createStatement();
        String query1 = "insert into appointments(name, meeting_time) values('saloni','2026-10-13-12:00')";
        String query2 = "insert into appointments(name, meeting_time) values('shravani','2026-10-13-13:00')";
        String query3 = "insert into appointments(name, meeting_time) values('vaibhav','2026-10-13-14:00')";
        String query4 = "insert into appointments(name, meeting_time) values('pratik','2026-10-13-15:00')";

        statement.addBatch(query1);
        statement.addBatch(query2);
        statement.addBatch(query3);
        statement.addBatch(query4);

        statement.executeBatch();

        System.out.println("bulk inserted");
        connection.close();

    }
}
