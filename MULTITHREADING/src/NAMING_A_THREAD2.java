public class NAMING_A_THREAD2 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[]){
        NAMING_A_THREAD2 t1=new NAMING_A_THREAD2();
        NAMING_A_THREAD2 t2=new NAMING_A_THREAD2();

        t1.start();
        t2.start();
    }
}
