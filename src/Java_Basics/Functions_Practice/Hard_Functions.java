package Java_Basics.Functions_Practice;

import java.util.Scanner;

public class Hard_Functions {
    //Function using nested loops for pattern printing
    public static void pattern(int n){
        int number_Of_lines = 0;
        int number = 1;
        while(number_Of_lines<n){
            for(int i=1; i<=number; i++){
                System.out.print(number);
            }
            System.out.println();
            number_Of_lines++;
            number++;
        }
    }
    //Function to print Fibonacci series
    public static void fibconi(int n){
        int first = 0;
        int second = 1;
        for(int i=1; i<=n; i++){
            System.out.print(first+" ");
            int third = first+second;
            first = second;
            second = third;
        }
    }
    //Function to check Armstrong number
    public static void armstrong(int n){
        int number = n;
        int sum = 0;
        while (number>0){
            int ld = number%10;
            sum = sum+ld*ld*ld;
            number = number/10;
        }
        if(n==sum){
            System.out.println("Number is Armstrong");
        }else{
            System.out.println("Number is Not Armstrong");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        armstrong(n);
//        fibconi(n);
        pattern(n);
    }
}
