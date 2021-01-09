public class ifElse {
    public static void main(String[] args) {
        //defining an 'age' variable
        int age=20;
        //checking the age
        System.out.println("Example 1");
        if(age>18){
            System.out.print("Age is greater than 18");

            System.out.println("Example 2");
            //defining a variable
            int number=13;
            //Check if the number is divisible by 2 or not
            if(number%2==0){
                System.out.println("even number");
            }else{
                System.out.println("odd number");
            }

            System.out.println("Example 3");
            int year=2020;
            if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
                System.out.println("LEAP YEAR");
            }
            else{
                System.out.println("COMMON YEAR");
            }

            System.out.println("Example 4");
            int number1=13;
            //Using ternary operator
            String output=(number1%2==0)?"even number":"odd number";
            System.out.println(output);
        }
}}
