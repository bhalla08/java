public class TEST_MULTITASKING1 extends Thread{
    public void run(){
        System.out.println("task one");
    }
    public static void main(String args[]){
        TEST_MULTITASKING1 t1=new TEST_MULTITASKING1();
        TEST_MULTITASKING1 t2=new TEST_MULTITASKING1();
        TEST_MULTITASKING1 t3=new TEST_MULTITASKING1();

        t1.start();
        t2.start();
        t3.start();
    }
}
