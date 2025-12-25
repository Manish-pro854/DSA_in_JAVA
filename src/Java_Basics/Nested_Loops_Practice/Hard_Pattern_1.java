package Java_Basics.Nested_Loops_Practice;

import java.util.Scanner;

public class Hard_Pattern_1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number_of_lines = 0;
        int stars = 1;
        int spaces = n-1;
        while(number_of_lines<n){
            //print spaces
            for(int i=1; i<=spaces; i++){
                System.out.print(" ");
            }
            //print stars
            for(int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            System.out.println();
            number_of_lines++;
            stars++;
            spaces--;
        }
    }
}
