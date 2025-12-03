package Conditionals;

import java.util.Scanner;

public class Conditional_Problem_6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%2!=0 && b%2!=0){
            System.out.println("we are odd");
        }else{
            System.out.println("we are simple");
        }
    }
}
