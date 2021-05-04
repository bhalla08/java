public class STRING_contains {
    public static void main(String args[]){
        String name="what do you know about me";
        System.out.println(name.contains("do you know"));
        System.out.println(name.contains("about"));
        System.out.println(name.contains("hello"));
    }
}
/*
The java string contains() method searches the sequence of characters in this string.
It returns true if sequence of char values are found in this string otherwise returns false.
 */

/*
Internal implementation
public boolean contains(CharSequence s) {
      return indexOf(s.toString()) > -1;
  }
 */