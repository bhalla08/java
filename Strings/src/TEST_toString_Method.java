public class TEST_toString_Method {
    int rollno;
    String name;
    String city;

    TEST_toString_Method(int rollno, String name, String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }

    public static void main(String args[]){
        TEST_toString_Method s1=new TEST_toString_Method(101,"Raj","lucknow");
        TEST_toString_Method s2=new TEST_toString_Method(102,"Vijay","ghaziabad");

        System.out.println(s1);//compiler writes here s1.toString()
        System.out.println(s2);//compiler writes here s2.toString()
    }
}
