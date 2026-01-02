package Array;

import java.util.Scanner;

public class Subarray_Divisible_by_k {
    public static boolean checkdivisibility(int[] arr, int sp, int ep, int k){
        int sum = 0;
        int i = sp;
        while(i<=ep){
            sum = sum+arr[i];
            i++;
        }
        return (sum%k==0);
    }
    public static int check(int n, int k, int[] arr){
        int ans = 0;
        for(int sp=0; sp<n; sp++){
            //subarray from starting point to ending point
            for(int ep=sp; ep<n; ep++){
                //check the condition array from sp to ep is divisible by k or not
                boolean isDivisible = checkdivisibility(arr,sp,ep,k);
                if(isDivisible==true){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int output = check(n, k,arr);
        System.out.println(output);
    }
}
