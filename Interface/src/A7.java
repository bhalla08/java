interface Printable{
    void print();
}
interface Showable{
    void show();
}
public class A7 implements Printable,Showable {
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}
//Q) Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
//As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class
// because of ambiguity. However, it is supported in case of an interface because there is no ambiguity.
// It is because its implementation is provided by the implementation class.