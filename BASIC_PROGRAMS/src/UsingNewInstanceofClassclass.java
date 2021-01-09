public class UsingNewInstanceofClassclass {
//    The newInstance() method of the Class class is also used to create an object.
//    It calls the default constructor to create the object. It returns a newly created instance of the class
//    represented by the object. It internally uses the newInstance() method of the Constructor class.
//
//    Syntax:
//
//    public T newInstance() throws InstantiationException, IllegalAccessException
//    It throws the IllegalAccessException, InstantiationException, ExceptionInInitializerError exceptions.
//
//    We can create an object in the following ways:
//
//    ClassName object = ClassName.class.newInstance();
//    Or
//
//    ClassName object = (ClassName) Class.forName("fully qualified name of the class").newInstance();


//
//    In the above statement, forName() is a static method of Class class. It parses a parameter className of type String.
//    It returns the object for the class with the fully qualified name. It loads the class but does not create any object.
//    It throws ClassNotFoundException if the class cannot be loaded and LinkageError if the linkage fails.
//
//    To create the object, we use the newInstance() method of the Class class. It works only when we know the name of the
//    class and the class has a public default constructor.
//
//    In the following program, we have creates a new object using the newInstance() method.

    void show()
    {
        System.out.println("A new object created.");
    }
    public static void main(String[] args)
    {
        try
        {
//creating an instance of Class class
            Class cls = Class.forName("CreateObjectExample4");
//creates an instance of the class using the newInstance() method
            UsingNewInstanceofClassclass obj = (UsingNewInstanceofClassclass) cls.newInstance();
//invoking the show() method
            obj.show();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
    }
}
