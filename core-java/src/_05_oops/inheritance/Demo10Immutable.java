package _05_oops.inheritance;

import java.util.Date;

public class Demo10Immutable {
    public static void main(String[] args) {
        final class Immutable {
            private final int a;
            private final int b;
            private final Date joiningDate;

            Immutable(int a, int b, Date joiningDate) {
                this.a = a;
                this.b = b;
                this.joiningDate = joiningDate;
            }

            public Date getJoiningDate() {
              //  return joiningDate;
                return new  Date(joiningDate.getTime()); //defensive copy
            }
        }
        Immutable im = new Immutable(1, 2, new Date());
        //im.a = 100;
        //im.b = 200;
    }
}
