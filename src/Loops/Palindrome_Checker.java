package Loops;

import java.util.Scanner;

public class Palindrome_Checker {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while(n>0){
            int ld = n%10;
            n = n/10;
            rev = rev*10+ld;
        }
        if(original==rev){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
