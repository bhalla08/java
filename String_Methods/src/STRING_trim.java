public class STRING_trim {
    public static void main(String args[]){
        String s1="  hello string   ";
        System.out.println(s1+"javatpoint");//without trim()
        System.out.println(s1.trim()+"javatpoint");//with trim()
    }
}
/*
The java string trim() method eliminates leading and trailing spaces. The unicode value of space character is
'\u0020'. The trim() method in java string checks this unicode value before and after the string,
if it exists then removes the spaces and returns the omitted string.
 */



/*
Internal implementation
public String trim() {
        int len = value.length;
        int st = 0;
        char[] val = value;    /* avoid getfield opcode

        while ((st < len) && (val[st] <= ' ')) {
        st++;
        }
        while ((st < len) && (val[len - 1] <= ' ')) {
        len--;
        }
        return ((st > 0) || (len < value.length)) ? substring(st, len) : this;
        }
        */

