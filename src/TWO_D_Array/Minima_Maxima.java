package TWO_D_Array;

import java.util.Scanner;

public class Minima_Maxima {
    public static int MaxMin(int[][] arr, int n, int m){
        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            int min_col = -1;

            for(int j=0; j<m; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                    min_col = j;
                }
            }

            if(chekIfLargest(arr,min_col,min)){
                return min;
            }
        }
        return  -1;
    }
    public static boolean chekIfLargest(int[][]arr, int min_col, int min){
        int max = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i][min_col]>min){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int result = MaxMin(arr,n,m);
        System.out.println(result);
        sc.close();
    }
}
