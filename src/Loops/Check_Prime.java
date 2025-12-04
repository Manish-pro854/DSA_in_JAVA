package Loops;

import java.util.Scanner;

public class Check_Prime {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<num; i++){
            int rem = num%i;
            if(rem==0){
                isPrime = false;
            }
        }
        if(isPrime==true){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }
    }
}
