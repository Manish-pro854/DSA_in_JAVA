package Nested_Loops;

import java.util.Scanner;

public class Staircase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number_of_lines = 1;
        int hashes = 1;
        int spaces = n-1;
        while(number_of_lines<=n){
            for(int i=0; i<spaces; i++){
                System.out.print(" ");
            }
            for(int j=0; j<hashes; j++){
                System.out.print("#");
            }
            System.out.println();
            spaces--;
            hashes++;
            number_of_lines++;
        }
    }
}
