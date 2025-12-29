package Array;

import java.util.Scanner;

public class Array_Problem_2 {
    public static int count(int n, int[] arr){
        int times = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]>35){
                times++;
            }
        }
        return times;
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
