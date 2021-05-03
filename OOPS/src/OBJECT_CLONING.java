public class OBJECT_CLONING implements Cloneable{
    int rollno;
    String name;

    OBJECT_CLONING(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String args[]){
        try{
            OBJECT_CLONING s1=new OBJECT_CLONING(101,"amit");

            OBJECT_CLONING s2=(OBJECT_CLONING)s1.clone();

            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);

        }catch(CloneNotSupportedException c){}

    }
}
