public class STRING_getBytes {
    public static void main(String args[]){
        String s1="ABCDEFG";
        byte[] barr=s1.getBytes();
        for(int i=0;i<barr.length;i++){
            System.out.println(barr[i]);
        }
    }
}
//The java string getBytes() method returns the byte array of the string. In other words, it returns sequence of bytes.

/*
Internal implementation
public byte[] getBytes() {
        return StringCoding.encode(value, 0, value.length);
    }
 */