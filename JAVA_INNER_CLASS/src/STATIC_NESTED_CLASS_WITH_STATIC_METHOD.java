public class STATIC_NESTED_CLASS_WITH_STATIC_METHOD {
    static int data=30;
    static class Inner{
        static void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        STATIC_NESTED_CLASS_WITH_STATIC_METHOD.Inner.msg();//no need to create the instance of static nested class
    }
}
