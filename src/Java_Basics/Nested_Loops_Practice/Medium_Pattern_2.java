package Java_Basics.Nested_Loops_Practice;

import java.util.Scanner;

public class Medium_Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number_of_lines = 0;
        int number = 1;
        int i=1;
        while(number_of_lines<n){
            for(i=1; i<=number; i++){
                System.out.print(number);
            }
            System.out.println();
            number_of_lines++;
            number++;
        }
    }
}
