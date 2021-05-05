class A{
    interface Message{
        void msg();
    }
}
public class NESTED_INTERFACE2 implements A.Message{
    public void msg(){System.out.println("Hello nested interface");}

    public static void main(String args[]){
        A.Message message=new NESTED_INTERFACE2();//upcasting here
        message.msg();
    }
}
/*
Can we define a class inside the interface?
Yes, If we define a class inside the interface, java compiler creates a static nested class. Let's see how can we define a class within the interface:


interface M{
  class A{}
}
 */