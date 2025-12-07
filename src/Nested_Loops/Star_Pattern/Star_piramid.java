package Nested_Loops.Star_Pattern;

import java.util.Scanner;

public class Star_piramid {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number_of_lines = 1;
        int stares = 1;
        int spaces = n-1;
        while(number_of_lines<=n){
            for(int i=0; i<spaces; i++){
                System.out.print(" ");
            }
            for(int j=0; j<stares; j++){
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
            stares++;
            number_of_lines++;
        }
    }
}
