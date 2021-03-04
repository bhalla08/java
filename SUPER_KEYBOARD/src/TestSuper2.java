class Animal1{
    void eat(){System.out.println("eating...");}
}
class Dog1 extends Animal1{
    void eat(){System.out.println("eating bread...");}
    void bark(){System.out.println("barking...");}
    void work(){
        super.eat();
        bark();
    }
}
public class TestSuper2 {
    public static void main(String args[]){
        Dog1 d=new Dog1();
        d.work();
    }
}
//In the above example Animal and Dog both classes have eat() method if we call eat() method from Dog class,
// it will call the eat() method of Dog class by default because priority is given to local.
//
//To call the parent class method, we need to use super keyword.