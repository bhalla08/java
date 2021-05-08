class Table3{

    void printTable(int n){
        synchronized(this){//synchronized block
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
        }
    }//end of the method
}

class MyThread111 extends Thread{
    Table3 t;
    MyThread111(Table3 t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread112 extends Thread{
    Table3 t;
    MyThread112(Table3 t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}
public class TEST_SYNCHRONISATION_BLOCK {
    public static void main(String args[]){
        Table3 obj = new Table3();//only one object
        MyThread111 t1=new MyThread111(obj);
        MyThread112 t2=new MyThread112(obj);
        t1.start();
        t2.start();
    }
}
/*
Same Example of synchronized block by using annonymous class:
//Program of synchronized block by using annonymous class
class Table{

void printTable(int n){
   synchronized(this){//synchronized block
     for(int i=1;i<=5;i++){
      System.out.println(n*i);
      try{
       Thread.sleep(400);
      }catch(Exception e){System.out.println(e);}
     }
   }
}//end of the method
}

public class TestSynchronizedBlock2{
public static void main(String args[]){
final Table obj = new Table();//only one object

Thread t1=new Thread(){
public void run(){
obj.printTable(5);
}
};
Thread t2=new Thread(){
public void run(){
obj.printTable(100);
}
};

t1.start();
t2.start();
}
}
 */

