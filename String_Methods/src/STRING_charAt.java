public class STRING_charAt {
    public static void main(String args[]){
        String name="javatpoint";
        char ch=name.charAt(4);//returns the char value at the 4th index
        System.out.println(ch);
    }

}
/*
        INTERNAL IMPLEMENTATION

public char charAt(int index) {
       if ((index < 0) || (index >= value.length)) {
           throw new StringIndexOutOfBoundsException(index);
       }
       return value[index];
   }
 */