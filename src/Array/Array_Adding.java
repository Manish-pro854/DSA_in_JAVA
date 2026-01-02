package Array;

import java.util.Scanner;

public class Array_Adding {
    public static int[] Sum_of_two(int n, int m, int[] arr1, int[] arr2){
        int res_size = Math.max(n,m)+1;
        int[] res = new int[res_size];

        int i = n-1;
        int j = m-1;
        int k = res_size-1;
        int carry = 0;

        while(k>=0){
            int csum = 0;
            if(i>=0){
               csum = csum+arr1[i];
            }
            if(j>=0){
                csum = csum+arr2[j];
            }
            csum = csum+carry;
            if(csum>9){
                carry = 1;
                csum = csum%10;
            }else {
                carry = 0;
            }
            res[k] = csum;

            i--;
            j--;
            k--;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int j=0; j<arr2.length; j++){
            arr2[j] = sc.nextInt();
        }
        int[] res = Sum_of_two(n, m, arr1, arr2);
        //print the answer and also remove 0 in front of answer
        int start = 0;
        if(res[0]==0){
            start = 1; //skip first 0
        }
        for(int i=start; i< res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
