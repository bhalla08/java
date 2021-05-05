public class TEST_SLEEP_METHOD extends Thread {
    public void run(){
        for(int i=1;i<5;i++){
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        TEST_SLEEP_METHOD t1=new TEST_SLEEP_METHOD();
        TEST_SLEEP_METHOD t2=new TEST_SLEEP_METHOD();

        t1.start();
        t2.start();
    }

}
/*
Sleep method in java
The sleep() method of Thread class is used to sleep a thread for the specified amount of time.

Syntax of sleep() method in java
The Thread class provides two methods for sleeping a thread:

public static void sleep(long miliseconds)throws InterruptedException
public static void sleep(long miliseconds, int nanos)throws InterruptedException
 */