import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo06Update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the appointment id you want to update");
        int id = sc.nextInt();

        System.out.println("Enter the meeting time you want to update");
        String meetingTime = sc.next();

        System.out.println("Enter the meeting person you want to update");
        String person = sc.next();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(MysqlConstants.URL, MysqlConstants.USERNAME, MysqlConstants.PASSWORD);
        Statement statement = connection.createStatement();
        String query = "update appointments set name='" + person + "', meeting_time='" + meetingTime + "' where id=" + id;
        statement.executeUpdate(query);
        System.out.println("updated");
        connection.close();

    }
}
