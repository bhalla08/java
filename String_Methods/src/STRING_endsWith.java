public class STRING_endsWith {
    public static void main(String args[]){
        String s1="java by javatpoint";
        System.out.println(s1.endsWith("t"));
        System.out.println(s1.endsWith("point"));
    }
}
/*
The java string endsWith() method checks if this string ends with given suffix.
It returns true if this string ends with given suffix else returns false.
 */

/*
Internal implementation

public boolean endsWith(String suffix) {
return startsWith(suffix, value.length - suffix.value.length);
  }
 */