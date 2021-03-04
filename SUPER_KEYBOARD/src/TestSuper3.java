class Animal2{
    Animal2(){System.out.println("animal is created");}
}
class Dog2 extends Animal2{
    Dog2(){
        super();
        System.out.println("dog is created");
    }
}
public class TestSuper3 {
    public static void main(String args[]){
        Dog d=new Dog();
    }
}
//    As we know well that default constructor is provided by compiler automatically if there is no constructor.
//        But, it also adds super() as the first statement.