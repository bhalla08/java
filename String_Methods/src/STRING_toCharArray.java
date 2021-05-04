public class STRING_toCharArray {
    public static void main(String args[]){
        String s1="hello";
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
//The java string toCharArray() method converts this string into character array. It returns a newly created character
//array, its length is similar to this string and its contents are initialized with the characters of this string.

/*
Internal implementation
public char[] toCharArray() {
      // Cannot use Arrays.copyOf because of class initialization order issues
      char result[] = new char[value.length];
      System.arraycopy(value, 0, result, 0, value.length);
      return result;
  }
 */