import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo08DeletePreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the meeting id");
        int id = sc.nextInt();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(MysqlConstants.URL, MysqlConstants.USERNAME, MysqlConstants.PASSWORD);
        String query = "delete from appointments where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);

        preparedStatement.executeUpdate();

        System.out.println("deleted");
        connection.close();

    }
}
