package Loops;

import java.util.Scanner;

public class Reverse_digits_of_a_Number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n>0){
            int ld = n%10;
            n = n/10;
            ans = ans*10+ld;
        }
        System.out.println(ans);
    }
}
