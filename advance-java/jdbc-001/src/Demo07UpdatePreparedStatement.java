import java.sql.*;
import java.util.Scanner;

public class Demo07UpdatePreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the appointment id you want to update");
        int id = sc.nextInt();

        System.out.println("Enter the meeting time you want to update");
        String meetingTime = sc.next();

        System.out.println("Enter the meeting person you want to update");
        String name = sc.next();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(MysqlConstants.URL, MysqlConstants.USERNAME, MysqlConstants.PASSWORD);
        String query = "update appointments set name=?, meeting_time=? where id=?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, name);
        preparedStatement.setString(2, meetingTime);
        preparedStatement.setInt(3, id);

        preparedStatement.executeUpdate();

        System.out.println("updated");
        connection.close();

    }
}
