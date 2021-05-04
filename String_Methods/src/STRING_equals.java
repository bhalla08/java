public class STRING_equals {
    public static void main(String args[]){
        String s1="javatpoint";
        String s2="javatpoint";
        String s3="JAVATPOINT";
        String s4="python";
        System.out.println(s1.equals(s2));//true because content and case is same
        System.out.println(s1.equals(s3));//false because case is not same
        System.out.println(s1.equals(s4));//false because content is not same
    }
}
/*
The java string equals() method compares the two given strings based on the content of the string.
If any character is not matched, it returns false. If all characters are matched, it returns true.

The String equals() method overrides the equals() method of Object class.
 */


/*
Internal implementation
public boolean equals(Object anObject) {
      if (this == anObject) {
          return true;
      }
      if (anObject instanceof String) {
          String anotherString = (String) anObject;
          int n = value.length;
          if (n == anotherString.value.length) {
              char v1[] = value;
              char v2[] = anotherString.value;
              int i = 0;
              while (n-- != 0) {
                  if (v1[i] != v2[i])
                          return false;
                  i++;
              }
              return true;
          }
      }
      return false;
  }
 */