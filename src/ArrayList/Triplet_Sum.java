package ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Triplet_Sum {
    public static int threeSum(int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;
        int ans = 0;

        for(int i=0; i<n-2; i++){

            //skip duplicates
            if(i>0 && arr[i]==arr[i-1]) continue;

            int target_left = target-arr[i];
            ans += twosumbetweenIndices(arr, i+1, n-1, target_left);
        }
        return ans;
    }
    public static int twosumbetweenIndices(int[] arr, int left, int right, int target){
        int count = 0;

        while (left < right) {
            int sum = arr[left]+arr[right];

            if(sum<target){
                left++;
            } else if (sum>target) {
                right--;
            }else {
                count++;
                int left_val = arr[left];
                int right_val = arr[right];

                //skip duplicates
                while(left<right && arr[left] == left_val) left++;
                while(left<right && arr[right] == right_val) right--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int output = threeSum(arr,target);
        System.out.println(output);
    }
}