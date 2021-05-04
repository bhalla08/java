public class STRING_concat {
    public static void main(String args[]){
        String s1="java string";
        s1.concat("is immutable");
        System.out.println(s1);
        s1=s1.concat(" is immutable so assign it explicitly");
        System.out.println(s1);
    }
}
/*
The java string concat() method combines specified string at the end of this string. It returns combined string.
It is like appending another string.

 */

/*
public String concat(String str) {
       int otherLen = str.length();
       if (otherLen == 0) {
           return this;
       }
       int len = value.length;
       char buf[] = Arrays.copyOf(value, len + otherLen);
       str.getChars(buf, len);
       return new String(buf, true);
   }
 */

