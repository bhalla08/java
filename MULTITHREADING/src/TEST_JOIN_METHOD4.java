public class TEST_JOIN_METHOD4 extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String args[]){
        TEST_JOIN_METHOD4 t1=new TEST_JOIN_METHOD4();
        TEST_JOIN_METHOD4 t2=new TEST_JOIN_METHOD4();

        t1.start();
        t2.start();
    }
}
//The currentThread() method returns a reference to the currently executing thread object.