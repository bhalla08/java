public class STRING_isEmpty {
    public static void main(String args[]){
        String s1="";
        String s2="javatpoint";

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
    }
}

//Java String isEmpty()
//The java string isEmpty() method checks if this string is empty or not. It returns true,
// if length of string is 0 otherwise false. In other words, true is returned if string is empty otherwise it returns false.
//
//The isEmpty() method of String class is included in java string since JDK 1.6.


    /*
    Internal implementation
public boolean isEmpty() {
        return value.length == 0;
    }
     */