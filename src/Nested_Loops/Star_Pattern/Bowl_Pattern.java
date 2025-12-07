package Nested_Loops.Star_Pattern;

import java.util.Scanner;

public class Bowl_Pattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number_of_lines = 1;
        int stars = 1;
        int spaces = 2*n-2;
        while (number_of_lines <= n) {
            for(int i=0; i<stars; i++){
                System.out.print("* ");
            }
            for(int j=0; j<spaces; j++){
                System.out.print("  ");
            }
            for(int i=0; i<stars; i++){
                System.out.print("* ");
            }
            System.out.println();
            stars++;
            spaces = spaces-2;
            number_of_lines++;
        }
    }
}
