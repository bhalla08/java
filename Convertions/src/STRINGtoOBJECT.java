public class STRINGtoOBJECT {
    public static void main(String args[])throws Exception{
        String s="hello";
        Object obj=s;
        System.out.println(obj);

        //METHOD2----------------------------------------------------

        Class c=Class.forName("java.lang.String");
        System.out.println("class name: "+c.getName());
        System.out.println("super class name: "+c.getSuperclass().getName());
    }


    }

//    We can convert String to Object in java with assignment operator. Each class is
//    internally a child class of Object class. So you can assign string to Object directly.