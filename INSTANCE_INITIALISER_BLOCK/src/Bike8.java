//What is invoked first, instance initializer block or constructor?
public class Bike8 {
    int speed;

    Bike8(){System.out.println("constructor is invoked");}

    {System.out.println("instance initializer block invoked");}

    public static void main(String args[]){
        Bike8 b1=new Bike8();
        Bike8 b2=new Bike8();
    }
}
//ANS
//In the above example, it seems that instance initializer block is firstly invoked but NO. Instance intializer block is
// invoked at the time of object creation. The java compiler copies the instance initializer block in the constructor
// after the first statement super(). So firstly, constructor is invoked. Let's understand it by the figure given below:
//Note: The java compiler copies the code of instance initializer block in every constructor.




//Rules for instance initializer block :
//
//        There are mainly three rules for the instance initializer block. They are as follows:
//        The instance initializer block is created when instance of the class is created.
//        The instance initializer block is invoked after the parent class constructor is invoked
//        (i.e. after super() constructor call).
//        The instance initializer block comes in the order in which they appear.