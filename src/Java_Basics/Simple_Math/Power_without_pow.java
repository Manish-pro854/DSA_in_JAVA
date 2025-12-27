package Java_Basics.Simple_Math;

import java.util.Scanner;

public class Power_without_pow {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        int result = 1;
        for(int i=1; i<=power; i++){
            result = result*number;
        }
        System.out.println(result);
    }
}
