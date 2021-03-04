class Student11{
    int rollno;
    String name;
    float fee;
    Student11(int r,String n,float f){
        rollno=r;
        name=n;
        fee=f;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}
public class TestThis3 {
    class Student11{
        int rollno;
        String name;
        float fee;
        Student11(int r,String n,float f){
            rollno=r;
            name=n;
            fee=f;
        }
        void display(){System.out.println(rollno+" "+name+" "+fee);}
    }
}
//THIS KEYWORD NOT REQUIRED
//It is better approach to use meaningful names for variables.
// So we use same name for instance variables and parameters in real time, and always use this keyword.