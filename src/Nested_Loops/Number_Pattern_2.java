package Nested_Loops;

import java.util.Scanner;

public class Number_Pattern_2 {
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
            int number_to_print = 1;
            for(int j=1; j<=stars; j++){
                System.out.print(number_to_print+" ");
                if(j<=stars/2){
                    number_to_print++;
                }else{
                    number_to_print--;
                }
            }
            System.out.println();
            if(number_of_lines<n){
                spaces--;
                stars = stars+2;
            }else{
                spaces++;
                stars = stars-2;
            }
            number_of_lines++;
        }
    }
}
