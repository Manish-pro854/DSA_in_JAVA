package Java_Basics.Nested_Loops_Practice;

import java.util.Scanner;

public class Medium_Pattern_1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = n;
        int number_of_lines = 0;
        while(number_of_lines<n){
            for(int i=1; i<=stars; i++){
                System.out.print("* ");
            }
            System.out.println();
            number_of_lines++;
            stars--;
        }
    }
}
