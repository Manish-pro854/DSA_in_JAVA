package Nested_Loops.Star_Pattern;

import java.util.Scanner;

public class Ulta_Triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number_of_lines = 1;
        int stars = n;
        int spaces = 0;
        while(number_of_lines<=n){
            for(int i=0; i<stars; i++){
                System.out.print("* ");
            }
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            System.out.println();
            stars--;
            spaces++;
            number_of_lines++;
        }
    }
}
