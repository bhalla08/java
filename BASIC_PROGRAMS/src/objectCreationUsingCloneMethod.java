public class objectCreationUsingCloneMethod implements Cloneable{
//    The clone() method is the method of Object class. It creates a copy of an object
//    and returns the same copy. The JVM creates a new object when the clone() method is
//    invoked. It copies all the content of the previously created object into new one object.
//    Note that it does not call any constructor. We must implement the Cloneable interface while
//    using the clone() method. The method throws CloneNotSupportedException exception if the
//    object's class does not support the Cloneable interface. The subclasses that override the
//    clone() method can throw an exception if an instance cannot be cloned.

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    String str = "New Object Created";

    public static void main(String[] args) {
        objectCreationUsingCloneMethod obj = new objectCreationUsingCloneMethod();
        try
        {
//creating a new object of the obj1 suing the clone() method
            objectCreationUsingCloneMethod obj2 = (objectCreationUsingCloneMethod) obj.clone();
            System.out.println(obj2.str);
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}

