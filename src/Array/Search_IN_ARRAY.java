package Array;

import java.util.Scanner;

public class Search_IN_ARRAY {
    public static int search(int n, int[] arr, int t){
        int index = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==t){
                return i;
            }
        }
        return -1;
    }

    // inhance complexit of the code
    public static int Binary_Search(int n, int[] arr, int t){
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid]==t){
                return mid;
            } else if (arr[mid]<t) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
//        int output = search(n,arr,target);
        int output = Binary_Search(n,arr,target);
        System.out.println(output);
    }
}
