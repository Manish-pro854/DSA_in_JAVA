package Array_Practice;

import java.util.Scanner;

public class Basics {
    //remove duplicate if array is sorted
    public static void Sort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            if(arr[i]!=arr[i+1]){
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[n-1]);
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
    }
}
