public class STRING_replace {
    public static void main(String args[]){
        String s1="javatpoint is a very good website";
        String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'
        System.out.println(replaceString);
    }
}
//Java String replace()
//The java string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.
//
//Since JDK 1.5, a new replace() method is introduced, allowing you to replace a sequence of char values.


/*
Internal implementation
public String replace(char oldChar, char newChar) {
       if (oldChar != newChar) {
           int len = value.length;
           int i = -1;
           char[] val = value;  //avoid getfield opcode

           while (++i < len) {
        if (val[i] == oldChar) {
        break;
        }
        }
        if (i < len) {
        char buf[] = new char[len];
        for (int j = 0; j < i; j++) {
        buf[j] = val[j];
        }
        while (i < len) {
        char c = val[i];
        buf[i] = (c == oldChar) ? newChar : c;
        i++;
        }
        return new String(buf, true);
        }
        }
        return this;
        }
        */