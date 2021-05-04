public class STRING_startWith {
    public static void main(String args[]){
        String s1="java string split method by javatpoint";
        System.out.println(s1.startsWith("ja"));
        System.out.println(s1.startsWith("java string"));
    }
}
//The java string startsWith() method checks if this string starts with given prefix.
//It returns true if this string starts with given prefix else returns false.



/*
Internal implementation
public boolean startsWith(String prefix, int toffset) {
     char ta[] = value;
     int to = toffset;
     char pa[] = prefix.value;
     int po = 0;
     int pc = prefix.value.length;
     // Note: toffset might be near -1>>>1.
     if ((toffset < 0) || (toffset > value.length - pc)) {
         return false;
     }
     while (--pc >= 0) {
         if (ta[to++] != pa[po++]) {
             return false;
         }
     }
     return true;
 }
 */