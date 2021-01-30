public class MAIN_OUTSIDE {
    int id;
    String name;
}
//Creating another class TestStudent1 which contains the main method
class TestStudent1{
    public static void main(String args[]){
        MAIN_OUTSIDE s1=new MAIN_OUTSIDE();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
