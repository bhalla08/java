//   Q) What is the purpose of a default constructor?
//   The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.


public class STUDENT3 {
    int id;
    String name;
    //method to display the value of id and name
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
//creating objects
        STUDENT3 s1=new STUDENT3();
        STUDENT3 s2=new STUDENT3();
//displaying values of the object
        s1.display();
        s2.display();
    }
}
//DEFAULT CONSTRUCTOR