package _05_oops;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(ConnectionUtil.getConnection());
    }
}

class ConnectionUtil {
    private static String connection = "database connection";

    public static String getConnection() {
        return connection;
    }
}