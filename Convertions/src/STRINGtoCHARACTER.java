public class STRINGtoCHARACTER {
    public static void main(String args[]){
        String s="hello";
        char c=s.charAt(0);//returns h
        System.out.println("1st character is: "+c);

        System.out.println();
        System.out.println();
    //    METHOD 2------------------------------------------------------------
        String s1="hello";
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println("char at "+i+" index is: "+ch[i]);
        }
    }
}
