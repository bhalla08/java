class Animal{
    String color="white";
}
class Dog extends Animal{
    String color="black";
    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}
public class TestSuper1 {
    public static void main(String args[]){
        Dog d=new Dog();
        d.printColor();
    }
}
//super is used to refer immediate parent class instance variable.
//In the above example, Animal and Dog both classes have a common property color. If we print color property,
// it will print the color of current class by default. To access the parent property, we need to use super keyword.