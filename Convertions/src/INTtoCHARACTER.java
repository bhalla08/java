public class INTtoCHARACTER {
    public static void main(String args[]){
        int a=65;
        char c=(char)a;
        System.out.println(a);

        int a1=1;
        char c1=(char)a1;
        System.out.println(c1);

//METHOD2 --------------------------------------------------------------------------
        int REDIX=10;//redix 10 is for decimal number, for hexa use redix 16
        int a2=1;
        char c2=Character.forDigit(a2,REDIX);
        System.out.println(c2);
    }
}
