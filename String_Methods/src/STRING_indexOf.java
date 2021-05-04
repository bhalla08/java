public class STRING_indexOf {
    public static void main(String args[]){
        String s1="this is index of example";
//passing substring
        int index1=s1.indexOf("is");//returns the index of is substring
        int index2=s1.indexOf("index");//returns the index of index substring
        System.out.println(index1+"  "+index2);//2 8

//passing substring with from index
        int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is

//passing char value
        int index4=s1.indexOf('s');//returns the index of s char value
        System.out.println(index4);//3
    }
}
//The java string indexOf() method returns index of given character value or substring. If it is not found, it returns
//-1. The index counter starts from zero.

/*
Internal implementation
public int indexOf(int ch) {
        return indexOf(ch, 0);
    }
 */


/*
No.	        Method	                                    Description
1	int indexOf(int ch)	                            returns index position for the given char value
2	int indexOf(int ch, int fromIndex)	            returns index position for the given char value and from index
3	int indexOf(String substring)	                returns index position for the given substring
4	int indexOf(String substring, int fromIndex)	returns index position for the given substring and from index
 */