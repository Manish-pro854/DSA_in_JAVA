package Nested_Loops;

import java.util.Scanner;

public class Ulta_Number_Pattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number_of_lines = 1;
        int number_to_print = 1;
        int stars = n;
        int spaces = 0;
        while(number_of_lines<=n){
            for(int j=0; j<spaces; j++){
                System.out.print("  ");
            }
            for(int i=1; i<=stars; i++){
                System.out.print(number_to_print+" ");
                number_to_print++;
            }
            System.out.println();
            stars--;
            spaces++;
            number_of_lines++;
        }
    }
}
