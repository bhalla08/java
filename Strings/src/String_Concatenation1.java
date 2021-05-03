public class String_Concatenation1 {
    public static void main(String args[]){
        String s="Sachin"+" Tendulkar";
        System.out.println(s);//Sachin Tendulkar
    }
}
/*
The Java compiler transforms above code to this:
String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();
*/


/*
In java, String concatenation is implemented through the StringBuilder (or StringBuffer) class and its append method.
String concatenation operator produces a new string by appending the second operand onto the end of the first operand.
The string concatenation operator can concat not only string but primitive values also.
 */