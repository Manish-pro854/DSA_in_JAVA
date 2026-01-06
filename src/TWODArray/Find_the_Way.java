package TWODArray;

import java.util.Scanner;

public class Find_the_Way {
    public static int[] FindTheWay(int[][] arr, int n, int m){
        int row = 0;
        int column = 0;
        int dir = 0;

        while(row>=0 && column>=0 && row<n && column<m){
            if(arr[row][column]==1){
                dir = (dir+1)%4;
            }
            if(dir==0){
                column++;
            } else if(dir==1) {
                row++;
            } else if(dir==2) {
                column--;
            }else{
                row--;
            }
        }

        if(row==-1) row++;
        if(column==-1) column++;
        if(row==n) row--;
        if(column==m) column--;

        return new int[] {row,column};
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
        int[] result = FindTheWay(arr,n,m);
        for(int i=0; i< result.length; i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
