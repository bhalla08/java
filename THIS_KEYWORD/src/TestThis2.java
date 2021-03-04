class Student0{
    int rollno;
    String name;
    float fee;
    Student0(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}
public class TestThis2 {
    public static void main(String args[]){
        Student0 s1=new Student0(111,"ankit",5000f);
        Student0 s2=new Student0(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
//SOLUTION OF TESTTHIS1....