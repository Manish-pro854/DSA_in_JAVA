package Nested_Loops;

import java.util.Scanner;

public class Number_Pattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number_of_lines = 1;
        int stars = 1;
        int spaces = n-1;
        while(number_of_lines<=n){
            for(int i=1; i<=stars; i++){
                System.out.print(i+" ");
            }
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            System.out.println();
            stars++;
            spaces--;
            number_of_lines++;
        }
    }
}
