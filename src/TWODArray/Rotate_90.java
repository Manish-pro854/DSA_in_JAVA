package TWODArray;

import java.util.Scanner;

public class Rotate_90 {
    public static void transpose(int[][] arr, int n){
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void reverse(int[][] arr, int n){
        for(int i=0; i<n; i++){
            int[] b = arr[i];
            reverseArray(b);
        }
    }
    public static void reverseArray(int[] smallArray){
        int si = 0;
        int ei = smallArray.length-1;
        while(si<=ei){
            int temp = smallArray[si];
            smallArray[si] = smallArray[ei];
            smallArray[ei] = temp;

            si++;
            ei--;
        }
    }
    public static void print(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        transpose(arr,n);
        //reverse every row
        reverse(arr,n);
        print(arr,n);
        sc.close();
    }
}
