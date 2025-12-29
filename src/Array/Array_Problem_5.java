package Array;

import java.util.Scanner;

public class Array_Problem_5 {
    public static int count(int k, int[] arr){
        int n = arr.length;
        int count = 0;
        int csum = 0;
        for(int i=0; i<n-1; i++){
            csum = arr[i]+arr[i+1];
            if(csum==k){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int output = count(n,arr);
        System.out.println(output);
    }
}
