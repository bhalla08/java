public class STRING_substring {
    public static void main(String args[]){
        String s1="javatpoint";
        System.out.println(s1.substring(2,4));//returns va
        System.out.println(s1.substring(2));//returns vatpoint
    }
}
/*
Java String substring()
The java string substring() method returns a part of the string.

We pass begin index and end index number position in the java substring method where start index is inclusive
and end index is exclusive. In other words, start index starts from 0 whereas end index starts from 1.

There are two types of substring methods in java string.
 */


/*
Internal implementation
public String substring(int beginIndex) {
       if (beginIndex < 0) {
           throw new StringIndexOutOfBoundsException(beginIndex);
       }
       int subLen = value.length - beginIndex;
       if (subLen < 0) {
           throw new StringIndexOutOfBoundsException(subLen);
       }
       return (beginIndex == 0) ? this : new String(value, beginIndex, subLen);
   }
 */