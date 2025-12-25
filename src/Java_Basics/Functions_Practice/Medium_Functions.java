package Java_Basics.Functions_Practice;

import java.util.Scanner;

public class Medium_Functions {
    //Function to reverse a number
    public static void reverse(int n){
        int number = n;
        int reverse = 0;
        while(number>0){
            int ld = number%10;
            reverse = reverse*10+ld;
            number = number/10;
        }
        System.out.println(reverse);
    }
    //Function to find factorial
    public static void factorial(int n){
        int sum = 1;
        for(int i=1; i<=n; i++){
            sum = sum*i;
        }
        System.out.println(sum);
    }
    //Function to check prime number
    public static void prime(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        prime(n);
//        factorial(n);
        reverse(n);
    }
}
