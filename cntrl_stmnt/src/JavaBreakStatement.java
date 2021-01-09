public class JavaBreakStatement {
//    When a break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.
//
//    The Java break statement is used to break loop or switch statement. It breaks the current flow of the program at specified condition. In case of inner loop, it breaks only inner loop.
//
//    We can use Java break statement in all types of loops such as for loop, while loop and do-while loop.

    public static void main(String[] args) {
        //using for loop
        for(int i=1;i<=10;i++){
            if(i==5){
                //breaking the loop
                break;
            }
            System.out.println(i);
        }


        //break statement in the inner loop
        //outer loop
        for(int k=1;k<=3;k++){
            //inner loop
            for(int j=1;j<=3;j++){
                if(k==2&&j==2){
                    //using break statement inside the inner loop
                    break;
                }
                System.out.println(k+" "+j);
            }
        }



        //break statement with labeled loop
        aa:
        for(int m=1;m<=3;m++){
            bb:
            for(int n=1;n<=3;n++){
                if(m==2&&n==2){
                    //using break statement with label
                    break aa;
                }
                System.out.println(m+" "+n);
            }
        }

    }
}
