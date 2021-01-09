public class JavaLabeledLoopsExample {
    public static void main(String[] args) {
//        We can have a name of each Java for loop. To do so, we use label before the for loop. It is useful if we have nested for loop so that we can break/continue specific for loop.
//
//                Usually, break and continue keywords breaks/continues the innermost for loop only.
//

        //Using Label for outer and for loop
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
