class Bike{
    final void run(){System.out.println("running");}
}
public class Honda extends Bike{
//    void run()//error
//    {System.out.println("running safely with 100kmph");}

    public static void main(String args[]){
        Honda honda= new Honda();
        honda.run();
    }
}
//FINAL METHOD