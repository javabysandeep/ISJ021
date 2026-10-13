import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo09CallableCreateProcedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(MysqlConstants.URL, MysqlConstants.USERNAME, MysqlConstants.PASSWORD);

        String query = "\t\t\tcreate procedure bulk_appointments()\n" +
                "\t\t\t\tbegin\n" +
                "\t\t\t\t\tinsert into appointments(name, meeting_time) values('A','2026-10-14-00:00:00');\n" +
                "\t\t\t\t\tinsert into appointments(name, meeting_time) values('B','2026-10-14-00:00:00');\n" +
                "\t\t\t\t\tinsert into appointments(name, meeting_time) values('C','2026-10-14-00:00:00');\n" +
                "\t\t\t\t\tinsert into appointments(name, meeting_time) values('D','2026-10-14-00:00:00');\n" +
                "end";

        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();
        callableStatement.close();
        connection.close();
        System.out.println("procedure created successfully");


    }

}
