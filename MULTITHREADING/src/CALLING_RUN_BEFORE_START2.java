public class CALLING_RUN_BEFORE_START2 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        CALLING_RUN_BEFORE_START2 t1=new CALLING_RUN_BEFORE_START2();
        CALLING_RUN_BEFORE_START2 t2=new CALLING_RUN_BEFORE_START2();

        t1.run();
        t2.run();
    }
}
