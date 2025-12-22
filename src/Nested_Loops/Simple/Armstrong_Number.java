package Nested_Loops.Simple;

import java.util.Scanner;

public class Armstrong_Number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int num=1; num<=n; num++){
            int original = num;
            int sum = 0;

            while(original>0){
                int digit = original%10;
                sum = sum+digit*digit*digit;
                original = original/10;
            }
            if(sum==num){
                System.out.println(num);
            }
        }
    }
}
