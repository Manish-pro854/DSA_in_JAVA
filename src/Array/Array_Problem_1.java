package Array;

import java.util.Scanner;

public class Array_Problem_1 {
    public static int count(int n, int[] arr){
        int position = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]!=n){
                position++;
            }
        }
        return position;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int output = count(n,arr);
        System.out.println(output);
    }
}
