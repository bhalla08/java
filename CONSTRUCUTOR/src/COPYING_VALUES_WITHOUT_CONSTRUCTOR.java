public class COPYING_VALUES_WITHOUT_CONSTRUCTOR {
    int id;
    String name;
    COPYING_VALUES_WITHOUT_CONSTRUCTOR(int i,String n){
        id = i;
        name = n;
    }
    COPYING_VALUES_WITHOUT_CONSTRUCTOR(){}
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        COPYING_VALUES_WITHOUT_CONSTRUCTOR s1 = new COPYING_VALUES_WITHOUT_CONSTRUCTOR(111,"Karan");
        COPYING_VALUES_WITHOUT_CONSTRUCTOR s2 = new COPYING_VALUES_WITHOUT_CONSTRUCTOR();
        s2.id=s1.id;
        s2.name=s1.name;
        s1.display();
        s2.display();
    }
}
