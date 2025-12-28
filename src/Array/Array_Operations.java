package Array;

import java.util.Scanner;

public class Array_Operations {
    public static void ArrayOperation(int n, int[] arr){
        //sum of all elements present in the array
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);

        //now we will find the average
        int average = sum/n;
        System.out.println(average);

        //at last we will find the maximum element present in the array is
        int max = Integer.MIN_VALUE;
        for(int j=0; j<arr.length; j++){
            if(arr[j]>max){
                max = arr[j];
            }
        }
        System.out.println(max);
    }
    static void main(String[] args) {
        //find sum,average and maximum
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        ArrayOperation(n, arr);
    }
}
