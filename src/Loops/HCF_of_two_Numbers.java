package Loops;

import java.util.Scanner;

public class HCF_of_two_Numbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for(int i=1; i<Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
               ans = i;
            }
        }
        System.out.println(ans);
    }
}
