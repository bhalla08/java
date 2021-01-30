public class COPY_CONSTRUCTOR {
    //Java program to initialize the values from one object to another object.
        int id;
        String name;
        //constructor to initialize integer and string
        COPY_CONSTRUCTOR(int i,String n){
            id = i;
            name = n;
        }
        //constructor to initialize another object
        COPY_CONSTRUCTOR(COPY_CONSTRUCTOR s){
            id = s.id;
            name =s.name;
        }
        void display(){System.out.println(id+" "+name);}

        public static void main(String args[]){
            COPY_CONSTRUCTOR s1 = new COPY_CONSTRUCTOR(111,"Karan");
            COPY_CONSTRUCTOR s2 = new COPY_CONSTRUCTOR(s1);
            s1.display();
            s2.display();
        }
    }
//    There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor
//    in C++.
//
//        There are many ways to copy the values of one object into another in Java. They are:
//
//        By constructor
//        By assigning the values of one object into another
//        By clone() method of Object class