package Conditionals;

import java.util.Arrays;
import java.util.Scanner;

public class Which_angled_triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] sides = {a,b,c};
        Arrays.sort(sides);
        if(sides[0]*sides[0]+sides[1]*sides[1]==sides[2]*sides[2]){
            System.out.println("2");
        } else if (sides[0]*sides[0]+sides[1]*sides[1]<sides[2]*sides[2]) {
            System.out.println("3");
        }else{
            System.out.println("1");
        }
    }
}
