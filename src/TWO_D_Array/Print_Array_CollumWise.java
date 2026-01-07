package TWO_D_Array;

import java.util.Scanner;

public class Print_Array_CollumWise {
    public static void print(int[][] arr, int n, int m){
        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    matrix[i][j] = sc.nextInt();
            print(matrix, n, m);
            System.out.println();
            t--;
        }
        sc.close();
    }
}
