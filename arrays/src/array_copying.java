import java.lang.reflect.Array;

public class array_copying {
    public static void main(String[] args) {
        int[] arr1 = new int [] {120,13,45,56,67};
        int[] arr2 = new int [] {arr1.length};

        for (int i=0;i<arr1.length;i++)
        {
            arr2[i] = arr1[i];

        }
        System.out.println("Elements of original array are :");
        for (int i=0 ; i<arr1.length;i++)
        {
            System.out.println(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Elements of new array are: ");
        for (int i=0 ; i<arr2.length;i++)
        {
            System.out.println(arr2[i]+ " ");

        }
    }
}
