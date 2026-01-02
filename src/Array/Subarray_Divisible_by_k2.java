package Array;

import java.util.Scanner;

public class Subarray_Divisible_by_k2 {
    public static int check(int n, int k, int[] arr){
        int ans = 0;
        for(int sp=0; sp<n; sp++){
            int sum = 0;
            //subarray from starting point to ending point
            for(int ep=sp; ep<n; ep++){
                //check the condition array from sp to ep is divisible by k or not
                sum = sum +arr[ep];
                if(sum%k==0){
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

