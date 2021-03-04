class A21{
    A21 getA21(){
        return this;
    }
    void msg(){System.out.println("Hello java");}
}
public class Test1 {
    public static void main(String args[]){
        new A21().getA21().msg();
    }
}
//  6)  this keyword can be used to return current class instance
//      We can return this keyword as an statement from the method.
//      In such case, return type of the method must be the class type (non-primitive).