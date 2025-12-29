package Array;

import java.util.Scanner;

public class Sum_Array_Except_Self {
    public static int[] Sum_Of_Array_Except_Self(int n, int[] arr){
        int[] res = new int[n];
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            int element = arr[i];
            sum = sum+arr[i];
        }
        for(int j=0; j< res.length; j++){
            res[j] = sum-arr[j];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = Sum_Of_Array_Except_Self(n, arr);
        for(int a : ans){
            System.out.println(a + " ");
        }
    }
}
