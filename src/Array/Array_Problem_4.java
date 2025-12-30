package Array;

import java.util.Scanner;

public class Array_Problem_4 {
    public static void Larger_Array(int n, int m, int[] arr1, int[] arr2){
        int sum_arr1 = 0;
        for(int i=0; i< arr1.length; i++){
            sum_arr1 = arr1[i]+sum_arr1;
        }
        int sum_arr2 = 0;
        for(int j=0; j< arr1.length; j++){
            sum_arr2 = arr2[j]+sum_arr2;
        }
        if(sum_arr1>sum_arr2){
            System.out.println("First Array is Larger");
        }else{
            System.out.println("Second Array is Larger");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i< arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int j=0; j< arr2.length; j++){
            arr2[j] = sc.nextInt();
        }
        Larger_Array(n, m, arr1, arr2);
    }
}
