public class STRING_replaceAll {
    public static void main(String args[]){
        String s1="javatpoint is a very good website";
        String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"
        System.out.println(replaceString);
    }
}
//Java String replaceAll()
//The java string replaceAll() method returns a string replacing all the sequence of characters matching regex and replacement string.




/*
Internal implementation
public String replaceAll(String regex, String replacement) {
        return Pattern.compile(regex).matcher(this).replaceAll(replacement);
}
 */