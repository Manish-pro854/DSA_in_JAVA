package Nested_Loops.Character_Pattern;

import java.util.Scanner;

public class Print_Continuous_Character_Pattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int number_of_lines = 1;
        char ch = 'A';

        while(number_of_lines<=n){
            //print char
            for(int i=1; i<=number_of_lines; i++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            number_of_lines++;
        }
    }
}
