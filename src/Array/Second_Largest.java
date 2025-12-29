package Array;

import java.util.Scanner;

public class Second_Largest {
    public static int Second_Largest_Number(int n, int[] arr){
        int Largest = Integer.MIN_VALUE;
        int Second_Largest = Integer.MIN_VALUE;
        for(int j=0; j< arr.length; j++){
            if(arr[j]>Largest) {
                Second_Largest = Largest;
                Largest = arr[j];
            }
             else if(arr[j]>Second_Largest && arr[j] != Largest){
                Second_Largest = arr[j];
            }
        }

        return Second_Largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int output = Second_Largest_Number(n, arr);
        System.out.println(output);
    }
}
