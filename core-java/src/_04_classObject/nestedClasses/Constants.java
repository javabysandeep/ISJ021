package _04_classObject.nestedClasses;

public class Constants {
    public static class Mysql {

        public static class Dev {
            public static final String USERNAME = "root";
            public static final String PASSWORD = "root";
        }

        public static class Prod {
            public static final String USERNAME = "root@prod";
            public static final String PASSWORD = "root@prod";
        }

    }

    public static class Oracle {
        public static class Dev {
            public static final String USERNAME = "oracle";
            public static final String PASSWORD = "oracle";
        }

        public static class Prod {
            public static final String USERNAME = "oracle@prod";
            public static final String PASSWORD = "oracle@prod";
        }
    }
}
