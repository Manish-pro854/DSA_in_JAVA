package Array;

import java.util.Scanner;

public class Building {
    public static void Building(int n, int max, int[] arr){
        int number_of_lines = max;
        while(number_of_lines>0){
            for(int k=0; k<arr.length; k++){
                if(arr[k]>=number_of_lines){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            number_of_lines--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int j=0; j<arr.length; j++){
            if(arr[j]>max){
                max = arr[j];
            }
        }
        Building(n, max, arr);
    }
}
