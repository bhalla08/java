public class Test_Immutability2 {
    public static void main(String args[]){
        String s="Sachin";
        s=s.concat(" Tendulkar");
        System.out.println(s);
    }
}
//if we explicitely assign it to the reference variable, it will refer to "Sachin Tendulkar" object.



//    Why string objects are immutable in java?
//        Because java uses the concept of string literal.Suppose there are 5 reference variables,all referes to
//        one object "sachin".If one reference variable changes the value of the object, it will be affected to all
//        the reference variables. That is why string objects are immutable in java