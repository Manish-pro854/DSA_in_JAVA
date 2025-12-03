package Basics;

import java.util.Scanner;

public class Circle_Area_Perimeter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int pi = 3;
        int area = pi*radius*radius;
        int perimeter = 2*pi*radius;
        System.out.println(area);
        System.out.println(perimeter);
    }
}
