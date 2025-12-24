package Java_Basics;

import java.util.Scanner;

public class Largest_of_Two {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Both are equal");
        } else if (a>b) {
            System.out.println(a+" is larger than "+b);
        }else{
            System.out.println(b+" is larger than "+a);
        }
    }
}
