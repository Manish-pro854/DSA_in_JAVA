package Nested_Loops.Star_Pattern;

import java.util.Scanner;

public class Right_Angle_Triangle_Stars {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curr_lines = 1;
        int total_lines = n;
        int stars = 1;
        int spaces = n-1;
        while(curr_lines<=total_lines) {
            //print stars
            for (int i = 0; i < stars; i++) {
                System.out.print("* ");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            //Prepare for next line
            System.out.println();
            stars++;
            spaces--;
            curr_lines++;
        }
    }
}
