public class STRING_getChar {
    public static void main(String args[]){
        String str = new String("hello javatpoint how r u");
        char[] ch = new char[10];
        try{
            str.getChars(6, 16, ch, 0);
            System.out.println(ch);
        }catch(Exception ex){System.out.println(ex);}
    }
}
//The java string getChars() method copies the content of this string into specified char array. There are 4 arguments
//passed in getChars() method. The signature of getChars() method is given below:

/*

Internal implementation
void getChars(char dst[], int dstBegin) {
        System.arraycopy(value, 0, dst, dstBegin, value.length);
    }
 */