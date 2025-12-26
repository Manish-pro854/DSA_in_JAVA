package Java_Basics.Simple_Math;

import java.util.Scanner;

public class Divisible_by_5_and_11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%5==0&&n%11==0){
            System.out.println(n+" is divisible by 5 or either 11");
        }else{
            System.out.println(n+" is not divisible by either 5 or nor 11");
        }
        sc.close();
    }
}
