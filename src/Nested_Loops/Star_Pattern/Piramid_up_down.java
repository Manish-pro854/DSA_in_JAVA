package Nested_Loops.Star_Pattern;

import java.util.Scanner;

public class Piramid_up_down {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number_of_lines = 1;
        int stars = 1;
        int spaces = n-1;
        while(number_of_lines<=2*n-1){
            //print spaces
            for(int i=0; i<spaces; i++){
                System.out.print("  ");
            }
            //print stars
            for(int j=0; j<stars; j++){
                System.out.print("* ");
            }
            //prepare for next line
            System.out.println();
            if(number_of_lines<n){
                spaces--;
                stars=stars+2;
            }else{
                spaces++;
                stars=stars-2;
            }
            number_of_lines++;
        }
    }
}
