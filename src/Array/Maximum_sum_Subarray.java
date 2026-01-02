package Array;

import java.util.Scanner;
//Kadanae's Algorithm
public class Maximum_sum_Subarray {
    public static int Max_Sub_Subarray(int[] arr){
        int max_sum = 0;
        int csum = 0;

        // Answer starting, ending and current point
        int asp = 0;
        int aep = -1;
        int csp = 0;

        for(int i=0; i< arr.length; i++){
            csum += arr[i];

            if(csum<0){
                csum = 0;
                csp = i+1;
            }

            if(max_sum<csum){
                max_sum=csum;
                //finding starting an ending point of the subarray
                asp = csp;
                aep = i;
            }
        }
        System.out.println(asp);
        System.out.println(aep);
        return max_sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int output = Max_Sub_Subarray(arr);
        System.out.println(output);
    }
}
