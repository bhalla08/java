//INITIALISING AN OBJECT THROUGH A REFERENCE VARIABLE......

public class TEST_STUDENT2 {
    int id;
    String name;
}
class TestStudent2{
    public static void main(String args[]){
        TEST_STUDENT2 s1=new TEST_STUDENT2();
        s1.id=101;
        s1.name="Sonoo";
        System.out.println(s1.id+" "+s1.name);//printing members with a white space
    }
}
