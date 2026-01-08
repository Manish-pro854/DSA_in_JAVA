package ArrayList;

import java.util.Scanner;

public class Two_Sum_2 {
    public static int count(int n, int[] arr, int target){
        int number_of_pairs = 0;

        int left = 0;
        int right = n-1;

        while (left < right) {
            int csum = arr[left]+arr[right];

            if(csum<target){
                left++;
            } else if (csum>target) {
                right--;
            }else {
                number_of_pairs++;
                int curr_ele = arr[right];
                while(left<right && arr[right] == curr_ele){
                    right--;
                }
            }
        }
        return number_of_pairs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int output = count(n,arr,target);
        System.out.println(output);
    }
}

