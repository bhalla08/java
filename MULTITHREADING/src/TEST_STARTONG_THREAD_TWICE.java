public class TEST_STARTONG_THREAD_TWICE extends Thread {
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        TEST_STARTONG_THREAD_TWICE t1=new TEST_STARTONG_THREAD_TWICE();
        t1.start();
        t1.start();
    }
}


/*
Can we start a thread twice
No. After starting a thread, it can never be started again. If you does so, an IllegalThreadStateException is thrown.
In such case, thread will run once but for second time, it will throw exception.
 */