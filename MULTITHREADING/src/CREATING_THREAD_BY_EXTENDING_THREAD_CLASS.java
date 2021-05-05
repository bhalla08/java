public class CREATING_THREAD_BY_EXTENDING_THREAD_CLASS extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        CREATING_THREAD_BY_EXTENDING_THREAD_CLASS t1=new CREATING_THREAD_BY_EXTENDING_THREAD_CLASS();
        t1.start();
    }
}
