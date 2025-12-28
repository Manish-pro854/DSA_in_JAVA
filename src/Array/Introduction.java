package Array;
import java.util.*;
public class Introduction {
    static void main(String[] args) {
        //Declare array
        int[] arr;

        //creation of an array
        arr = new int[5];

        //Declaration+creation
        int[] arr2 = new int[5];
        arr2 [1] = 60;

        //Initialize array
        int[] arr3 = {10,20,30,40,50};

        //Access array elements
        System.out.println(arr3[0]);
        System.out.println(arr2[1]);

        //how to find array length
         System.out.println(arr3.length);

         //Using loops
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);
        }

        //Taking input in array
        Scanner sc = new Scanner(System.in);
        int[] arr5 = new int[5];
        for(int j=0; j<arr5.length; j++){
            arr5[j] = sc.nextInt();
        }
        //Print array
        for(int x: arr5) {
            System.out.println(x);
        }
    }
}
