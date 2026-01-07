package TWO_D_Array;

import java.util.Scanner;

public class Special_Matrix_2 {
    public  static void specialMatrix2(int[][] arr, int n, int m){
        int sr = 0;
        int sc = 0;
        int er = n-1;
        int ec = m-1;

        int row = -1;
        int col = -1;

        while(sr<=er && sc<=ec){
            //start col
            col = sc;
            for(row=sr; row<=er && sc<=ec; row++){
                System.out.print(arr[row][col]+" ");
            }
            sc++;

            //end row
            row = er;
            for(col=sc; col<=ec && sr<=er; col++){
                System.out.print(arr[row][col]+" ");
            }
            er--;

            //end col
            col = ec;
            for(row=er; row>=sr && sc<=ec; row--){
                System.out.print(arr[row][col]+" ");
            }
            ec--;

            //start row
            row = sr;
            for(col=ec; col>=sc && sr<=er; col--){
                System.out.print(arr[row][col]+" ");
            }
            sr++;
        }
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
        specialMatrix2(arr, n, m);
        sc.close();
    }
}
