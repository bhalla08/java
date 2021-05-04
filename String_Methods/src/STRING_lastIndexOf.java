public class STRING_lastIndexOf {
    public static void main(String args[]){
        String s1="this is index of example";//there are 2 's' characters in this sentence
        int index1=s1.lastIndexOf('s');//returns last index of 's' char value
        System.out.println(index1);//6
    }
}
//Java String lastIndexOf()
//The java string lastIndexOf() method returns last index of the given character value or substring.
//If it is not found, it returns -1. The index counter starts from zero.


/*
    Internal Implementation
        public int lastIndexOf(int ch) {
       return lastIndexOf(ch, value.length - 1);
   }
 */


/*
No.	                    Method	                                        Description
1	            int lastIndexOf(int ch)	                returns last index position for the given char value
2	   int lastIndexOf(int ch, int fromIndex)	        returns last index position for the given char value and from index
3	    int lastIndexOf(String substring)	            returns last index position for the given substring
4	int lastIndexOf(String substring, int fromIndex)	returns last index position for the given substring and from index
 */