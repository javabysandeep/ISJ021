import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo08InsertPreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the meeting time");
        String meetingTime = sc.next();

        System.out.println("Enter the meeting person name");
        String name = sc.next();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(MysqlConstants.URL, MysqlConstants.USERNAME, MysqlConstants.PASSWORD);
        String query = "insert into appointments(meeting_time, name) values(?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, meetingTime);
        preparedStatement.setString(2, name);

        preparedStatement.executeUpdate();

        System.out.println("inserted");
        connection.close();

    }
}
