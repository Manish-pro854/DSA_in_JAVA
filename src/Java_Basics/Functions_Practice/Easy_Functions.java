package Java_Basics.Functions_Practice;

import java.util.Scanner;

public class Easy_Functions {
    //Function to find area of a circle
    public static double area_of_circle(int r){
        double pi = 3.14;
        double area_of_circle = 2*pi*r;
        return area_of_circle;
    }
    //Function to find square of a number
    public static int square(int b){
        int square = b*b;
        return square;
    }
    //Function to check even or odd
    public static void even_odd(int a){
        if(a%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd Number");
        }
    }
    //Function to find sum of two numbers
    public static int add(int a, int b){
        int sum = a+b;
        return  sum;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();
//        System.out.println(add(a,b));
//        even_odd(a);
//        System.out.println(square(b));
        System.out.println(area_of_circle(r));
    }
}
