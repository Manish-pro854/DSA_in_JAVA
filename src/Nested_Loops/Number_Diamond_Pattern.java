package Nested_Loops;

import java.util.Scanner;

public class Number_Diamond_Pattern {
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
            for(int j=1; j<=stars; j++){
                System.out.print(j+" ");
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
