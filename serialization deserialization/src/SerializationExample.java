import java.io.*;
class SerializationExample {
//    In the following program, we have serialized an object of Employee class by using the writeObject()
//    method of the ObjectOutputStream class. The state of the object is saved in the employee.txt file.

    public static void main(String args[])
    {
        try
        {
//Creating the object
            Employee emp = new Employee(198054,"Andrew");
//Creates a stream and writes the object
            FileOutputStream fout=new FileOutputStream("employee.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(emp);
            out.flush();
//closes the output stream
            out.close();
            System.out.println("Successfully Created");
        }
catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
