

public class REENTRANT_EXAMPLE1 {
    public static void main(String args[]) {
        final REENTRANT_EXAMPLE1 re = new REENTRANT_EXAMPLE1();

        Thread t1 = new Thread() {
            public void run() {

             //   re.m();//calling method of Reentrant class
            }
        };
        t1.start();

    }
}