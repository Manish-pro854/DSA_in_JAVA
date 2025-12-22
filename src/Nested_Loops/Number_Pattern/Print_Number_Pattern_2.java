package Nested_Loops.Number_Pattern;

import java.util.Scanner;

public class Print_Number_Pattern_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number_of_lines = 1;
        int number = 1;
        while(number_of_lines<=n){
            for(int i=number; i>=1; i--){
                System.out.print(i);
            }
            System.out.println();
            number_of_lines++;
            number++;
        }
    }
}
