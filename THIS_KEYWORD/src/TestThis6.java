//Calling parameterized constructor from default constructor:
class A2{
    A2(){
        this(5);
        System.out.println("hello a");
    }
    A2(int x){
        System.out.println(x);
    }
}
public class TestThis6 {
    public static void main(String args[]){
        A a=new A();
    }
}
//