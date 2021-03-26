class Animal{
    void eat(){System.out.println("animal is eating...");}
}
public class Dog1 extends Animal{
    void eat(){System.out.println("dog is eating...");}

    public static void main(String args[]){
        Animal a=new Dog1();
        a.eat();
    }
}
//In the above example object type cannot be determined by the compiler, because the instance of Dog is also an instance
// of Animal.So compiler doesn't know its type, only its base type.
