public class STRING_equalsIgnoreCase {
    public static void main(String args[]){
        String s1="javatpoint";
        String s2="javatpoint";
        String s3="JAVATPOINT";
        String s4="python";
        System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same
        System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored
        System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
    }
}
/*
The String equalsIgnoreCase() method compares the two given strings on the basis of content of the string irrespective
of case of the string. It is like equals() method but doesn't check case. If any character is not matched,
it returns false otherwise it returns true.
 */

/*
Internal implementation

public boolean equalsIgnoreCase(String anotherString) {
       return (this == anotherString) ? true
               : (anotherString != null)
               && (anotherString.value.length == value.length)
               && regionMatches(true, 0, anotherString, 0, value.length);
   }
 */