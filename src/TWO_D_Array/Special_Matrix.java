package TWO_D_Array;

import java.util.Scanner;

public class Special_Matrix {
    public static boolean special(int[][] arr, int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                //non-zero
                if(i==j || i+j==n-1){
                    if(arr[i][j]==0) return  false;
                }else{   //zero
                    if(arr[i][j]!=0) return  false;
                }
            }
        }
        return  true;
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
        boolean ans = special(arr, n);
        System.out.println(ans);
        sc.close();
    }
}
