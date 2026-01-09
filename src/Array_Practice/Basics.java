package Array_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Basics {
    //how to sort a array
    public static void Sort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int result: arr){
            System.out.print(result+" ");
        }
        System.out.println();
    }
    //remove duplicate if array is sorted
    public static void RemoveDuplicates(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print(arr[n-1]);
    }
    public static void main(String[] args) {
        //How to take input in array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Sort(arr,n);
        RemoveDuplicates(arr,n);
    }
}
