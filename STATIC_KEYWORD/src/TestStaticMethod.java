//Java Program to demonstrate the use of a static method.
class Student0{
    int rollno;
    String name;
    static String college = "ITS";
    //static method to change the value of static variable
    static void change(){
        college = "BBDIT";
    }
    //constructor to initialize the variable
    Student0(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to create and display the values of object
public class TestStaticMethod {
    public static void main(String args[]){
        Student0.change();//calling change method
        //creating objects
        Student0 s1 = new Student0(111,"Karan");
        Student0 s2 = new Student0(222,"Aryan");
        Student0 s3 = new Student0(333,"Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
