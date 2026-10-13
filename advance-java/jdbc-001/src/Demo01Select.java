import java.sql.*;

public class Demo01Select {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(MysqlConstants.URL, MysqlConstants.USERNAME, MysqlConstants.PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from appointments");
        System.out.println("id: \t\t name: \t\t meeting_time");
        while (resultSet.next()) {
          /*
            resultSet.getInt(1);
            resultSet.getString(2);
            resultSet.getString(3);
            */

            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String meetingTime = resultSet.getString("meeting_time");
            System.out.println(id + "\t\t " + name + "\t\t " + meetingTime);
        }
        connection.close();
    }
}
