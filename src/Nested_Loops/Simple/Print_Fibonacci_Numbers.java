package Nested_Loops.Simple;

import java.util.Scanner;

public class Print_Fibonacci_Numbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for(int i=2; i<n; i++){
            int third = first+second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
}
