package TWO_D_Array;

import java.util.Scanner;

public class Search_Matrix {
    public static void Search(int[][] arr, int n, int m, int target){
        int row = 0;
        int col = m-1;

        while(row<n && col>=0){
            if(arr[row][col]<target){
                row++;
            } else if(arr[row][col]>target) {
                col--;
            }else{
                System.out.println(row+" "+ col);
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int target = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Search(arr,n,m,target);
        sc.close();
    }
}
