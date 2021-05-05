
public class DAEMON_THREADS2 extends Thread {
    public void run(){
        System.out.println("Name: "+Thread.currentThread().getName());
        System.out.println("Daemon: "+Thread.currentThread().isDaemon());
    }

    public static void main(String[] args){
        DAEMON_THREADS2 t1=new DAEMON_THREADS2();
        DAEMON_THREADS2 t2=new DAEMON_THREADS2();
        t1.start();
        t1.setDaemon(true);//will throw exception here
        t2.start();
    }
}
