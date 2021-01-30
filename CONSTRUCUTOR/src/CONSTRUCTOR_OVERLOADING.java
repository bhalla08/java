//Constructor Overloading in Java
//        In Java, a constructor is just like a method but without return type. It can also be overloaded like Java methods.
//
//        Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are
//        arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of
//        parameters in the list and their types.

public class CONSTRUCTOR_OVERLOADING {
    int id;
    String name;
    int age;
    //creating two arg constructor
    CONSTRUCTOR_OVERLOADING(int i,String n){
        id = i;
        name = n;
    }
    //creating three arg constructor
    CONSTRUCTOR_OVERLOADING(int i,String n,int a){
        id = i;
        name = n;
        age=a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}
    public static void main(String args[]){
        CONSTRUCTOR_OVERLOADING s1 = new CONSTRUCTOR_OVERLOADING(111,"Karan");
        CONSTRUCTOR_OVERLOADING s2 = new CONSTRUCTOR_OVERLOADING(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}
