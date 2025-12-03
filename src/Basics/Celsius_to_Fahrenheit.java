package Basics;

import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempInCelsius = sc.nextInt();
        int Fahrenheit = (tempInCelsius* 9/5) + 32;
        System.out.println(Fahrenheit);
    }
}
