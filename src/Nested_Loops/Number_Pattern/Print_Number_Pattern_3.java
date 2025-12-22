package Nested_Loops.Number_Pattern;

import java.util.Scanner;

public class Print_Number_Pattern_3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number_of_lines = 1;
        int a = 0;
        int b = 1;
        while(number_of_lines<=n){
            for(int i=1; i<=number_of_lines; i++){
                System.out.print(a+" ");
                int c = a+b;
                a=b;
                b=c;
            }
            System.out.println();
            number_of_lines++;
        }
    }
}
