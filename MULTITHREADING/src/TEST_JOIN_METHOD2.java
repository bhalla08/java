public class TEST_JOIN_METHOD2 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        TEST_JOIN_METHOD2 t1=new TEST_JOIN_METHOD2();
        TEST_JOIN_METHOD2 t2=new TEST_JOIN_METHOD2();
        TEST_JOIN_METHOD2 t3=new TEST_JOIN_METHOD2();
        t1.start();
        try{
            t1.join(1500);
        }catch(Exception e){System.out.println(e);}

        t2.start();
        t3.start();
    }
}
