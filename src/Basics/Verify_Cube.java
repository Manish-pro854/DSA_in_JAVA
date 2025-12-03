package Basics;

import java.util.Scanner;

public class Verify_Cube {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long lhs = (long)Math.pow((a+b),3);
        long rhs = (long)(Math.pow(a,3)+Math.pow(b,3)+3*Math.pow(a,2)*b+3*a*Math.pow(b,2));
        System.out.println(lhs);
        System.out.println(rhs);
        if(lhs==rhs){
            System.out.println("VERIFIED");
        }else{
            System.out.println("NOT VERIFIED");
        }
    }
}
