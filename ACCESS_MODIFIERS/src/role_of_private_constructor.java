class A1{
    private A1(){}//private constructor
    void msg(){System.out.println("Hello java");}
}
public class role_of_private_constructor {
    public static void main(String args[]) {
     //   A1 obj = new A1();//Compile Time Error
    }
}
//If you make any class constructor private, you cannot create the instance of that class from outside the class.