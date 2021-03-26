class Animal1 { }
public class Dog4 extends Animal1 {
    static void method(Animal1 a) {
        Dog4 d=(Dog4)a;//downcasting
        System.out.println("ok downcasting performed");
    }
    public static void main (String [] args) {
        Animal1 a=new Dog4();
        Dog4.method(a);
    }
}
//Downcasting without the use of java instanceof
//Downcasting can also be performed without the use of instanceof operator as displayed in the following example: