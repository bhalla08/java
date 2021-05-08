class Table4{
    synchronized static void printTable(int n){
        for(int i=1;i<=10;i++){
        System.out.println(n*i);
        try{
        Thread.sleep(400);
        }catch(Exception e){}
        }
        }
        }

class MyThread21 extends Thread{
    public void run(){
        Table4.printTable(1);
    }
}

class MyThread22 extends Thread{
    public void run(){
        Table4.printTable(10);
    }
}

class MyThread23 extends Thread{
    public void run(){
        Table4.printTable(100);
    }
}




class MyThread24 extends Thread{
    public void run(){
        Table4.printTable(1000);
    }
}
public class TEST_STATIC_SYNCHRONISATION {
    public static void main(String t[]){
        MyThread21 t1=new MyThread21();
        MyThread22 t2=new MyThread22();
        MyThread23 t3=new MyThread23();
        MyThread24 t4=new MyThread24();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
/*
Same example of static synchronization by annonymous class
In this example, we are using annonymous class to create the threads.

class Table{

 synchronized static  void printTable(int n){
   for(int i=1;i<=10;i++){
     System.out.println(n*i);
     try{
       Thread.sleep(400);
     }catch(Exception e){}
   }
 }
}

public class TestSynchronization5 {
public static void main(String[] args) {

    Thread t1=new Thread(){
        public void run(){
            Table.printTable(1);
        }
    };

    Thread t2=new Thread(){
        public void run(){
            Table.printTable(10);
        }
    };

    Thread t3=new Thread(){
        public void run(){
            Table.printTable(100);
        }
    };

    Thread t4=new Thread(){
        public void run(){
            Table.printTable(1000);
        }
    };
    t1.start();
    t2.start();
    t3.start();
    t4.start();

}
}
 */