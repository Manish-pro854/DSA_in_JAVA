package Basics;

import java.util.Scanner;

public class Celsius_to_Fahrenheit_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.printf("%.6f",c*1.8+32);
    }
}
