public class Test_Immutability {
    public static void main(String args[]){
        String s="Sachin";
        s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);//will print Sachin because strings are immutable objects
    }
}
// two objects are created but s reference variable still refers to "Sachin" not to "Sachin Tendulkar"