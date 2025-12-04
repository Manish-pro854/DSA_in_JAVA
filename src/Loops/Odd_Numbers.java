package Loops;

import java.util.Scanner;

public class Odd_Numbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true){
            int num = sc.nextInt();
            count++;
            if(num%2 !=0){
                System.out.println(count);
                break;
            }
        }
    }
}
