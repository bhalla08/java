public class GARBAGE_COLLECTION {
    public void finalize(){System.out.println("object is garbage collected");}
    public static void main(String args[]){
        GARBAGE_COLLECTION s1=new GARBAGE_COLLECTION();
        GARBAGE_COLLECTION s2=new GARBAGE_COLLECTION();
        s1=null;
        s2=null;
        System.gc();
    }
}
