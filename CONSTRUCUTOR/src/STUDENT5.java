public class STUDENT5 {
    int id;
    String name;
    int age;
    //creating two arg constructor
    STUDENT5(int i,String n){
        id = i;
        name = n;
    }
    //creating three arg constructor
    STUDENT5(int i,String n,int a){
        id = i;
        name = n;
        age=a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}

    public static void main(String args[]){
        STUDENT5 s1 = new STUDENT5(111,"Karan");
        STUDENT5 s2 = new STUDENT5(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}
//CONSTRUCTOR OVERLOADING