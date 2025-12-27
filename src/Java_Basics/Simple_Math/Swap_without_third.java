package Java_Basics.Simple_Math;

import java.util.Scanner;

public class Swap_without_third {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a+b;  //30
        b = a-b;  //30-20
        a = a-b;  //30-10
        System.out.println(a);
        System.out.println(b);
    }
}
