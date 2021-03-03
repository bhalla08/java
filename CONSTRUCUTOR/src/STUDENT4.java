//Java Parameterized Constructor
//        A constructor which has a specific number of parameters is called a parameterized constructor.
//
//        Why use the parameterized constructor?
//        The parameterized constructor is used to provide different values to distinct objects. However,
//        you can provide the same values also.

public class STUDENT4 {
    int id;
    String name;
    //creating a parameterized constructor
    STUDENT4(int i,String n){
        id = i;
        name = n;
    }
    //method to display the values
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        //creating objects and passing values
        STUDENT4 s1 = new STUDENT4(111,"Karan");
        STUDENT4 s2 = new STUDENT4(222,"Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }
}
//EXAMPLE OF PARAMATARIZED CONSTRUCTOR