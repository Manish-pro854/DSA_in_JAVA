package Array;

import java.util.Scanner;

public class Rotate_Array {
    public static void reverse(int[] arr, int si, int ei){
        while(si<=ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void Reverse(int[] arr, int k){
        int n = arr.length;

        k = k%n;

        if(k<0){
            k = k+n;
        }
        //reverse the array
        reverse(arr,0,n-k-1); //left reverse array
        reverse(arr,n-k,n-1); //right reverse array

        reverse(arr,0,n-1); //full reverse array
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Reverse(arr,k);
        for(int out: arr){
            System.out.print(out + " ");
        }
    }
}
