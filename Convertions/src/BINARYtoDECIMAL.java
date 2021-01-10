public class BINARYtoDECIMAL {
    public static int getDecimal(int binary)
    {
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }

    public static void main(String args[]){
        String binaryString="1010";
        int decimal=Integer.parseInt(binaryString,2);
        System.out.println(decimal);

        //METHOD2--------------------------------------------------


        System.out.println("Decimal of 1010 is: "+getDecimal(1010));
        System.out.println("Decimal of 10101 is: "+getDecimal(10101));
        System.out.println("Decimal of 11111 is: "+getDecimal(11111));


    }
}
