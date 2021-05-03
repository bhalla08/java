package mypack1;
import pack.*;
public class Default_ex {
    public static void main(String args[]){
        A3 obj = new A3();//Compile Time Error
  //      obj.msg();//Compile Time Error
    }
}
//In the above example, the scope of class A and its method msg() is default so it cannot be accessed from
//outside the package.