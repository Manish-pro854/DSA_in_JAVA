package Java_Basics.Nested_Loops_Practice;

import java.util.Scanner;

public class Easy_Pattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number_of_lines = 0;
        int stars = 1;
        while(number_of_lines<n){
            for(int i=1; i<=stars; i++){
                System.out.print("*");
            }
            for(int i=1; i<=stars; i++){
                System.out.print(i);
            }
            System.out.println();
            number_of_lines++;
            stars++;
        }
    }
}
