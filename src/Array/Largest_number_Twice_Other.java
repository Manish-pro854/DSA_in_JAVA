package Array;

import java.util.Scanner;

public class Largest_number_Twice_Other {
    public static int check(int n, int[] arr){
        int max = -1;
        int index = -1;
        //find the largest element in the array
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        //chek for the conditon if element exist like double of a number
        for(int j=0; j< arr.length; j++){
            if(j != index && max<2*arr[j]){
                return  -1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int output = check(n,arr);
        System.out.println(output);
    }
}
