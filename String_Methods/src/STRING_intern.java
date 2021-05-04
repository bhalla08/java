public class STRING_intern {
    public static void main(String args[]){
        String s1=new String("hello");
        String s2="hello";
        String s3=s1.intern();//returns string from pool, now it will be same as s2
        System.out.println(s1==s2);//false because reference variables are pointing to different instance
        System.out.println(s2==s3);//true because reference variables are pointing to same instance
    }
}
//Java String intern()
//The java string intern() method returns the interned string. It returns the canonical representation of string.
//
//It can be used to return string from memory, if it is created by new keyword. It creates exact copy of heap string
//object in string constant pool.